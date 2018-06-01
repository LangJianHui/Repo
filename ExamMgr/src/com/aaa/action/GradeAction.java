package com.aaa.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;
import com.aaa.service.GradeService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class GradeAction extends BaseAction {

	@Autowired
	private GradeService serv;
	
	private TabGrade grade;
	private Pager pager;
	
	
	public Pager getPager() {
		return pager;
	}


	public void setPager(Pager pager) {
		this.pager = pager;
	}


	public TabGrade getGrade() {
		return grade;
	}


	public void setGrade(TabGrade grade) {
		this.grade = grade;
	}


	public String findAll(){
		//初始化分页参数
		if(pager==null){
			pager=new Pager();
			pager.setCurPage(1);
		}
		pager.setPageSize(10);
		Pager p= serv.findAll(pager);
		this.getRequest().put("pager", p);
		return SUCCESS;
	}
	
	public String save(){
		serv.save(grade);
		return "save";
	}
	
	public String update(){
		serv.update(grade);
		return "update";
	}
	
	public String findById(){
		TabGrade g= serv.findById(grade.getTabGradeId());
		this.getRequest().put("grade", g);
		return "findById";
	}
	
	public void findGrade(){
		List<TabGrade> list= serv.findGrade();
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	
}

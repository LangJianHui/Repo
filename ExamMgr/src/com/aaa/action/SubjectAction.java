package com.aaa.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;
import com.aaa.entity.TabSubject;
import com.aaa.service.GradeService;
import com.aaa.service.SubjectService;

@Controller
public class SubjectAction extends BaseAction {

		@Autowired 
		private SubjectService subjectServ;
		@Autowired
		private GradeService gradeServ;
		
		private Pager pager;
		
		
		public Pager getPager() {
			return pager;
		}

		public void setPager(Pager pager) {
			this.pager = pager;
		}

		private TabSubject subject;//接受页面传递过来的参数

		public TabSubject getSubject() {
			return subject;
		}

		public void setSubject(TabSubject subject) {
			this.subject = subject;
		}
		
		public String save(){
			subjectServ.save(subject);
			return "save";
		}
		/**
		 * 在进行录入之前 查询年级数据
		 * @return
		 */
		public String findGrade(){
			Pager p= gradeServ.findAll(null);
			this.getRequest().put("list", p.getList());
			return "findGrade";
		}
		
		public String findAll(){
			if(pager==null)	pager=new Pager();
			Pager p=subjectServ.findAll(pager);
			this.getRequest().put("pager", p);
			return "findAll";
		}
	
	
}

package com.aaa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.aaa.entity.Houseinfo;
import com.aaa.entity.Housetype;
import com.aaa.entity.Pager;
import com.aaa.service.HouseService;
import com.aaa.service.HousetypeService;

import net.sf.json.JSONObject;

public class HouseAction extends BaseAction {
	private String target;
	
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

	private int curPage;
	
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	private List<Map> jsonList;
	
	public List<Map> getJsonList() {
		return jsonList;
	}
	public void setJsonList(List<Map> jsonList) {
		this.jsonList = jsonList;
	}

	private List<Houseinfo> houseList;
	
	public List<Houseinfo> getHouseList() {
		return houseList;
	}
	public void setHouseList(List<Houseinfo> houseList) {
		this.houseList = houseList;
	}

	private Houseinfo house1;
	
	public Houseinfo getHouse1() {
		return house1;
	}

	private Houseinfo house;
	
	private double min;
	private double max;
	
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}

	//初始化HouseService 业务逻辑类
	private HouseService service=new HouseService();
	private HousetypeService typeService=new HousetypeService();
	
	public Houseinfo getHouse() {
		return house;
	}
	//房屋信息：接受页面传递过来的数据
	public void setHouse(Houseinfo house) {
		this.house = house;
	}

	public String save(){
		//调用保存方法
		service.save(house);
		return "save";
	}
	
	public String query(){
		List<Houseinfo> list= service.query(house, min, max);
		getRequest().put("list", list);
		return "query_success";
	}
	
	public String queryAll(){
		List<Houseinfo> list= service.queryAll();
		System.out.println(list.size());
		getRequest().put("list", list);
		return "list_all";
	}
	
	public String select(){
		Houseinfo info=service.get(house.getId());
		getRequest().put("info", info);//查询房屋对象
		getRequest().put("types", typeService.queryAll());//存放所有类型信息
		return "select";
	}
	
	public String delete(){
		System.out.println(house.getId());
		service.delete(house.getId());
		return "delete";
	}
	
	public String update(){
		service.update(house);
		return "update";
	}
	
	public String addMany(){
		for (Houseinfo info : houseList) {
			System.out.println(info.getTitle()+"--"+info.getLinkman()+"--"+info.getHousetype().getId());
		}
		return null;
	}
	
	/**
	 * 返回json方式
	 * @return
	 * @throws IOException
	 */
	public String testJson0() throws IOException{
		//转换json字符串，输出到页面上
		JSONObject obj=JSONObject.fromObject(house1);
		getPrintWriter().write(obj.toString());
		return null;
	}
	
	/**
	 * 返回需要转换成json的数据
	 * @return
	 * @throws IOException
	 */
	public String testJson() throws IOException{
		jsonList=service.testJSON();
		houseList=service.queryAll();
		//System.out.println(houseList.size());
		return "json1";
	}
	
	public String queryByPages(){
		int pageSize=3;
		Pager pager= service.queryByPages(curPage, pageSize);
		target="pageList";
		getRequest().put("pager", pager);
		return "queryByPages";
	}
	

}

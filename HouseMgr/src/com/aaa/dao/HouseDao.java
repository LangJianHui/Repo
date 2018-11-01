package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Houseinfo;
import com.aaa.entity.Pager;

public interface HouseDao {
	/**
	 * ¼��
	 * @param info
	 */
	public void save(Houseinfo info);
	/**
	 * ��ѯ
	 * @param info
	 * @param min
	 * @param max
	 * @return
	 */
	public List<Houseinfo> query(Houseinfo info,double min,double max);
	
	public List<Houseinfo> queryAll();
	
	
	public Pager queryByPages(int curPage,int pageSize);
	
	/**
	 * ��ѯ�����ص�������
	 * @param id
	 * @return
	 */
	public Houseinfo get(int id);
	
	public void delete(int id);
	/**
	 * ��������
	 * @param info
	 */
	public void update(Houseinfo info);
	
	public List<Map> testJSON();
}

package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.GradeDao;
import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;
@Service
public class GradeServiceImpl implements GradeService {

	@Autowired
	private GradeDao gradeDao;//注入dao
	
	@Override
	public Pager findAll(Pager pager) {
		if(pager==null)//如果没有分页参数
		{
				return gradeDao.findAll();
		}
		return gradeDao.findAll(pager);

	}

	@Override
	public void save(TabGrade g) {
		if(g!=null){//如果不为空
			gradeDao.save(g);
		}
	}

	@Override
	public void update(TabGrade g) {
		if(g!=null){
			gradeDao.update(g);
		}

	}

	@Override
	public TabGrade findById(int id) {
		if(id>0){
			return gradeDao.findById(id);
		}
		return null;
	}

	@Override
	public List<TabGrade> findGrade() {
		// TODO Auto-generated method stub
		return gradeDao.findGrade();
	}



}

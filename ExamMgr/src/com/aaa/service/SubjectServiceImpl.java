package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.GradeDao;
import com.aaa.dao.SubjectDao;
import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;
import com.aaa.entity.TabSubject;
@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectDao subjectDao;//注入dao
	
	@Override
	public Pager findAll(Pager pager) {
		
		return null;
	
	}

	@Override
	public void save(TabSubject s) {
		if(s!=null){//如果不为空
			subjectDao.save(s);
		}
	}

	@Override
	public void update(TabSubject s) {
		if(s!=null){
			subjectDao.update(s);
		}

	}

	@Override
	public TabSubject findById(int id) {
		if(id>0){
			return subjectDao.findById(id);
		}
		return null;
	}

}

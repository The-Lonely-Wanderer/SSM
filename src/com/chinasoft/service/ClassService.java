package com.chinasoft.service;

import org.apache.ibatis.session.SqlSession;

import com.chinasoft.utli.SqlSessionFactorys;
import com.chinasofti.dao.ClassMapper;
import com.chinasofti.ssm.model.Class;

public class ClassService implements ClassMapper {
	private ClassMapper classMapper;
			SqlSession sqlSession;
	public ClassMapper getclassmapper(){
		sqlSession=SqlSessionFactorys.getsqlsession();
		classMapper=sqlSession.getMapper(ClassMapper.class);
		return classMapper;
	}


	@Override
	public int deleteByPrimaryKey(Integer classid) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int insert(Class record) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int insertSelective(Class record) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Class selectByPrimaryKey(Integer classid) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int updateByPrimaryKeySelective(Class record) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int updateByPrimaryKey(Class record) {
		// TODO Auto-generated method stub
		return 0;
	}		
			
			
}

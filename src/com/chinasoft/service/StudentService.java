package com.chinasoft.service;

import org.apache.ibatis.session.SqlSession;

import com.chinasoft.utli.SqlSessionFactorys;
import com.chinasofti.dao.StudentMapper;
import com.chinasofti.ssm.model.Student;

public class StudentService implements StudentMapper {

	private StudentMapper studentMapper;
			SqlSession sqlSession;
	public StudentMapper getstudentmapper(){
		sqlSession=SqlSessionFactorys.getsqlsession();
		studentMapper=sqlSession.getMapper(StudentMapper.class);
		return studentMapper;
	}
	@Override
	public int deleteByPrimaryKey(Integer userid) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insert(Student record) {
		// TODO Auto-generated method stub
		return getstudentmapper().insert(record);
	}
	@Override
	public int insertSelective(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Student selectByPrimaryKey(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int updateByPrimaryKeySelective(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateByPrimaryKey(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Student selectByUP(Student student) {
		return getstudentmapper().selectByUP(student);
	}	
}

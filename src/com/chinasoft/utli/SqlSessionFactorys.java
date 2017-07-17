package com.chinasoft.utli;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SqlSessionFactorys {
	private static SqlSession sqlSession;
	static{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) context.getBean("sqlSessionFactory");
		sqlSession=sqlSessionFactory.openSession(); 
	}
	public static SqlSession getsqlsession(){
		return sqlSession;
	}
	public void closesqlsession(){
		
		if(sqlSession!=null){
			sqlSession.close();
		}
	}
}

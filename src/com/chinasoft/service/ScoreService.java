package com.chinasoft.service;
import org.apache.ibatis.session.SqlSession;
import com.chinasoft.utli.SqlSessionFactorys;
import com.chinasofti.dao.ScoreMapper;
import com.chinasofti.ssm.model.Score;

public class ScoreService implements ScoreMapper {
	private ScoreMapper ScoreMapper;
			SqlSession SqlSession;
	public ScoreMapper getscoremapper(){
		SqlSession=SqlSessionFactorys.getsqlsession();
		ScoreMapper=SqlSession.getMapper(ScoreMapper.class);
		return ScoreMapper;
		
	}
	@Override
	public int deleteByPrimaryKey(Integer studentid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Score record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Score record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Score selectByPrimaryKey(Integer studentid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Score record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Score record) {
		// TODO Auto-generated method stub
		return 0;
	}

}

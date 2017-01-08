package dao.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import util.MyBatisUtil;
import dao.bean.user.User;
import dao.mappers.UserMapper;
import dao.user.UserDao;

public class UserDaoImpl implements UserDao{
	

	SqlSessionFactory sqlSessionFactory = null;
	
	
	
	public UserDaoImpl() {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.insertUser(user);
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
	}

	

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserByName(name);
            return user;
        } finally {
            sqlSession.close();
        }
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserListByName(String userName) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserListByName(userName);
            return userList;
        } finally {
            sqlSession.close();
        }
	}

	@Override
	public List<User> getUserListById(int userId) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserListById(userId);
            return userList;
        } finally {
            sqlSession.close();
        }
	}
	
	

}

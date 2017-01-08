package service.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import service.user.UserService;
import dao.bean.user.User;
import dao.user.UserDao;
import dao.user.impl.UserDaoImpl;

public class UserServiceImpl implements UserService{

	private static UserServiceImpl instance;
	SqlSessionFactory sqlSessionFactory = null;
	private UserDao userDao;
	
	public static UserServiceImpl getInstance() {
		if(instance == null) {
			synchronized(UserServiceImpl.class) {
				if(instance == null) {
					instance = new UserServiceImpl();
				}
			}
		}
		return instance;
	}
	
	private UserServiceImpl() {
		userDao = new UserDaoImpl();
	}
	
	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		userDao.createUser(user);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(name);
	}

	@Override
	public List<User> getUserListByName(String userName) {
		// TODO Auto-generated method stub
		return userDao.getUserListByName(userName);
	}

	@Override
	public List<User> getUserListById(int userId) {
		// TODO Auto-generated method stub
		return userDao.getUserListById(userId);
	}

}

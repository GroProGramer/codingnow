package dao.mappers;

import java.util.List;

import dao.bean.user.User;

public interface UserMapper {

	public void insertUser(User user);
	
	public User getUserByName(String userName);
	
	public List<User> getUserListByName(String userName);
	
	public List<User> getUserListById(int userId);
}

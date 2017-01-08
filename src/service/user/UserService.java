package service.user;

import java.util.List;

import dao.bean.user.User;

public interface UserService {
	
	public void createUser(User user);
	   
	public User getUserById(int id);
	   
	public User getUserByName(String name);
	
    public List<User> getUserListByName(String userName);
	
	public List<User> getUserListById(int userId);
}

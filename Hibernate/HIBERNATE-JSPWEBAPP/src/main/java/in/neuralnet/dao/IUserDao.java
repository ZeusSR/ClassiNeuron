package in.neuralnet.dao;

import java.util.List;

import in.neuralnet.beans.Users;

public interface IUserDao {
	
	 public void saveUser(Users user);
	 
	 public void updateUser(Users user);
	 
	 public void deleteUser(Integer uid);
	 
	 public Users getUser(Integer uid);
	 
	 public List < Users > getAllUser();


}

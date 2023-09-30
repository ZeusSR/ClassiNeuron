package in.neuralnet.service;

import java.util.List;

import in.neuralnet.beans.Users;

public interface IUserService {
	
	 public void saveUser(Users user);
	 
	 public void updateUser(Users user);
	 
	 public void deleteUser(Integer uid);
	 
	 public Users getUser(Integer uid);
	 
	 public List < Users > getAllUser();

}

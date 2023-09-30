package in.neuralnet.service;

import java.util.List;

import in.neuralnet.beans.Users;
import in.neuralnet.dao.IUserDao;
import in.neuralnet.factory.UserDaofactory;

public class UserServiceImpl implements IUserService {

	IUserDao userdao = null;
	
	@Override
	public void saveUser(Users user) {
		
		 userdao = UserDaofactory.getStudentDao();
		 userdao.saveUser(user);

	}

	@Override
	public void updateUser(Users user) {
		userdao = UserDaofactory.getStudentDao();
		 userdao.updateUser(user);

	}

	@Override
	public void deleteUser(Integer uid) {
		 userdao = UserDaofactory.getStudentDao();
		 userdao.deleteUser(uid);

	}

	@Override
	public Users getUser(Integer uid) {
		userdao = UserDaofactory.getStudentDao();
		 return userdao.getUser(uid);
	}

	@Override
	public List<Users> getAllUser() {
		 userdao = UserDaofactory.getStudentDao();
		 return userdao.getAllUser();
	}

}

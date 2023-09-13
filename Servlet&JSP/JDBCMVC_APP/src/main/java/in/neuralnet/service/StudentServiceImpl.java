package in.neuralnet.service;

import in.neuralnet.beans.Student;
import in.neuralnet.dao.IStudentDao;
import in.neuralnet.factory.StudentDaofactory;

public class StudentServiceImpl implements IStudentService {

	IStudentDao studendtdao;
	
	@Override
	public String save(Student student) {
		
		studendtdao = StudentDaofactory.getStudentDao();
		
		return studendtdao.save(student);
	}

	@Override
	public Student findById(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateById(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

}

package in.neuralnet.service;

import in.neuralnet.beans.Student;
import in.neuralnet.dao.IStudentDao;
import in.neuralnet.factory.StudentDaofactory;

public class StudentServiceImpl implements IStudentService {

	IStudentDao studendtdao = StudentDaofactory.getStudentDao();;
	
	@Override
	public String save(Student student) {
		
		
		
		return studendtdao.save(student);
	}

	@Override
	public Student findById(Integer sid) {
		
		 
		return studendtdao.findById(sid);
	}

	@Override
	public String updateById(Student student) {
		return studendtdao.updateById(student);
	}

	@Override
	public String deleteById(Integer sid) {
		return studendtdao.deleteById(sid);
	}

}

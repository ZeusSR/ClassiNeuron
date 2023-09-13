package in.neuralnet.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.neuralnet.beans.Student;
import in.neuralnet.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {

	Connection connection = null;
	
	@Override
	public String save(Student student) {
		
		System.out.println(student);
		String sqlscript = "INSERT INTO `student_temp`(``vch_sport`,`int_age`,`vch_name`,`vch_addr`)VALUES(?,?,?,?)";
		PreparedStatement ps = null;
		String Status = null;
		try {
			connection = JdbcUtil.getJdbcConnection();
			if(connection != null)
			{
				ps = connection.prepareStatement(sqlscript);
				if(ps != null)
				{
					
					ps.setString(1, student.getSsport());
					ps.setInt(2, student.getSage());
					ps.setString(3, student.getSname());
					ps.setString(4, student.getSaddr());
					
				}
				if(ps != null)
				{
					int row = ps.executeUpdate();
					
					if(row == 1)
					{
						Status = "Success";
					}
					else
					{
						Status = "Failure";
					}
					
				}
			}
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Status;
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

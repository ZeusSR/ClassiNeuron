package in.neuralnet.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.jdbc.PgStatement;

import in.neuralnet.beans.Student;
import in.neuralnet.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {

	Connection connection = null;
	Statement st = null;
	@Override
	public String save(Student student) {
		
		System.out.println(student);
		String sqlscript = "INSERT INTO student_temp (vch_sport, int_age, vch_name, vch_addr) VALUES (?, ?, ?, ?)";
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
		String sqlSelectQuery = "select int_id,vch_sport, int_age, vch_name, vch_addr from student_temp where int_id=?";
		PreparedStatement pstmt = null;
		Student student = null;
		try {
			connection = JdbcUtil.getJdbcConnection();
			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);
			if (pstmt != null) {
				pstmt.setInt(1, sid);
			}
			if (pstmt != null) {
				ResultSet resultSet = pstmt.executeQuery();

				if (resultSet.next()) {
					// copy the reusltSet data to StudentDTO and trasfer to the view
					student = new Student();

					
					student.setSid(resultSet.getInt(1));
					student.setSsport(resultSet.getString(2));
					student.setSage(resultSet.getInt(3));
					student.setSname(resultSet.getString(4));
					student.setSaddr(resultSet.getString(5));
					
				}
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		return student;
	}


	@Override
	public String updateById(Student student) {
		String sqlUpdateQuery = "update student_temp set vch_name=?,int_age=?,vch_addr=? where int_id = ?";
		PreparedStatement pstmt = null;
		String status = null;
		try {
			connection = JdbcUtil.getJdbcConnection();
			if (connection != null)
				pstmt = connection.prepareStatement(sqlUpdateQuery);
			if (pstmt != null) {
				pstmt.setString(1, student.getSname());
				pstmt.setInt(2, student.getSage());
				pstmt.setString(3, student.getSaddr());
				pstmt.setInt(4, student.getSid());
			}
			if (pstmt != null) {
				int rowAffected = pstmt.executeUpdate();
				if (rowAffected == 1) {
					status = "success";
				} else {
					status = "failure";
				}
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
			status = "failure";
		}
		return status;
	}

	@Override
	public String deleteById(Integer sid) {
		String sqlDeleteQuery = "delete from student_temp where int_id = ? ";
		PreparedStatement pstmt = null;
		String status = null;
		try {
			Student student = findById(sid);
			if (student != null) {

				connection = JdbcUtil.getJdbcConnection();
				if (connection != null)
					pstmt = connection.prepareStatement(sqlDeleteQuery);
				if (pstmt != null)
					pstmt.setInt(1, sid);

				if (pstmt != null) {
					int rowAffected = pstmt.executeUpdate();
					if (rowAffected == 1)
						status = "success";
				}
			} else {
				status = "failure";
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
			status = "failure";
		}
		return status;
	}

}

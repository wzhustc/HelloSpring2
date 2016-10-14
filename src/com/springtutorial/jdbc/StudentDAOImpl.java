package com.springtutorial.jdbc;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl implements StudentDAO {
	
	private DataSource dataSource;
	
	private JdbcTemplate JdbcTemplate;
	
	//dataSource setter method
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.JdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age) {
		String sql = "insert into Student (name, age) values(?,?)";
		JdbcTemplate.update(sql, name,age);
		System.out.println("create record name : " + name + "Age : " + age);
	}

	@Override
	public Student selectStudentByName(String name) {
		String sql = "select * from Student where name = ?";
		Student student = JdbcTemplate.queryForObject(sql, new Object[]{name}, new StudentMapper());
		return student;
	}

	@Override
	public Student selectStudentById(Integer id) {
		String sql = "select * from Student where id = ?";
		Student student = JdbcTemplate.queryForObject(sql, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String sql = "select * from Student";
		List<Student> stuList = JdbcTemplate.query(sql, new StudentMapper());
		return stuList;
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from Student where id = ?";
		JdbcTemplate.update(sql, id);
		System.out.println("deleted record with id = " + id);
	}

	@Override
	public void update(Integer id, Integer age) {
		String sql = "update Student set age = ? where id = ?";
		JdbcTemplate.update(sql, age, id);
		System.out.println("update record with id = " + id);
	}

}

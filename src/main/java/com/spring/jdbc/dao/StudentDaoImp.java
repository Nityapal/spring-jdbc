package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImp implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query= "insert into student(id,name,city) values(?,?,?)";
		int r= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	

}

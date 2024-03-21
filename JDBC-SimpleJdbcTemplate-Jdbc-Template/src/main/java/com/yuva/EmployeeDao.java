package com.yuva;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Employee e) {
/*		String query = "update employee set name=? where id=?";
		return jdbcTemplate.update(query, e.getName(), e.getId()); */

		String query = "update employee set name=?,salary=? where id=?";
		return jdbcTemplate.update(query, e.getName(), e.getSalary(), e.getId());
	}
}

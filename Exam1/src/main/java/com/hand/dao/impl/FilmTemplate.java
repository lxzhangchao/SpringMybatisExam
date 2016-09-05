package com.hand.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hand.dao.FilmDao;

public class FilmTemplate implements FilmDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject; 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void create(String title, String description ,int language_id) {
		String SQL = "insert into Film (title, description ,language_id) values (?,?,?)";     
		jdbcTemplateObject.update( SQL, title, description ,language_id);
		//System.out.println("Created Record Name = " + name + " Age = " + age);
		return;
	}

}
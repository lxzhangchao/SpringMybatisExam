package com.hand.dao;

import javax.sql.DataSource;

public interface FilmDao {
	/** 
	 * This is the method to be used to initialize
	 * database resources ie. connection.
	 */
	public void setDataSource(DataSource ds);
	/** 
	 * This is the method to be used to create
	 * a record in the Student table.
	 */
	public void create(String title, String description ,int language_id);
}
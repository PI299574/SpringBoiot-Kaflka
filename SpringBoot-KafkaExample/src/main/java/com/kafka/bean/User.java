package com.kafka.bean;

public class User {

	String id;
	String name;
	String dept;
	String sal;

	public User() {

	}

	public User(String id, String name, String dept, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @return the sal
	 */
	public String getSal() {
		return sal;
	}

	/**
	 * @param sal the sal to set
	 */
	public void setSal(String sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}

}

package com.example.demo.domain;

/**
 * ユーザーDomain.
 * 
 * @author kazuki.hirayama
 *
 */
public class User {
	/**
	 * ユーザー識別ID,PKです.
	 */
	private Integer id;
	/**
	 * ユーザー名.
	 */
	private String name;

	public User() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

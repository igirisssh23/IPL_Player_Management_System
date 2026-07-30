package com.tka.entity;

public class Player {

	private int pid;
	private String pname;
	private int age;
	private String teamName;
	private String role;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", age=" + age + ", teamName=" + teamName + ", role=" + role
				+ "]";
	}

	public Player(int pid, String pname, int age, String teamName, String role) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.teamName = teamName;
		this.role = role;

	}

}

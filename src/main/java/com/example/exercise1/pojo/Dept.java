package com.example.exercise1.pojo;

import java.util.ArrayList;
import java.util.List;

public class Dept {

	private int deptId;
	private String deptName;
	private String deptAddress;
	private List<Emp> list=new ArrayList<Emp>();
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	public List<Emp> getList() {
		return list;
	}
	public void setList(List<Emp> list) {
		this.list = list;
	}
	public Dept(int deptId, String deptName, String deptAddress, List<Emp> list) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
		this.list = list;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

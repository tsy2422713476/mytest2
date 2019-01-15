package com.example.exercise1.pojo;

import java.sql.Date;

public class Emp {

	private int empId;			//员工编号
	private int deptId;			//所属部门编号
	private String empName;		//员工名称
	private String empWork;		//工作岗位
	private Double empWage;		//入职工资
	private Date empDate;		//入职日期
	private Double empBonus;		//奖金
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpWork() {
		return empWork;
	}
	public void setEmpWork(String empWork) {
		this.empWork = empWork;
	}
	public Double getEmpWage() {
		return empWage;
	}
	public void setEmpWage(Double empWage) {
		this.empWage = empWage;
	}
	public Date getEmpDate() {
		return empDate;
	}
	public void setEmpDate(Date empDate) {
		this.empDate = empDate;
	}
	public Double getEmpBonus() {
		return empBonus;
	}
	public void setEmpBonus(Double empBonus) {
		this.empBonus = empBonus;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empId, int deptId, String empName, String empWork, Double empWage, Date empDate, Double empBonus) {
		super();
		this.empId = empId;
		this.deptId = deptId;
		this.empName = empName;
		this.empWork = empWork;
		this.empWage = empWage;
		this.empDate = empDate;
		this.empBonus = empBonus;
	}
	
	
	
	
}

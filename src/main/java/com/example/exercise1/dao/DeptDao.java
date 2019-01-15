package com.example.exercise1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.exercise1.pojo.Dept;
import com.example.exercise1.pojo.Emp;

public interface DeptDao {

	/**
	 * 
	 * 
	 * @title: selectAll
	 * @date:2018年12月14日 @time:下午3:16:23
	 * @return
	 * @description:查询所有的部门
	 */
	public List<Dept> selectAll();
	
	/**
	 * 
	 * @title: removeEmp
	 * @date:2018年12月14日 @time:下午3:17:19
	 * @param empId
	 * @return
	 * @description:删除员工
	 */
	public int removeEmp(@Param("empId")int empId);
	
	
	/**
	 * 
	 * @title: selectEmp
	 * @date:2018年12月14日 @time:下午4:28:52
	 * @param deptId
	 * @return
	 * @description:查询所有的员工
	 */
	public List<Emp> selectEmp(@Param("deptId")int deptId);
	
	
	/**
	 * 
	 * @title: selectEmpCount
	 * @date:2018年12月14日 @time:下午4:53:29
	 * @param deptId
	 * @return
	 * @description:统计部门员工人数
	 */
	public int selectEmpCount(@Param("deptId")int deptId);
	
}

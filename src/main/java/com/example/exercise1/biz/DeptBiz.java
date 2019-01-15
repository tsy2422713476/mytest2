package com.example.exercise1.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.exercise1.dao.DeptDao;
import com.example.exercise1.pojo.Dept;
import com.example.exercise1.pojo.Emp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:DeptBiz.java
 * @date:2018年12月14日 @time:下午3:18:41
 * @description:逻辑操作类
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DeptBiz {

	@Autowired
	private DeptDao dao;
	

	/**
	 * 
	 * 
	 * @title: selectAll
	 * @date:2018年12月14日 @time:下午3:16:23
	 * @return
	 * @description:查询所有的部门并且包含里面的员工
	 */
	public PageInfo<Dept> selectAll(int pageNum,int pageSize){
		
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<Dept>(dao.selectAll());
		
	}
	
	
	
	
	/**
	 * 
	 * @title: removeEmp
	 * @date:2018年12月14日 @time:下午3:17:19
	 * @param empId
	 * @return
	 * @description:删除员工
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeEmp(int empId) {
		return dao.removeEmp(empId);
	}
	
	
	
	/**
	 * 
	 * @title: selectEmp
	 * @date:2018年12月14日 @time:下午4:28:52
	 * @param deptId
	 * @return
	 * @description:查询所有的员工
	 */
	public List<Emp> selectEmp(int deptId){
		return dao.selectEmp(deptId);
	}
	
	
	/**
	 * 
	 * @title: selectEmpCount
	 * @date:2018年12月14日 @time:下午4:53:29
	 * @param deptId
	 * @return
	 * @description:统计部门员工人数
	 */
	public int selectEmpCount(int deptId) {
		return dao.selectEmpCount(deptId);
	}
	
}

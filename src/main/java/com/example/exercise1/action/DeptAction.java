package com.example.exercise1.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercise1.biz.DeptBiz;
import com.example.exercise1.pojo.Dept;
import com.example.exercise1.pojo.Emp;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api")
public class DeptAction {

	@Autowired
	private DeptBiz biz;
	
	@GetMapping("selectAll/{pageNum}")
	public PageInfo<Dept> selectAll(@PathVariable int pageNum) {
		
		int pagenum=1;
		int pagesize=2;
		
		if(pageNum!=0) {
			pagenum=pageNum;
		}
		
		return biz.selectAll(pagenum, pagesize);
		
	}
	
	@GetMapping("selectEmp/{deptId}")
	public List<Emp> selectEmp(@PathVariable int deptId) {
		
		return biz.selectEmp(deptId);
		
	}
	
	
	
	@DeleteMapping("deleteEmp/{empId}/{deptId}")
	public Map<String, String> remove(@PathVariable int empId,@PathVariable int deptId) {
		Map<String, String> rs = new HashMap<String, String>();
		biz.removeEmp(empId);
		rs.put("code", "200");
		rs.put("msg", "ok");
		rs.put("count",biz.selectEmpCount(deptId)+"");
		return rs;
	}
	
	
	
	@GetMapping("selectCountEmp/{deptId}")
	public String selectCountEmp(@PathVariable int deptId) {
		
		System.out.println("---------------"+deptId+"---------------"+biz.selectEmpCount(deptId));
		
		return biz.selectEmpCount(deptId)+"";
	}
	
	
	
	
	
}

package com.example.exercise1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.exercise1.biz.DeptBiz;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootExercise1ApplicationTests {

	@Autowired
	private DeptBiz biz;
	
	@Test
	public void contextLoads() {
		int i=biz.selectEmpCount(1);
		
		System.out.println(i);
	}

}


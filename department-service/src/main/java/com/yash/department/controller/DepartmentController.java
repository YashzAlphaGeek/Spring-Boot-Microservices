/**
 * 
 */
package com.yash.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.department.entity.Department;
import com.yash.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Yashwanth
 *
 */
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/create")
	public Department saveDepartment(@RequestBody Department department)
	{
		log.info("Inside saveDepartment method of Department Controller");
		return departmentService.saveDepartment(department);
	}
	
	
	@GetMapping("/depId/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId)
	{
		log.info("Inside findDepartment method of Department Controller");
		return departmentService.findDepartmentById(departmentId);
	}

}

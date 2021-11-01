/**
 * 
 */
package com.yash.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.department.entity.Department;
import com.yash.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Yashwanth
 *
 */
@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	/**
	 * @param department
	 * @return
	 */
	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of Department Service:"+department);
		return departmentRepository.save(department);
	}

	/**
	 * @param departmentId
	 * @return
	 */
	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById method of Department Service:"+departmentId);
		return departmentRepository.findByDepartmentId(departmentId);
	}

}

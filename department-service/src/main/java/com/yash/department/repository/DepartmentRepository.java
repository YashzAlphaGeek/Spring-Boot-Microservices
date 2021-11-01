/**
 * 
 */
package com.yash.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.department.entity.Department;

/**
 * @author Yashwanth
 *
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	/**
	 * @param departmentId
	 * @return
	 */
	public Department findByDepartmentId(Long departmentId);

}

/**
 * 
 */
package com.yash.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.yash.user.entity.User;
import com.yash.user.repository.UserRepository;
import com.yash.user.vo.Department;
import com.yash.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Yashwanth
 *
 */
@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * @param user
	 * @return
	 */
	public User saveUser(User user) {
		log.info("Inside saveUser method of User Service:"+user);
		return userRepository.save(user);
	}

	/**
	 * @param userId
	 * @return
	 */
	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartmentId method of User Service:"+userId);
		ResponseTemplateVO vo= new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/depId/"+user.getDepartmentId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}

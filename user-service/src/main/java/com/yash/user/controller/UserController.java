/**
 * 
 */
package com.yash.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.user.entity.User;
import com.yash.user.service.UserService;
import com.yash.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Yashwanth
 *
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public User saveUser(@RequestBody User user)
	{
		log.info("Inside saveUser method of User Controller");
		return userService.saveUser(user);
	}
	
	@GetMapping("/userId/{userId}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") Long userId)
	{
		return userService.getUserWithDepartment(userId);
	}
	

}

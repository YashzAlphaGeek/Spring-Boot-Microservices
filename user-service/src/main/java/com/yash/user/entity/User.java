/**
 * 
 */
package com.yash.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yashwanth
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private Long userId;
	private String userName;
	private String emailId;
	private Long departmentId;

}

/**
 * 
 */
package com.yash.user.vo;

import com.yash.user.entity.User;

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
public class ResponseTemplateVO {
	
	private User user;
	private Department department;

}

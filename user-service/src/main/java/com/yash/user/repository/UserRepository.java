/**
 * 
 */
package com.yash.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.user.entity.User;

/**
 * @author Yashwanth
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * @param userId
	 * @return
	 */
	public User findByUserId(Long userId);

}

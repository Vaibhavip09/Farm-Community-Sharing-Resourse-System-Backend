
package com.FarmSharingResourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.FarmSharingResourse.model.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> {
	 Login findByUsernameAndPassword(String username, String password);
}

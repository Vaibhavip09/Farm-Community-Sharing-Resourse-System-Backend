package com.FarmSharingResourse.serviceimp;

import org.springframework.stereotype.Service;

import com.FarmSharingResourse.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	 private final String ADMIN_USERNAME = "admin";
	 private final String ADMIN_PASSWORD = "admin963";

	@Override
	public boolean authenticate(String username, String password) {
		 System.out.println("Authenticate called with username = " + username + ", password = " + password);
		    return true;
	}

}

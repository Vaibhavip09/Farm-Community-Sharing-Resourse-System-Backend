package com.FarmSharingResourse.service;

import java.util.List;

import com.FarmSharingResourse.model.JoinRequest;


public interface JoinRequestService {
	 JoinRequest saveRequest(JoinRequest request);
	    List<JoinRequest> getAllRequests();
	    JoinRequest updateStatus(Long id, String status);
	    void deleteRequest(Long id);
}

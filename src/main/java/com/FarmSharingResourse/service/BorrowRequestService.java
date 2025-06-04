package com.FarmSharingResourse.service;

import java.util.List;

import com.FarmSharingResourse.model.BorrowRequest;

public interface BorrowRequestService {

	 BorrowRequest createBorrowRequest(BorrowRequest request);

	List<BorrowRequest> findAll();

	List<BorrowRequest> findByUserName(String username);
	
}

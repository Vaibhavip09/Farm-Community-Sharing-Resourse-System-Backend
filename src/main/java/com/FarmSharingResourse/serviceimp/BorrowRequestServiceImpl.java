package com.FarmSharingResourse.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FarmSharingResourse.model.BorrowRequest;
import com.FarmSharingResourse.repository.BorrowRequestRepository;
import com.FarmSharingResourse.repository.BorrowRequestRepository;
import com.FarmSharingResourse.service.BorrowRequestService;

@Service
public class BorrowRequestServiceImpl implements BorrowRequestService {
	
	
	 @Autowired
	    private BorrowRequestRepository borrowRequestRepo;

	@Override
	public BorrowRequest createBorrowRequest(BorrowRequest request) {
		
		return borrowRequestRepo.save(request);
	}

}

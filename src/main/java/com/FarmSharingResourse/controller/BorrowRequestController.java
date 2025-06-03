package com.FarmSharingResourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.FarmSharingResourse.model.BorrowRequest;
import com.FarmSharingResourse.service.BorrowRequestService;

@RestController
@RequestMapping("/borrow")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class BorrowRequestController {

	@Autowired
	private BorrowRequestService brs;
	
	@PostMapping("/request")
	public BorrowRequest submitRequest(@RequestBody BorrowRequest request) {
		
		return brs.createBorrowRequest(request);
	}
	
}

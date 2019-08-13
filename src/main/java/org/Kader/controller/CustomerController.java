package org.Kader.controller;

import org.Kader.service.UploadCSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private UploadCSV uploadCSV;
	
	@RequestMapping("/saveCustomer")
	public void saveCutomerUpload() throws Exception {
		 uploadCSV.saveCustomerData();
		
	} 

}

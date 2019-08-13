package org.Kader.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.Kader.entities.Customer;
import org.Kader.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadCSV {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	 String line="";
	public void saveCustomerData() throws Exception {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("src/main/resources/customer.csv"));
			while ((line = br.readLine())!=null) {
				String[]data=line.split(",");
				Customer c=new Customer();
				c.setName(data[0]);
				c.setIssue(data[1]);
				c.setIssueId(data[2]);
				c.setAge(data[3]);
				customerRepository.save(c);
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

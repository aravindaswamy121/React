package com.capg.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.customer.entities.Customer;
import com.capg.customer.serviece.ICustomerServiece;


@RestController
@RequestMapping("/api/cust")
	
public class CustomerController {
	
	
	@Autowired
	ICustomerServiece serviece;
	
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody  Customer cust) {
		return serviece.addCustomer(cust);
	}
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer cust) {
		return serviece.updateCustomer(cust);
	}
	@GetMapping("/Get")
	public  ResponseEntity<List> getAllCustomers(){
		
		List<Customer> list = serviece.getAllCustomers();
		
			return new ResponseEntity<List>(list,HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<String>  deleteCustomerById(@PathVariable int id) {
		
		
		serviece.deleteCustomerById(id);
		
		return new ResponseEntity<String>("Employee Deleted", HttpStatus.OK);
	
	
	}
	

}

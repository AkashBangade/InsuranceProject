package com.mpha.SpringBootExample.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpha.SpringBootExample.entity.Customer;
import com.mpha.SpringBootExample.exception.CustomerNotFoundException;
import com.mpha.SpringBootExample.service.CustomerService;


//@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerServiceImpl;

	static Logger logger = LoggerFactory.getLogger(Customer.class);
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		
		logger.info("CustomerController - saveCustomer");
		return ResponseEntity.ok(customerServiceImpl.saveCustomer(customer));	
	}
	
	@GetMapping("/getCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		
		logger.info("CustomerController - getAllCustomer");
		return ResponseEntity.ok(customerServiceImpl.getAllCustomer());
	}	
	
	@GetMapping("/getCustomer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) throws CustomerNotFoundException{
		
		logger.info("CustomerController - getCustomerById");
		return ResponseEntity.ok(customerServiceImpl.getCustomerById(id));
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public ResponseEntity<String> deleteCustomerById(@PathVariable Long id) throws CustomerNotFoundException{
		
		logger.info("CustomerController - deleteCustomerById");
		customerServiceImpl.deleteCustomerById(id);
		return ResponseEntity.ok("Given Customer Id record deleted successfully..!");
	}
	
	@PutMapping("/updateCustomer/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer ) throws CustomerNotFoundException{
		
		logger.info("CustomerController - updateCustomer");
		return ResponseEntity.ok(customerServiceImpl.editCustomerById(id, customer));
	}
	
}

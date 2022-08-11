package com.mpha.SpringBootExample.service;

import java.util.List;

import com.mpha.SpringBootExample.entity.Customer;
import com.mpha.SpringBootExample.exception.CustomerNotFoundException;



/**
 * @author Akash
 *
 */

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	
	public List<Customer> getAllCustomer();
	
	public Customer getCustomerById(Long id) throws CustomerNotFoundException;

	public void deleteCustomerById(Long id) throws CustomerNotFoundException;

	public Customer editCustomerById(Long id, Customer customer) throws CustomerNotFoundException;

}
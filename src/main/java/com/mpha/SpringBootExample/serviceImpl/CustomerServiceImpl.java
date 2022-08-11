package com.mpha.SpringBootExample.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpha.SpringBootExample.entity.Customer;
import com.mpha.SpringBootExample.exception.CustomerNotFoundException;
import com.mpha.SpringBootExample.repository.CustomerRepository;
import com.mpha.SpringBootExample.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;
	
	static Logger logger = LoggerFactory.getLogger(Customer.class);

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		logger.info("CustomerServiceImpl - saveCustomer");
		
		customerRepository.save(customer);
		
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		logger.info("CustomerServiceImpl - getCustomerById");
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(Long id) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		
		logger.info("CustomerServiceImpl - getCustomerById");
		
		Optional<Customer> optional = customerRepository.findById(id);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new CustomerNotFoundException("No Customer exist for given Id");
		}
	}

	public void deleteCustomerById(Long id) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		
		logger.info("CustomerServiceImpl - deleteCustomerById");
		
		Optional<Customer> optional = customerRepository.findById(id);
		if (optional.isPresent()) {
			customerRepository.deleteById(id);
		} else {
			throw new CustomerNotFoundException("No Customer exist for given Id");
		}
	}

	@Override
	public Customer editCustomerById(Long id, Customer customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		
		logger.info("CustomerServiceImpl - editCustomerById");
		
		Optional<Customer> optional = customerRepository.findById(id);
		Customer cust = null;
 		if(optional.isPresent()) {
			cust = optional.get();
			if(cust!=null) {
				cust.setBloodGroup(customer.getBloodGroup());
				cust.setContact(customer.getContact());
				cust.setDOB(customer.getDOB());
				cust.setEmailAddress(customer.getEmailAddress());
				cust.setHeight(customer.getHeight());
				cust.setId(customer.getId());
				cust.setMark(customer.getMark());
				cust.setUserAddress(customer.getUserAddress());
				cust.setUserName(customer.getUserName());
				
				customerRepository.save(cust);
			}
			return cust;
		}else {
			throw new CustomerNotFoundException("No Customer Exist for given Id...!!!");
		}
	}
}

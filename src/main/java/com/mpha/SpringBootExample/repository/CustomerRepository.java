package com.mpha.SpringBootExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpha.SpringBootExample.entity.Customer;

/**
 * @author Akash
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	

}
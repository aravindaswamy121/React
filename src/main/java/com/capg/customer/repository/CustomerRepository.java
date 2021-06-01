package com.capg.customer.repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.customer.entities.Customer;
import com.sun.xml.bind.v2.model.core.ID;


public interface CustomerRepository  extends JpaRepository<Customer, Integer>{
	
	

	//public Customer findByCustomer(String cname);

	public List<Customer> findByAmount(double amount);

	public List<Customer> findByAmountGreaterThan(double amount);

	
			@Query("from Customer where amount = ?1  order by cname")  //JPQL Query
		public List<Customer>  getCusBySortedAmt(double amount);

			
	
	
}
	



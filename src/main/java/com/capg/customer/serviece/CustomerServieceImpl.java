package com.capg.customer.serviece;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.customer.entities.Customer;
import com.capg.customer.repository.CustomerRepository;


@Service
public class CustomerServieceImpl  implements ICustomerServiece {

	@Autowired
	CustomerRepository repo;

	
	
	@Override
	public Customer addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return repo.save(cust);
	}

	@Override
	public Customer updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return repo.save(cust);
	}

	@Override
	public Customer getCustomerById(int cid) {
		// TODO Auto-generated method stub
		return repo.findById(cid).orElse(new Customer());
	}

	@Override
	public void deleteCustomerById(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

//	@Override
//	public Customer getCustomerByName(String name) {
//		// TODO Auto-generated method stub
//		return repo.findByCustomer(name);
//	}

	@Override
	public List<Customer> getCustomersByAmount(double amount) {
		// TODO Auto-generated method stub
		return repo.findByAmount(amount);
	}

	@Override
	public List<Customer> getCustomersGTS(double amount) {
		// TODO Auto-generated method stub
		return repo.findByAmountGreaterThan(amount);
	}

	@Override
	public List<Customer> getCustBySortedAmt(double amount) {
		// TODO Auto-generated method stub
		return repo.getCusBySortedAmt(amount);
	}


	
	

	
	
	
	
	
}

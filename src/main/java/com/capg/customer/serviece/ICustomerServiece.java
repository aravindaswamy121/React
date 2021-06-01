package com.capg.customer.serviece;

import java.util.List;

import com.capg.customer.entities.Customer;
import com.sun.xml.bind.v2.model.core.ID;

public interface ICustomerServiece {
	
	
	

	public Customer  addCustomer(Customer cust); 
	
	public Customer  updateCustomer(Customer cust); 
	
	public Customer  getCustomerById(int cid); 
	
	public void   deleteCustomerById(int cid);


	public    List<Customer>     getAllCustomers();
	

//	public Customer  getCustomerByName(String name);
	
	public  List<Customer>  getCustomersByAmount(double amount);
	
	public  List<Customer>  getCustomersGTS(double amount);
	
	public List<Customer>  getCustBySortedAmt(double amount);
	

}

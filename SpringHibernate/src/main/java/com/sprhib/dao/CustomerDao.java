package com.sprhib.dao;

import java.util.List;

import com.sprhib.model.Customer;

public interface CustomerDao {

	public List listAllCustomers();

	public void saveOrUpdate(Customer customer);

	public Customer findCustomerById(int id);

	public void deleteCustomer(int id);

}

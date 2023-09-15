package com.insurence.healthinsurence.repository;

import java.util.List;

import com.insurence.healthinsurence.modals.Customer;
import com.insurence.healthinsurence.modals.InsurencePackages;
import com.insurence.healthinsurence.modals.Users;

public interface InsurenceRepository {
	public List<Customer> getAllCustomers();

	public List<InsurencePackages> getAllPackages();

	public int addUser(Customer c);

	public int registerUser(Users u);
}

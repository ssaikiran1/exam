package com.insurence.healthinsurence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.insurence.healthinsurence.modals.Customer;
import com.insurence.healthinsurence.modals.InsurencePackages;
import com.insurence.healthinsurence.modals.Users;
import com.insurence.healthinsurence.repository.InsurenceRepository;

@RestController
public class BaseController {
	public InsurenceRepository rs;

	@Autowired
	public BaseController(InsurenceRepository rs) {
		this.rs = rs;
	}

	@GetMapping(value = "/start")
	public List<Customer> allCustomer() {
		return rs.getAllCustomers();
	}

	@GetMapping(value = "/allpacks")
	public List<InsurencePackages> allPackages() {
		return rs.getAllPackages();
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public void add(@RequestBody Customer c) {
		int x = rs.addUser(c);
		System.out.println(x);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void adduser(@RequestBody Users u) {
		int x = rs.registerUser(u);
		System.out.println("registered user" + x);
	}
}

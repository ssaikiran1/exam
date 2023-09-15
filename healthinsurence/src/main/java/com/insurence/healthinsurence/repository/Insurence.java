package com.insurence.healthinsurence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.insurence.healthinsurence.modals.Customer;
import com.insurence.healthinsurence.modals.CustomerRowMapper;
import com.insurence.healthinsurence.modals.InsurencePackages;
import com.insurence.healthinsurence.modals.InsurencePackagesRowMapper;
import com.insurence.healthinsurence.modals.Users;

@Repository
public class Insurence implements InsurenceRepository {

	public JdbcTemplate jd;

	@Autowired
	public Insurence(JdbcTemplate jd) {
		this.jd = jd;

	}

	@Override
	public List<Customer> getAllCustomers() {

		return jd.query("select * from sai_customers", new CustomerRowMapper());
	}

	@Override
	public List<InsurencePackages> getAllPackages() {
		return jd.query("select * from sai_InsurancePackages", new InsurencePackagesRowMapper());
	}

	@Override
	public int addUser(Customer c) {

		return jd.update(
				"insert into sai_customers (cust_fname,cust_lname,cust_dob,cust_address,cust_gender,cust_aadhar) values(?,?,?,?,?,?)",
				c.getFirstName(), c.getLastName(), c.getDateOfBirth(), c.getAddress(), c.getGender(),
				c.getAadharNumber());

	}

	@Override
	public int registerUser(Users u) {

		return jd.update("insert into sai_Users (user_name,user_pwd,user_type) values (?,?,?)", u.getUser_name(),
				u.getUser_pwd(), u.getUser_type());

	}

}

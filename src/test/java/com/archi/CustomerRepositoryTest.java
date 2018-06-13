package com.archi;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.archi.models.Customers;
import com.archi.repositories.CustomerRepository;

@DataJpaTest
public class CustomerRepositoryTest extends SpringBootApplicationTests {
	
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testSaveCustomers() {
		Customers customer = getCustomers();
		Customers cusSavedInDB = entityManager.persist(customer);
		Customers getDataFromDb = customerRepository.findOne(cusSavedInDB.getCid());
		 assertThat(getDataFromDb, is(cusSavedInDB));
		 
	}
	
	private Customers getCustomers() {
		Customers customer = new Customers();
		customer.setCemail("abc@gmail.com");
		customer.setCid(34);
		customer.setcName("Tom");
		customer.setCphone(23198455);
		return customer;
	}
}

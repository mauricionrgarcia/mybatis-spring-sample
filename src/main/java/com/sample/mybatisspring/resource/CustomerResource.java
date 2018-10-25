package com.sample.mybatisspring.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.mybatisspring.service.CustomerService;
import com.sample.mybatisspring.service.dto.CustomerDTO;
import com.sample.mybatisspring.service.pageable.PageWrapper;

/**
 * REST controller - CustomerDTO
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 23/09/2018 21:41:09
 */
@RestController
@RequestMapping("/customer")
public class CustomerResource {

	private static final Logger log = LoggerFactory.getLogger(CustomerResource.class);

	@Autowired
	private CustomerService customerService;

	/**
	 * get a {@link CustomerDTO} from:
	 * 
	 * @param id identifier
	 * @return CustomerPadraop
	 */
	@GetMapping("/{id}")
	public CustomerDTO getCustomer(@PathVariable("id") Long id) {
		log.info("Request to find 'CustomerDTO' from identifier: {} ", id);
		return this.customerService.getCustomer(id);
	}

	/**
	 * get all {@link CustomerDTO} from:
	 * 
	 * @return CustomerPadraop
	 */
	@GetMapping()
	public PageWrapper<CustomerDTO> getCustomers() {
		log.info("Request to find 'CustomerDTO'");
		return this.customerService.getCustomers();
	}
}
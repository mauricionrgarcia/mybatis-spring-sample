package com.sample.mybatisspring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.mybatisspring.ibatis.mapper.CustomerMapper;
import com.sample.mybatisspring.service.dto.CustomerDTO;
import com.sample.mybatisspring.service.pageable.PageRequest;
import com.sample.mybatisspring.service.pageable.PageWrapper;

/**
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 23/09/2018 21:41:36
 */
@Service
public class CustomerService {

	private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

	@Autowired
	private CustomerMapper customerMapper;

	/**
	 * get a {@link CustomerDTO} from:
	 * 
	 * @param id CustomerDTO
	 * @return CustomerDTO
	 */
	public CustomerDTO getCustomer(Long id) {
		log.info("Service to find 'CustomerDTO' from code: {} ", id);

		CustomerFilter filter = new CustomerFilter();
		filter.setId(id);
		return this.customerMapper.getCustomer(filter);
	}

	/**
	 * @return Page Wrapper
	 */
	public PageWrapper<CustomerDTO> getCustomers() {
		log.info("Service to find  all 'CustomerDTO'");
		CustomerFilter filter = new CustomerFilter();
		return this.customerMapper.getCustomers(filter, new PageRequest());
	}
}
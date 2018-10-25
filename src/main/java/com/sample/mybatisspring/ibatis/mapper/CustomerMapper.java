package com.sample.mybatisspring.ibatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sample.mybatisspring.service.CustomerFilter;
import com.sample.mybatisspring.service.dto.CustomerDTO;
import com.sample.mybatisspring.service.pageable.PageRequest;
import com.sample.mybatisspring.service.pageable.PageWrapper;

/**
 * 
 * Mybatis repository
 * 
 * @see CustomerMapper.xml
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 23/09/2018 21:34:10
 */
@Mapper
public interface CustomerMapper {

	/**
	 * Find CustomerDTO by filter
	 * 
	 * @param filter (identifier, name, category)
	 * @param page
	 * @return list of customer
	 */
	CustomerDTO getCustomer(@Param("filter") CustomerFilter filter, @Param("page") PageRequest page);

	/**
	 * Find CustomerDTO by filter
	 * 
	 * @param filter (identifier, name, category)
	 * @return list of customer
	 */
	default CustomerDTO getCustomer(CustomerFilter filter) {
		return this.getCustomer(filter, null);
	}

	/**
	 * Find Customer by filter
	 * 
	 * @param filter filter
	 * @param page   page request
	 * @return customer with paginable
	 */
	PageWrapper<CustomerDTO> getCustomers(@Param("filter") CustomerFilter filter, @Param("page") PageRequest page);

}
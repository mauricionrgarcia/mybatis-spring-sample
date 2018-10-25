package com.sample.mybatisspring.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Config to enable Scanning for mappers
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 23/09/2018 21:46:54
 */
@Configuration
@MapperScan("com.sample.mybatisspring.ibatis.mapper")
public class MyBatisConfiguration {

}
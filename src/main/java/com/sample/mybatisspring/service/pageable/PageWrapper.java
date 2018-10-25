package com.sample.mybatisspring.service.pageable;

import java.util.Collections;

/**
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 01/10/2018 23:07:52
 * @param <T>
 */
public interface PageWrapper<T> {

	static <T> PageWrapper<T> empty() {
		return new PageWrapperImpl<>(Collections.emptyList(), 0);
	}

	long getTotalElements();

	boolean isEmpty();

}
package com.sample.mybatisspring.service.pageable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 01/10/2018 23:07:47
 * @param <T>
 */
public class PageWrapperImpl<T> implements PageWrapper<T> {

	private long total = 0;
	private final List<T> content = new ArrayList<>();

	public PageWrapperImpl() {
	}

	public PageWrapperImpl(List<T> content, long total) {
		// @formatter:off
		this.content.addAll(Optional.ofNullable(content)
				.orElseGet(Collections::emptyList));

		this.total = Optional.of(this.content)
				.filter(list -> list.size() > total)
				.map( list -> Long.valueOf(list.size())).orElse(total);
		// @formatter:om

	}
	public PageWrapperImpl(List<T> content) {
		this(content, 0);
	}
	
	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}
	/**
	 * @return the content
	 */
	public List<T> getContent() {
		return content;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Page#getTotalElements()
	 */
	@Override
	public long getTotalElements() {
		return total;
	}

	@Override
	public boolean isEmpty() {
		return content.isEmpty();
	}

}

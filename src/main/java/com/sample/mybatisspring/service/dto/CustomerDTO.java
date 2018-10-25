package com.sample.mybatisspring.service.dto;

import java.io.Serializable;

import com.sample.mybatisspring.domain.ActiveStatus;

/**
 * Business representation of CustomerDTO
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 21/10/2018 20:07:35
 */
public class CustomerDTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7161382651698872829L;
	private Integer id;
	private String name;
	private ActiveStatus status;

	/**
	 * @return the status
	 */
	public ActiveStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(ActiveStatus status) {
		this.status = status;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", name=" + name + ", status=" + status + "]";
	}

}

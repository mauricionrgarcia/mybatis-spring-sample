package com.sample.mybatisspring.service.pageable;

/**
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 01/10/2018 23:07:43
 */
public class PageRequest {

	private int offSet = 0;
	private int size = 10;

	public int getOffSet() {
		return offSet;
	}

	public void setOffSet(int offSet) {
		this.offSet = offSet;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "PageRequest [offSet=" + offSet + ", size=" + size + "]";
	}

}
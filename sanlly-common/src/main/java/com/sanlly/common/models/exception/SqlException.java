package com.sanlly.common.models.exception;

/**
 * SQL异常
 * 
 * @author lishzh
 *
 */
public class SqlException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4623995428338978836L;

	public SqlException() {
		super();
	}

	public SqlException(String message) {
		super(message);
	}

}

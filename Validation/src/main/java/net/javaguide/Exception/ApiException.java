package net.javaguide.Exception;

public class ApiException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApiException(String meassage) {
		super(meassage);
		
	}

}

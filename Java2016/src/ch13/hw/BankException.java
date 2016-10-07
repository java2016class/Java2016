package ch13.hw;

public class BankException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString(){
		return "Exception Exist.!!!";
	}
	public String getMessage(){
	return "Account doesn\'t have enough cash.";	
	}
}

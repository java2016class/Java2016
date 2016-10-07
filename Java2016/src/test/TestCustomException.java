package test;

public class TestCustomException {
	public static void main(String[] args) {
		try {
			throw new TryException();
		} catch (TryException e) {

		}
	}

}

class TryException extends Exception { //¦Û«ØException

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

package ch13.hw;

public class IbankImpl implements Ibank {

	private static long account = 1000;
	private static final String USERNAME = "Odise";
	private static final String PASS = "123456";
	private static final String NAME = "OdiseTseng";
	private boolean success = false;

	@Override
	public void login(String username, String pass) {
		// TODO Auto-generated method stub
		if (username.equals(USERNAME) && pass.equals(PASS)) {
			System.out.println("歡迎光臨");
			success = true;
		} else {
			System.out.println("使用者名稱與密碼不符");
		}
	}

	@Override
	public long showBalance() {
		// TODO Auto-generated method stub
		if (success)
			return account;
		else {
			try {
				throw new BankException();
			} catch (BankException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				return 0;
			}

		}

	}

	@Override
	public String showName() {
		// TODO Auto-generated method stub
		if (success)
			return NAME;
		else
			try {
				throw new BankException();
			} catch (BankException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				return "";
			}
	}

	@Override
	public void posit(long cash) {
		// TODO Auto-generated method stub
		if (success)
			account += cash;
		else
			try {
				throw new BankException();
			} catch (BankException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	}

	@Override
	public void deposit(long cash) throws BankException {
		// TODO Auto-generated method stub
		if (!success || account - cash < 0) {

			throw new BankException();
			// TODO Auto-generated catch block

		} else
			account -= cash;
	}

}

package ch13.hw;

public interface Ibank {
	void login(String username,String pass);

	long showBalance();

	String showName();
	
	void posit(long cash);
	void deposit(long cash) throws BankException; //�Y�n�ϥ�Exception �o�̭n����
}

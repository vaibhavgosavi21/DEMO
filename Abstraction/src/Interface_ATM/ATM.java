package Interface_ATM;

public abstract class ATM {
	abstract void  withdraw(double b, String pin);
	abstract void  deposit(double amount, String pin);
	abstract void checkBalance();

}

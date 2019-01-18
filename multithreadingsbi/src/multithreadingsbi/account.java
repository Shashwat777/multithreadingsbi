package multithreadingsbi;

public class account {
	int balance = 1000;
	int id;

	account(int id) {
		this.id = id;

	}
	public void deposit(int amnt) {
		balance=balance + amnt;
		
		
	}
	public void withdraw(int amnt) {
		if(amnt<=balance) {
			balance=balance-amnt;
		}
	}

}

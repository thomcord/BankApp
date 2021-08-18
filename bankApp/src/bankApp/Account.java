import java.util.Scanner;

public class Account {
	//Variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	//Contructor
	Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}
	
	//Depositing money
	void deposit(int amount ) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

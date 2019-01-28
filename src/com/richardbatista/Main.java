package com.richardbatista;

public class Main {

    public static void main(String[] args) {
	    Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "123-456-7890");

	    bobsAccount.withdrawal(100.0);
	    bobsAccount.deposit(50.0);
	    bobsAccount.withdrawal(100.0);
	    bobsAccount.deposit(51.0);
	    bobsAccount.withdrawal(100.0);

    }
}

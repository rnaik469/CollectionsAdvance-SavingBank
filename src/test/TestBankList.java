package test;

import in.co.cg.advance.BankAccountList;
import in.co.cg.advance.SavingAccount;

public class TestBankList {
	/**
	 * Test Class for Bank
	 * @param args
	 */
	public static void main(String args[]) {

		BankAccountList bankaccount = new BankAccountList();// instantiating class
		SavingAccount account1 = new SavingAccount(123243, 123, "aashish", false);
		SavingAccount account2 = new SavingAccount(1231, 124, "rohit", false);
		SavingAccount account3 = new SavingAccount(1233, 12, "himanshu", false);
		SavingAccount account4 = new SavingAccount(1234, 23, "shubham", false);

		bankaccount.addAccount(account1); // invoking addAccount
		bankaccount.addAccount(account2); // invoking addAccount
		bankaccount.addAccount(account3); // invoking addAccount
		bankaccount.addAccount(account4); // invoking addAccount

		bankaccount.removeAccount(account2); // invoking removeAccount

		bankaccount.set.stream().forEach(System.out::println);

	}
}

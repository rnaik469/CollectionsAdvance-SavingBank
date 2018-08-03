package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import in.co.cg.advance.SavingAccount;

/**
 * @author rohit naik	
 * test class
 */
public class TestSavingAccount {

	public static void main(String args[]) {
		String name;
		double acc_balance;
		int acc_ID;
		boolean isSalaryAccount;
		double amount;

		Scanner get = new Scanner(System.in);
		SavingAccount[] savingaccount = new SavingAccount[5];//Class reference Array
		
		List<SavingAccount> list = new ArrayList<SavingAccount>(); 
		for (int i = 0; i < 2; i++) {

			savingaccount[i] = new SavingAccount();

			System.out.println("Enter account balance");
			acc_balance = get.nextDouble();
			savingaccount[i].setAcc_balance(acc_balance); //Invoking setAcc_balance

			System.out.print("Enter Account Holder Name");
			name = get.next();
			savingaccount[i].setAccountHolderName(name); //Invoking setAccountHolderName

			System.out.println("Enter account_Id");
			acc_ID = get.nextInt();
			savingaccount[i].setAcc_ID(acc_ID); //Invoking setAcc_ID

		}
		for (int i = 0; i < 2; i++) {
			list.add(savingaccount[i]);  //Invoking add
		}
		for (SavingAccount li : list) {
			System.out.println(li);
		}
		
	
		
		
	}
}
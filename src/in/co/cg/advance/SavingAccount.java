package in.co.cg.advance;

/**
 * @author rnaik Saving Account class with withdraw deposit method
 */
public class SavingAccount implements Comparable<SavingAccount> {

	private double acc_balance;
	private int acc_ID;
	private String accountHolderName;
	private boolean isSalaryAccount;
	private double amount;

	// getters and setters
	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public SavingAccount() {
		super();
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	/**
	 * Constructor
	 * 
	 * @param acc_balance
	 * @param acc_ID
	 * @param accountHolderName
	 * @param isSalaryAccount
	 */
	public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	/**
	 * @param amount
	 * @return balance after withdrawl
	 */
	public String withdraw(double amount) {
		String acc_bal;
		if (acc_balance >= amount) {
			acc_balance -= amount;
			return String.valueOf(acc_balance);
		} else {

			return "Insufficient Balance";
		}
	}
	
	/**
	 * @param amount
	 * @return 
	 */
	public double deposit(double amount) {
		acc_balance += amount;
		return acc_balance;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHolderName=" + accountHolderName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acc_ID;
		long temp;
		temp = Double.doubleToLongBits(acc_balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (acc_ID != other.acc_ID)
			return false;
		if (Double.doubleToLongBits(acc_balance) != Double.doubleToLongBits(other.acc_balance))
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(SavingAccount savingAccount) {

		return this.acc_ID - savingAccount.acc_ID;
	}

}

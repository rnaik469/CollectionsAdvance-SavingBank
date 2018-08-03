package in.co.cg.advance;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Rohit Naik BankAccountList Class maintain Savings Account objects
 */
public class BankAccountList {

	public Set<SavingAccount> set = new TreeSet<>(); // TreeSet With Saving Accounr class

	// adds SavingsAccount object in TreeSet
	public void addAccount(SavingAccount savingacc) {
		set.add(savingacc);
	}

	// removesSavingsAccount object in TreeSet
	public void removeAccount(SavingAccount savingacc) {
		set.remove(savingacc);

	}
}

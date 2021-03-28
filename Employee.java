package SEP1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> owns;

	public Employee(String name) {
		this.name = name;
		owns = new ArrayList<Account>();
	}

	public String getName() {
		return name;
	}

	public void addAccount(Account acct) {
		owns.add(acct);
	}

	public double computeUpdatedBalanceSum() {
		double total = 0;
		for (int i = 0; i < owns.size(); i++) {
			total += owns.get(i).computeUpdatedBalance();
		}
		return total;
	}
}

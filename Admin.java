package SEP1;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).computeUpdatedBalanceSum();
		}
		return total;
	}
}

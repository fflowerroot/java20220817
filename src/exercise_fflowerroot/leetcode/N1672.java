package exercise_fflowerroot.leetcode;

public class N1672 {
	/**
	 * A customer's wealth is the amount of money they have in all their bank accounts.
	 * The richest customer is the customer that has the maximum wealth.
	 *
	 * @param accounts m x n integer grid accounts where accounts[i][j] is the amount of
	 *                 money the ith customer has in the jth bank
	 * @return the wealth that the richest customer has
	 */
	public int maximumWealth(int[][] accounts) {
		var maxWealth = 0;

		for (var customer : accounts) {
			var wealth = 0;
			
			for (var account : customer)
				wealth += account;
				
			maxWealth = Math.max(maxWealth, wealth);
		}
		return maxWealth;
	}
	
//	Variation 2: Using Loop and Stream
//
//	public int maximumWealth(int[][] accounts) {
//		var maxWealth = 0;
//		for (var customer : accounts)
//			maxWealth = Math.max(maxWealth, Arrays.stream(customer).sum());
//		return maxWealth;
//	}
//	Variation 3: Using Streams
//
//	public int maximumWealth(int[][] accounts) {
//		return Arrays.stream(accounts)
//					 .mapToInt(customer -> Arrays.stream(customer).sum())
//					 .max()
//					 .getAsInt();
//	}
//}

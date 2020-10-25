package lab_1;

public class Q6 {

	public static void main(String[] args) {

		/*
		 * When chipmonks get together for a party, they like to have cigars. A chipmonk
		 * party is successfull when the number of cigars is between 40 and 60. Unless
		 * it is the weekend, in which case there is no upper bound on the number of
		 * cigars. Write a method that accepts number of cigars and a boolean for
		 * weekend, and prints true if the party with the given values is successful, or
		 * false otherwise.
		 */
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
	}

	public static void cigarParty(int num, boolean isWeekend) {

		if (isWeekend)
			System.out.println(num >= 40);
		else
			System.out.println(40 <= num && num <= 60);

	}

}

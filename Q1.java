package lab_1;

public class Q1 {

	public static void main(String[] args) {
//		Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String

//	stringTimes("Hi", 2);
		String msg ="mesaj";
		System.out.println(msg.substring(4,4));;
	}

	public static void stringTimes(String message, int count) {
		if (count <= 0)
			System.out.println("Invalid input.");
		else {
			for (int i = 0; i < count; i++) {
				System.out.print(message);
			}
		}
	}
}

package lab_1;

public class Q4 {

	public static void main(String[] args) {
//		The deers in VA spend most of the day playing. In particular, they play if the temperature is between 60 and 90. Unless it is summer, then the upper limit is 100 instead of 90.
//		Write a method that accepts temperature and a boolean isSummer, prints true if the deers play and false otherwise.


		deerPlay(70, false); 
		deerPlay(95, false); 
		deerPlay(95, true);
		}

	public static void deerPlay(int degree, boolean isSummer) {
		
		if (isSummer)System.out.println(60<=degree&&degree<=100);
		else System.out.println(60<=degree&&degree<=90);
	}
	
	

}

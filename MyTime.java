package edu.sjsu.assignment1;

/**
 * MyTime program
 * 
 * @author Yiwen Zhang
 * @since 2022-09-05
 */

public class MyTime{
	public static void main(String[] args) {
		printTimeDifference("0120", "1510");
		printTimeDifference("1635", "0250");
	}
	
	/**
	 * Print the number of hours and minutes between the two times.
	 * 
	 * @param str1 str1 is the first time.
	 * @param str2 str2 is the second time.
	 * @return no return
	 * @author Yiwen Zhang
	 */
	public static void printTimeDifference(String str1, String str2){
		int hour1 = Integer.parseInt(str1,0,2,10);
		int min1 =  Integer.parseInt(str1,2,4,10);
		int hour2 = Integer.parseInt(str2,0,2,10);
		int min2 =  Integer.parseInt(str2,2,4,10);
		int hourDif = 0;
		int minDif = 0;

		if(hour2 >= hour1){
			hourDif = hour2 - hour1;
		}
		else hourDif = hour2 + 24 - hour1;

		if(min2 >= min1){
			minDif = min2 - min1;
		}
		else{
			minDif = min2 + 60 - min1;
			hourDif = hourDif - 1;
		}
		if(hourDif = -1){
			hourDif = 23;
		}

		System.out.println(hourDif +" hour(s) " + minDif + " minute(s)");
		
	}
}
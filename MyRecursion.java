package edu.sjsu.assignment1;

/**
 * MyRecursion program
 * 
 * @author Yiwen Zhang
 * @since 2022-09-05
 */

public class MyRecursion{
	public static void main(String[] args) {
		int index1 = indexOf("Mississippi", "sip");
		int index2 = indexOf("panda", "pan");
		int index3 = indexOf("Hello world", "wow");

		System.out.println("i1: "+ index1 + " i2: " + index2 + " i3: " + index3);
	}
	
	/**
	 * Method name is indexOf, and it takes two strings as paramaters and returns 
	 * an int for the starting position of the first string that matches the 
	 * second string.
	 * 
	 * @param str1 str1 is the first string.
	 * @param str2 str2 is the second string.
	 * @return the starting position of the first string that matches the second string.
	 */
	public static int indexOf(String str1, String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		int i=0;

		if(len1 == 0 && len2 ==0) return 0;
		else if(len1 == 0) return -1;
		else if(len2 == 0) return 0;
		else if(len2 > len1) return -1;
		else if(str1.charAt(0) == str2.charAt(0)){
			i = indexOf(str1.substring(1),str2.substring(1));
			if(i == -1) return -1;
			else return i;
		}
		else{
			i = indexOf(str1.substring(1,len1), str2);
			if(i == -1) return -1;
			else return i +1;
		}
	}
}


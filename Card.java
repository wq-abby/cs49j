package edu.sjsu.assignment1;

/**
 * Card class
 * 
 * @author Yiwen Zhang
 * @since 2022-09-05
 */

public class Card{
	private String shorthand;
	private String suits = "";
	private String ranks = "";
	private boolean bool1 = true;
	private boolean bool2 = true;

	/**
	 * A constructor of the class Card.
	 * 
	 * @param shorthand it's the shorthand of a card.
	 */
	public Card(String shorthand){
		this.shorthand = shorthand;
	}

	/**
	 * A method which is used to get the description of the shorthand of a card.
	 * 
	 * @return a string of the description.
	 */
	public String getDescription(){
		int len = shorthand.length();
		if(len >1){
			char lastCh = shorthand.charAt(len-1);
			String r = shorthand.substring(0,len-1);//to get the string of rank

			switch(r){
			case "A":
				ranks = "Ace";
				break;
			case "2":
				ranks = "Two";
				break;
			case "3":
				ranks = "Three";
				break;
			case "4":
				ranks = "Four";
				break;
			case "5":
				ranks = "Five";
				break;
			case "6":
				ranks = "Six";
				break;
			case "7":
				ranks = "Seven";
				break;
			case "8":
				ranks = "Eight";
				break;
			case "9":
				ranks = "Nine";
				break;
			case "10":
				ranks = "Ten";
				break;
			case "J":
				ranks = "Jack";
				break;
			case "Q":
				ranks = "Queen";
				break;
			case "K":
				ranks = "King";
				break;
			default:
				bool1 = false;
			}

			switch(lastCh){
			case 'D': 
				suits = "Diamonds";
				break;
			case 'H': 
				suits = "Hearts";
				break;
			case 'S': 
				suits = "Spades";
				break;
			case 'C': 
				suits = "Clubs";
				break;
			default:
				bool2 = false;
			}


			if(bool1 == true && bool2 == true){
				return ranks + " of " + suits;
			}
			else 
				return "Unknown";
		}
		else 
			return "Unknown";
	}
}

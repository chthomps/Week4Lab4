/*Program dealing 5 cards 
 * The card suit is defined by the 100's place: 100's=Clubs, 200's=Diamonds, 300's=Hearts, 400's=Spades
 * The values 1-13 represent Ace through King
 */
import java.util.Random;

public class Card {

	public static void main(String[] args) {

		Random generator = new Random();

		//Generate array to hold the 5 cards dealt
		int card, suit, deal;
		int[] hand = new int[5];

		//Populate the array (with replacement) using randomly generated suit and face card assignments.
		for (int index = 0; index < hand.length; index++) {
			card = generator.nextInt(13) + 1; //1= ace, 2-10, 11-13 are jack through king
			suit = generator.nextInt(4) + 1; //suits are as follows: 100s=clubs, 200s=diamonds, 300s=hearts, 400s=spades
			deal = ((suit*100)+card); //Represents a single dealt card defined for both suit and 1-13.
			hand[index] = deal;

		}

		System.out.println("The five cards you are dealt are: ");
		for (int value : hand) {
			System.out.print(value + " ");
		}
	}

}

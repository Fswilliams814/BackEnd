package week05;

public class Card {
	private Suits suit;
	private Ranks rankValue;
//	int [] deck = new int[52];
//	String[] suits = {"Spades", "Hearts", "Diamond", "Clubs"};
//	String[] rank = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	//method that will create the deck of cards
	public Card(Suits suit, Ranks rankValue) {
		this.suit = suit;
		this.rankValue = rankValue;
		
	}

	

	

	public Suits getSuit() {
		return suit;
	}





	public void setSuit(Suits suit) {
		this.suit = suit;
	}





	public Ranks getRank() {
		return rankValue;
	}





	public void setRank(Ranks rankValue) {
		this.rankValue = rankValue;
	}





	public void describe () {
		
		System.out.println(rankValue + " of " + suit);
		
		
	}

}

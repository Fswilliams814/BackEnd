package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Deck {
	private static List<Card> cards;
	

	public Deck() {
		// TODO Auto-generated constructor stub
		Deck.cards = new ArrayList<Card>();
		for(int i=0; i<13; i++) {
			Ranks value = Ranks.values()[i];
			for(int j=0; j<4; j++) {
				Card card = new Card(Suits.values()[j], value);
				Deck.cards.add(card);
			}
		}
		
//		for(Suits s : Suits.values()) {
//			for (Ranks r: Ranks.values()) {
//				Card c = new Card(s,r);
//				cards.add(c);
//				
//			}
//			System.out.println(cards);
//		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
		Iterator<Card> cardIterator = cards.iterator();
		while(cardIterator.hasNext()) {
			Card thisCard = cardIterator.next();
			System.out.println(thisCard.getRank() + " of " + thisCard.getSuit());
		}
	}
	
	public void draw() {
		Iterator<Card> cardIterator2 = cards.iterator();
		Card thisCard = cardIterator2.next();
		System.out.println(thisCard.getRank() + " of " + thisCard.getSuit());
			
		
	}
	/*
	 * The method below is setting up the game board
	 * A new instance of the deck is created as well as a variable to hold the player's deck
	 * The shuffle method is then called on the tempDeck
	 * 
	 * 
	 */
	public static Map<Integer, List<Card>> deal(int numberOfPlayers) {
		ArrayList<Card> tempDeck = new ArrayList<>(cards);
		Map<Integer, List<Card>> playerDeck = new HashMap<>();
		Collections.shuffle(tempDeck);
		
		int i =0;
		while(i!=52) {
			int j = i%numberOfPlayers;
			List<Card> tempList;
			if(playerDeck.containsKey(j)) {
				tempList = playerDeck.get(j);
			}else {
				tempList = new ArrayList<>();
			}
			tempList.add(tempDeck.get(i));
			playerDeck.put(j, tempList);
			i++;
		}
		System.out.println("Dealt");
		//the method below will be describe the player's deck
		displayPlayerCards(playerDeck);
		return playerDeck;
	}
	
	private static void displayPlayerCards(Map<Integer, List<Card>> playerDeck) {
		// TODO Auto-generated method stub
		int i = 0;
		for(Integer player: playerDeck.keySet()) {
			List<Card> playerCards = playerDeck.get(player);
			System.out.println("Player " + (i+1));
			for(Card c: playerCards) {
				System.out.println("Rank: " + c.getRank() + " Suit: "  + c.getSuit() + "\t");
			}
			System.out.println();
			i++;
		}
		
	}

	public void describe () {
		System.out.println("Deck of Cards");
		System.out.println("-----------------");
		Collections.shuffle(cards);
		
		Iterator<Card> cardIterator = cards.iterator();
		while(cardIterator.hasNext()) {
			Card thisCard = cardIterator.next();
			System.out.println(thisCard.getRank() + " of " + thisCard.getSuit());
		}
		
		
	}

}

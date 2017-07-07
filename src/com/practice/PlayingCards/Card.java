package com.practice.PlayingCards;

public class Card {

	private int suit; // clubs = 0, etc..
	private int rank; // deuce = 0, etc..

	/**
	 * Creates a new card.
	 * 
	 * @param rank
	 *            this is the int representation of the rank Ranks.THREE or 2
	 *            for example
	 * @param suit
	 *            this is the int representation of the suit 0=clubs.. 3=spades
	 */
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	/**
	 * Creates a new card with a card number
	 * 
	 * @param cardno
	 *            integer representation of a card 0 =2 of clubs 13 = 2 of
	 *            diamonds
	 */
	public Card(int cardno) {
		this.rank = cardno % 13;
		this.suit = (cardno / 13) % 4;
	}
	
	/**
	 * Get the rank of the card
	 * @return rank of card, as integer
	 */
	public int rank(){
		return rank;
	}
	
	/**
	 * Get the suit of the card
	 * @return suit of card, as integer
	 */
	public int suit(){
		return suit;
	}

	/**
	 * Compares two cards to see if they are the same suit
	 * @param c the card to compare to this card
	 * @return true if same suit, false otherwise
	 */
	public boolean sameSuit(Card c){
		return(this.suit == c.suit);
	}
	
	/**
	 * Compares two cards to see if they are the same rank
	 * @param c the card to compare to this card
	 * @return true if the same rank, false otherwise
	 */
	public boolean sameRank(Card c){
		return(this.rank == c.rank);
	}
	
	/**
	 * Compares two cards to see if they are the same 
	 * @param c the card to compare to this card
	 * @return true if they are the same card
	 */
	public boolean sameCard(Card c){
		return(this.sameSuit(c) && this.sameRank(c) );
	}
	
	/**
	 * Returns the difference in ranking between two cards
	 * @param c the card to compare to this card
	 * @return an integer difference between this card and c
	 */
	public int rankDiff(Card c){
		return(this.rank - c.rank);
	}

	@Override
	public String toString() {
		String ranks = "23456789TJQKA";
		String suits = "\u2663\u2666\u2665\u2660"; //"CDHS";
		return ranks.charAt(rank) + "" + suits.charAt(suit);
             //sonam
	}
	
	
}

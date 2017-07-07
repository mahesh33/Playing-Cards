package com.practice.PlayingCardsRun;

import java.util.Random;

import com.practice.PlayingCards.Card;
import com.practice.PlayingCards.Ranks;
import com.practice.PlayingCards.Suits;

public class PlayingCardsRun {

	public static void main(String[] args) {

		Random generator = new Random();

		Card c1 = new Card(Suits.HEARTS, Ranks.ACE);
		Card c2 = new Card(generator.nextInt(52));

		System.out.printf("Cards : %s %s\n", c1.toString(), c2.toString());
		System.out.printf("SAME RANK : %s\n", c1.sameRank(c2));
		System.out.printf("SAME SUIT : %s\n", c1.sameSuit(c2));
		System.out.printf("SAME CARD : %s\n", c1.sameCard(c2));
	}

}

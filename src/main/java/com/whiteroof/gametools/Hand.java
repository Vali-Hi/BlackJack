package com.whiteroof.gametools;

import java.util.ArrayList;

public class Hand {
	int score;
	ArrayList<Card> cards;
	boolean bust, splitHand;

	public Hand() {
		bust = false;
		splitHand = false;
	}

	public Hand(Card splitCard) {
		cards.add(splitCard);
		bust = false;
		splitHand = true;
	}

	public int getValue() {
		return score;
	}

	public void setValue(int value) {
		this.score = value;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public boolean blackJack() {
		return !splitHand && cards.size() == 2 && score == 21;
	}

	public void hit(Card card) {
		cards.add(card);
		if (card.getCardValue().name().equals("ACE") && score > 11) {
			score += 1;
		} else {
			score += card.getCardValue().getNumValue();
		}
		bust = score > 21;
	}

	public boolean pair() {
		return cards.size() == 2 && cards.get(0).getValue() == cards.get(1).getValue();
	}

	public boolean suitedPair() {
		return pair() && cards.get(0).getSuit().equals(cards.get(1).getSuit());
	}
}

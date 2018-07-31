package com.whiteroof.gametools;

import java.util.ArrayList;

public abstract class Player {
	int score, cardCount;
	ArrayList<Card> hand;

	public Player() {
	}

	public Player(int score, int cardCount, ArrayList<Card> hand) {
		super();
		this.score = score;
		this.cardCount = cardCount;
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCardCount() {
		return cardCount;
	}

	public void setCardCount(int cardCount) {
		this.cardCount = cardCount;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
}

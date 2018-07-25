package com.whiteroof.gametools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck {
	private Stack<Card> deck;

	public Deck() {
		deck = new Stack<Card>();
		for (Suit suit : Suit.values()) {
			for (CardValue cv : CardValue.values()) {
				deck.push(new Card(cv, suit));
			}
		}
		Collections.shuffle(deck);
	}

	public Deck(int numDecks) {
		deck = new Stack<Card>();
		for (int i = 0; i < numDecks; i++) {
			for (Suit suit : Suit.values()) {
				for (CardValue cv : CardValue.values()) {
					deck.push(new Card(cv, suit));
				}
			}
		}
		Collections.shuffle(deck);
	}

	public Card draw() {
		return deck.pop();
	}

	public ArrayList<Card> draw(int numCards) {
		ArrayList<Card> cards = new ArrayList<Card>();
		for (int i = 0; i < numCards; i++) {
			cards.add(deck.pop());
		}
		return cards;
	}
}

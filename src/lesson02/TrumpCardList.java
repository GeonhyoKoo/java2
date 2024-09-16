package lesson02;

import java.util.Random;

public class TrumpCardList {
	
	private TrumpCard[] trumpCards = new TrumpCard[52];

	public TrumpCardList() {
		int trumpCardsIndex = 0;
		
		// spade 
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard();
			trumpCard.setShape("spade");
			trumpCard.setNumber(i + 1);
			trumpCards[trumpCardsIndex++] = trumpCard;
		}

		// heart 
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard();
			trumpCard.setShape("heart");
			trumpCard.setNumber(i + 1);
			trumpCards[trumpCardsIndex++] = trumpCard;
		}

		// diamond 
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard();
			trumpCard.setShape("diamond");
			trumpCard.setNumber(i + 1);
			trumpCards[trumpCardsIndex++] = trumpCard;
		}

		// club 
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard();
			trumpCard.setShape("club");
			trumpCard.setNumber(i + 1);
			trumpCards[trumpCardsIndex++] = trumpCard;
		}
	}
	
	public void printCards() {
		for (int i = 0; i < trumpCards.length; i++) {
			System.out.println(trumpCards[i].getShape() + " " + trumpCards[i].getNumber());
		}
	}
	
	public void mix() {
		Random rand = new Random();
		for (int i = 0; i < 1000; i++) {
			int randIndex = rand.nextInt(51) + 1; // 1 ~ 51
			TrumpCard temp = trumpCards[0];
			trumpCards[0] = trumpCards[randIndex];
			trumpCards[randIndex] = temp;
		}
	}
	
}

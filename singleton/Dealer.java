package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Dealer {

	private static Dealer dealerInstance = null;

	private Dealer() {
	}

	String[] cards = { "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK", "C1", "C2", "C3",
			"C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8",
			"H9", "H10", "HJ", "HQ", "HK", "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ",
			"SK" };

	private LinkedList<String> cardList = new LinkedList<String>(Arrays.asList(cards));

	public static synchronized Dealer getDealerInstance() {

		if (dealerInstance == null) {
			dealerInstance = new Dealer();
			Collections.shuffle(dealerInstance.cardList);
		}

		return dealerInstance;

	}

	public synchronized LinkedList<String> getCardList() {
		return dealerInstance.cardList;
	}

	public synchronized LinkedList<String> dealCards(int howManyCards) {

		LinkedList<String> cardsToDeal = new LinkedList<>();

		if (dealerInstance.cardList.size() >= howManyCards) {

			for (int i = 0; i <= howManyCards; i++) {
				cardsToDeal.add(dealerInstance.cardList.remove(0));
			}
		}

		return cardsToDeal;
	}

}

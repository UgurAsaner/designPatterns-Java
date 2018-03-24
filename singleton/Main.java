package singleton;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Dealer dealer = Dealer.getDealerInstance();
		
		System.out.println("Dealer Id: " + System.identityHashCode(dealer));
		
		LinkedList<String> cardList = dealer.getCardList();
		System.out.println(cardList);
		
		// Deal 5 cards
		LinkedList<String> dealedCards = dealer.dealCards(5);
		System.out.println(dealedCards);
		
		System.out.println(cardList);
		
		// Deal 4 cards
		LinkedList<String> moreDealedCards = dealer.dealCards(4);
		System.out.println(moreDealedCards);
		
		System.out.println(cardList);
		
		System.out.println("********************************************************\n Thread Test");
		
		Runnable dealtheCards = new DealTheCards();
		
		
		new Thread(dealtheCards).start();
		new Thread(dealtheCards).start();
		new Thread(dealtheCards).start();

	}

}

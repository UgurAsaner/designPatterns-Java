package singleton;

public class DealTheCards implements Runnable {

	@Override
	public void run() {

		synchronized (DealTheCards.class) {

			Dealer dealer = Dealer.getDealerInstance();

			System.out.println("Dealer Id: " + System.identityHashCode(dealer));

			System.out.println(dealer.getCardList());

			System.out.println(dealer.dealCards(15));

			System.out.println(dealer.getCardList());

		}
	}

}

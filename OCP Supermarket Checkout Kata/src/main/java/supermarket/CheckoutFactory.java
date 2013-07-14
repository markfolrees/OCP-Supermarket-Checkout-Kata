package supermarket;

import java.util.ArrayList;
import java.util.List;

public class CheckoutFactory {

	public Checkout create() {
		DealCombination ABD = createDeal("D", 10);
		DealCombination ABC = createDeal("C", 15);
		return new Checkout(new PriceList(), new Till(new Basket(),
				new Multibuy(new NoDiscount(), new ADiscount(3, 20),
						new ADiscount(2, 15)), new MealDeal(ABD, ABC)));
	}

	private DealCombination createDeal(String dessert, int discount) {
		List<String> deal = new ArrayList<String>();
		deal.add("A");
		deal.add("B");
		deal.add(dessert);
		return new DealCombination(deal, discount);
	}
}

package second;

import java.util.HashMap;
import java.util.Map;

public class SecondCheckoutFactory {

	public SecondCheckout create() {
		Map<String, Integer> itemPrices = getItemPrices();
		return new SecondCheckout(new Calculator(new Prices(itemPrices),
				new MultiBuy(new SecondDiscount("AAA", 20), new SecondDiscount(
						"BB", 15))),
				new SecondBasket(new RealItemValidator("")));
	}

	private Map<String, Integer> getItemPrices() {
		HashMap<String, Integer> prices = new HashMap<String, Integer>();
		prices.put("A", 50);
		prices.put("B", 30);
		prices.put("C", 20);
		prices.put("D", 15);
		return prices;
	}

}

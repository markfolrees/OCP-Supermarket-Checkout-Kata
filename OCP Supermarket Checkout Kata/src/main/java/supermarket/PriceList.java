package supermarket;

import java.util.HashMap;
import java.util.Map;

public class PriceList {

	private final Map<String, Integer> prices;

	public PriceList() {
		prices = new HashMap<String, Integer>();
		prices.put("", 0);
		prices.put("A", 50);
		prices.put("B", 30);
		prices.put("C", 20);
		prices.put("D", 15);
	}

	public int getPrice(String item) {
		return prices.get(item);
	}
}

package second;

import java.util.Map;

public class Prices {

	private final Map<String, Integer> itemPrices;

	public Prices(Map<String, Integer> itemPrices) {
		this.itemPrices = itemPrices;
	}

	public int priceFor(String item) {
		return itemPrices.get(item);
	}

}

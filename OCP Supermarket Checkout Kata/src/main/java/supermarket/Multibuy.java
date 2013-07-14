package supermarket;

import java.util.HashMap;
import java.util.Map;

public class Multibuy {

	Map<String, Discount> discounts = new HashMap<String, Discount>();

	public Multibuy(Discount noDiscount, ADiscount discountA,
			ADiscount discountB) {
		discounts.put("A", discountA);
		discounts.put("B", discountB);
		discounts.put("C", noDiscount);
		discounts.put("D", noDiscount);
		discounts.put("", noDiscount);

	}

	public int discount(String item, int count) {
		int discount = discounts.get(item).apply(count);

		return discount;
	}

}

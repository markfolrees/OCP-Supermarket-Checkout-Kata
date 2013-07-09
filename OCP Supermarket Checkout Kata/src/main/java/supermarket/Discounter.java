package supermarket;

import java.util.HashMap;
import java.util.Map;

public class Discounter {

	Map<String, Discount> discounts = new HashMap<String, Discount>();

	public Discounter(Discount noDiscount, ADiscount discountA,
			ADiscount discountB) {
		discounts.put("A", discountA);
		discounts.put("B", discountB);
		discounts.put("C", noDiscount);
		discounts.put("D", noDiscount);
		discounts.put("", noDiscount);

	}

	public int discount(String item, int count) {
		return discounts.get(item).apply(count);
	}

}

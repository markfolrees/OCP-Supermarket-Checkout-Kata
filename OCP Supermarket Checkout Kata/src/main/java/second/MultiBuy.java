package second;

import java.util.List;

public class MultiBuy {

	private final List<SecondDiscount> discounts;

	public MultiBuy(SecondDiscount... discountsToApply) {
		discounts = com.google.common.collect.Lists
				.newArrayList(discountsToApply);
	}

	public int discount(String joinedItems) {

		int totalDiscount = 0;
		for (SecondDiscount discount : discounts) {
			totalDiscount += discount.apply(joinedItems);
		}
		return totalDiscount;
	}
}

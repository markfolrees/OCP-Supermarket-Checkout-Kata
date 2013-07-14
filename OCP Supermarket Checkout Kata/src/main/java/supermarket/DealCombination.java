package supermarket;

import java.util.List;

public class DealCombination {

	private final List<String> deal;
	private final int discount;

	public DealCombination(List<String> deal, int discount) {
		this.deal = deal;
		this.discount = discount;
	}

	public int discount(List<String> items) {
		if (items.containsAll(deal)) {
			items.removeAll(deal);
			return discount;
		}
		return 0;
	}

}

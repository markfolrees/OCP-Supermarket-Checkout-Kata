package supermarket;

import java.util.ArrayList;
import java.util.List;

public class MealDeal {

	List<DealCombination> dealCombinations = new ArrayList<DealCombination>();

	public MealDeal(DealCombination... combinations) {
		for (DealCombination dealCombination : combinations) {
			dealCombinations.add(dealCombination);
		}
	}

	public int discount(List<String> items) {
		int discount = 0;
		for (DealCombination dealCombination : dealCombinations) {
			discount += dealCombination.discount(items);
		}
		return discount;

	}

}

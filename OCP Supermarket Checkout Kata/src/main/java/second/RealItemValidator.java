package second;

import java.util.List;

public class RealItemValidator {

	private final String invalidItem;

	public RealItemValidator(String invalidItem) {
		this.invalidItem = invalidItem;
	}

	public void addToBasket(List<String> basket, String item) {
		if (isValid(item)) {
			basket.add(item);
		}
	}

	private boolean isValid(String item) {
		return !item.equals(invalidItem);
	}

}

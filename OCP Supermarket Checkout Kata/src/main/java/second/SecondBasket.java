package second;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class SecondBasket {

	private final List<String> items = newArrayList();
	private final RealItemValidator realItemValidator;

	public SecondBasket(RealItemValidator realItemValidator) {
		this.realItemValidator = realItemValidator;
	}

	public void add(String item) {
		realItemValidator.addToBasket(items, item);
	}

	public List<String> forCalculator() {
		return items;
	}

	public String forMultiBuy() {
		String[] sortedItems = items.toArray(new String[] {});
		Arrays.sort(sortedItems);
		return StringUtils.join(sortedItems);
	}

}

package second;

import java.util.ArrayList;
import java.util.List;

public class SecondCheckout {

	private final List<String> items = new ArrayList<String>();
	private final SecondPriceList secondPriceList;

	public SecondCheckout(SecondPriceList secondPriceList) {
		this.secondPriceList = secondPriceList;
	}

	public void scan(String item) {
		items.add(item);
	}

	public int total() {

		return secondPriceList.calculate(items.toArray(new String[] {}));
	}
}

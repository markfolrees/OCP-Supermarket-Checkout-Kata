package supermarket;

import java.util.HashMap;
import java.util.Map;

public class Basket {

	Map<String, Integer> items = new HashMap<String, Integer>();

	public Basket() {
		items.put("A", 0);
		items.put("B", 0);
		items.put("C", 0);
		items.put("D", 0);
		items.put("", 0);
	}

	public void add(String item) {
		items.put(item, items.get(item) + 1);
	}

	public int numberOf(String item) {
		return items.get(item);
	}

}

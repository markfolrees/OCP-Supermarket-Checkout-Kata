package supermarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {

	Map<String, Integer> itemsCounter = new HashMap<String, Integer>();
	List<String> items = new ArrayList<String>();

	public Basket() {
		itemsCounter.put("A", 0);
		itemsCounter.put("B", 0);
		itemsCounter.put("C", 0);
		itemsCounter.put("D", 0);
		itemsCounter.put("", 0);
	}

	public void add(String item) {
		itemsCounter.put(item, itemsCounter.get(item) + 1);
		items.add(item);
	}

	public int numberOf(String item) {
		return itemsCounter.get(item);
	}

	public List<String> items() {
		return items;
	}

}

package second;

public class SecondDiscount {

	private final String pattern;
	private final int discount;

	public SecondDiscount(String pattern, int discount) {
		this.pattern = pattern;
		this.discount = discount;
	}

	public int apply(String items) {
		int totalDiscount = 0;

		do {
			totalDiscount += items.contains(pattern) ? discount : 0;
			items = items.replaceFirst(pattern, "");
		} while (items.contains(pattern));

		return totalDiscount;
	}

}

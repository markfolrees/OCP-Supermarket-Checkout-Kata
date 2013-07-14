package supermarket;

public class Checkout {

	private final Till till;

	public Checkout(PriceList priceList, Till till) {
		this.priceList = priceList;
		this.till = till;
	}

	private final PriceList priceList;

	private int total;

	public int total() {
		total -= till.applyDiscount();
		return total;
	}

	public void scan(String item) {
		total += priceList.getPrice(item);
		till.calculateDiscount(item);
	}

}

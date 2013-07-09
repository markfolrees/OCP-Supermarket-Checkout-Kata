package supermarket;

public class Checkout {

	private final Till discounter;

	public Checkout(PriceList priceList, Till discounter) {
		this.priceList = priceList;
		this.discounter = discounter;
	}

	private final PriceList priceList;

	private int total;

	public int total() {
		return total;
	}

	public void scan(String item) {
		total += priceList.getPrice(item);
		total -= discounter.applyDiscount(item);
	}

}

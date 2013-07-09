package supermarket;

public class Till {

	private final Basket basket;
	private final Discounter discounter;

	public Till(Basket basket, Discounter discounter) {
		this.basket = basket;
		this.discounter = discounter;

	}

	public int applyDiscount(String item) {
		basket.add(item);
		return discounter.discount(item, basket.numberOf(item));
	}

}

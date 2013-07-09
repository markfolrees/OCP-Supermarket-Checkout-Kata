package supermarket;

public class CheckoutFactory {

	public Checkout create() {
		return new Checkout(new PriceList(), new Till(new Basket(),
				new Discounter(new NoDiscount(), new ADiscount(3, 20),
						new ADiscount(2, 15))));
	}
}

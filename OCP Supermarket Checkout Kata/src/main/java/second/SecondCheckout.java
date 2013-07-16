package second;

public class SecondCheckout {

	private final Calculator secondPriceList;
	private final SecondBasket basket;

	public SecondCheckout(Calculator secondPriceList, SecondBasket basket) {
		this.secondPriceList = secondPriceList;
		this.basket = basket;
	}

	public void scan(String item) {
		basket.add(item);
	}

	public int total() {
		return secondPriceList.calculate(basket);
	}

}

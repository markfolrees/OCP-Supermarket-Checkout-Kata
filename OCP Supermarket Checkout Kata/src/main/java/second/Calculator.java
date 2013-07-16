package second;

public class Calculator {

	private final Prices prices;
	private final MultiBuy multiBuy;

	public Calculator(Prices prices, MultiBuy multiBuy) {
		this.prices = prices;
		this.multiBuy = multiBuy;
	}

	public int calculate(SecondBasket basket) {
		int total = 0;

		for (String item : basket.forCalculator()) {
			total += prices.priceFor(item);
		}
		total -= multiBuy.discount(basket.forMultiBuy());
		return total;
	}

}

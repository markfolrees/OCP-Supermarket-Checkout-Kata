package supermarket;

public class Till {

	private final Basket basket;
	private final Multibuy multibuy;
	private int multibuyDiscount;
	private final MealDeal mealDeal;
	private int mealDealDiscount;

	public Till(Basket basket, Multibuy multibuy, MealDeal mealDeal) {
		this.basket = basket;
		this.multibuy = multibuy;
		this.mealDeal = mealDeal;

	}

	public void calculateDiscount(String item) {
		basket.add(item);
		multibuyDiscount += multibuy.discount(item, basket.numberOf(item));
		mealDealDiscount += mealDeal.discount(basket.items());
	}

	public int applyDiscount() {
		return multibuyDiscount > mealDealDiscount ? multibuyDiscount
				: mealDealDiscount;
	}

}

package supermarket;

public class ADiscount implements Discount {

	private final int trigger;
	private final int reduction;

	public ADiscount(int trigger, int reduction) {
		this.trigger = trigger;
		this.reduction = reduction;

	}

	@Override
	public int apply(int count) {
		return count % trigger == 0 ? reduction : 0;
	}
}

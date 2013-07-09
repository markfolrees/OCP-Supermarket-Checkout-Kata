package supermarket;

public class NoDiscount implements Discount {

	@Override
	public int apply(int count) {
		return 0;
	}

}

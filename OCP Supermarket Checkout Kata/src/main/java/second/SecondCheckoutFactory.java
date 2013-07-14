package second;

public class SecondCheckoutFactory {

	public SecondCheckout create() {
		return new SecondCheckout(new SecondPriceList(15, 20));
	}

}

package supermarket;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class CheckoutTester {

	@Test
	public void emptyBasket() {
		assertEquals(0, price(""));
	}

	@Test
	public void A() {
		assertEquals(50, price("A"));
	}

	@Test
	public void B() {
		assertEquals(30, price("B"));
	}

	@Test
	public void C() {
		assertEquals(20, price("C"));
	}

	@Test
	public void D() {
		assertEquals(15, price("D"));
	}

	@Test
	public void AA() {
		assertEquals(100, price("A", "A"));
	}

	@Test
	public void AAA() {
		assertEquals(130, price("A", "A", "A"));
	}

	@Test
	public void AAAA() {
		assertEquals(180, price("A", "A", "A", "A"));
	}

	@Test
	public void AAAAAA() {
		assertEquals(260, price("A", "A", "A", "A", "A", "A"));
	}

	@Test
	public void BB() {
		assertEquals(45, price("B", "B"));
	}

	private int price(String... items) {
		Checkout checkout = new CheckoutFactory().create();
		for (String item : items) {
			checkout.scan(item);
		}
		return checkout.total();
	}
}

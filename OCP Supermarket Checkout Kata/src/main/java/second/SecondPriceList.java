package second;

public class SecondPriceList {

	int d;
	int c;

	public SecondPriceList(int d, int c) {
		this.d = d;
		this.c = c;
	}

	public int calculate(String[] items) {
		int total = 0;

		for (String item : items) {
			switch (item) {
			case "D":
				total += d;
				break;
			case "C":
				total += c;
				break;
			default:
				total += 50;
			}
		}
		if (items.length == 3) {
			total -= 20;
		}
		return total;
	}
}

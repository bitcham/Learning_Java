package SimpleInterest;

import java.math.BigDecimal;

public class SimpleInterest {
	private BigDecimal principal;
	BigDecimal interest;
	BigDecimal Sum;

	public SimpleInterest(String i, String j) {
		this.principal = new BigDecimal(i);
		this.interest = new BigDecimal(j).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotal(int year) {
		return principal.add(principal.multiply(interest).multiply(new BigDecimal(year)));
	}
}

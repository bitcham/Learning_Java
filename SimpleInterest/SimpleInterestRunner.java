package SimpleInterest;

import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest calculator = new SimpleInterest("4500.0", "7.5");
		BigDecimal totalValue = calculator.calculateTotal(5);
		System.out.println(totalValue);
	}

}

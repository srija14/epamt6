package epam.task5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sijuint {

	@Test
	public void test() {
		SimpleInterest test = new SimpleInterest();
		double simpleinterestcalculatingoutput=test.SimpleInterestCalculator(100, 5, 10);
		assertEquals(50.0,simpleinterestcalculatingoutput,0);
	}

}

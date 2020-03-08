package epam.task5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Hccjunit {

	@Test
	public void test() {HouseConstructionCost test=new HouseConstructionCost();
	assertEquals(8250.00 ,test.costCalculator("ABOVE_STANDARD_MATERIAL", 5.5, "NO"),0);
	}

}

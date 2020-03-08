package epam.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {
	private static Logger logger = LogManager.getLogger(App.class);
	public double CompoundInterestCalculator(int principle_amount,int time,double rate)
	{
		logger.warn("please enter a positive numbers except 0");
		if(principle_amount<=0){
			logger.error("Amount value either 0 or negitive(-ve)");
			return 0;
		}
		else{
			logger.info("Compound_Interest Calculator");
			double compoundinterestcalculating=principle_amount*(Math.pow((1 + rate/100),time));
			logger.info("Total Amount: "+compoundinterestcalculating);
			return compoundinterestcalculating;
		}
	}
}

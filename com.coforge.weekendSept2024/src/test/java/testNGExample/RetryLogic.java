package testNGExample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {

		
		
		return false;
	}
	
	
	
}

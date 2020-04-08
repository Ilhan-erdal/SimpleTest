package Package;

import org.testng.annotations.Test;

public class Tests {
	
	Methods run = new Methods();
	
	@Test 
	public void GoogleSearch() {
		run.HomePage();
		run.makeASearch();
		run.closeBrowser();
	}

}

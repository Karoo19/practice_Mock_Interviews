package code_1stfeb;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependability {
	
	
	@Test
	public void logic1() {
		Assert.fail("deliberately failing my test case");

	}

	@Test(dependsOnMethods = "logic1", alwaysRun = true)
	public void logic2() {

	}

	@Test(dependsOnMethods = { "logic1", "logic2" }, alwaysRun = true)
	public void logic3() {

	}

}

package code_1stfeb;

import org.testng.annotations.Test;

public class Enablement {
	
	

		@Test
		public void logic1() {
			
		}
		
		@Test(invocationCount = 5)
		public void logic2() {
			
		}
		
		@Test(enabled = false)
		public void logic3() {
			
		}
		
		@Test
		public void logic4() {
			
		}
		
	}



package code_1stfeb;

import org.testng.annotations.Test;

public class priority {
	
	public class Priority {
		
		@Test(priority = 2)
		public void logic1() {
			
		}
		
		@Test(priority = 3)
		public void logic2() {
			
		}
		
		@Test(priority = 1)
		public void logic3() {
			
		}
		
		@Test(priority = 4)
		public void logic4() {
			
		}

}
}

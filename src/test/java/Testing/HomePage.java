package Testing;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends  Base{

	@Test
		public void basePageNavigation() throws IOException
	{
		driver=initializedriver();
		driver.get("https://www.twitter.com");
		
		
		
		
	}
}

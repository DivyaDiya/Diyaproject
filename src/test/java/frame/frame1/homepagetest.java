package frame.frame1;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class homepagetest {

	homepage home;
	basepage bp;
	
	
	public  homepagetest()
	{
		home =new homepage();
		bp =new basepage();
		
	}
	@Test
	public void verifyWomen()
	{
		Assert.assertTrue(home.getWomen().isDisplayed());
		
	}
	@Test
	public void verifyDresses()
	{
		Assert.assertTrue(home.getDresses().isDisplayed());
	}
	
	@Test
	public void veriftTshirt()
	{
		Assert.assertTrue(home.getTshirt().isDisplayed());
		
	}
		
	
}

package testpkg;

import org.testng.annotations.Test;

import basepkg.Saucedemologin;
import pagepkg.Saucedemologinpage;

import utilspkg.Excelutilssaucedemo;

public class Saucedemologintest extends Saucedemologin
{
	@Test(priority=1)
	public void saucedemologin()throws Exception
	{
	Saucedemologinpage ob=new Saucedemologinpage(driver);
	String xl="C:\\Users\\shrij\\Downloads\\Untitled spreadsheet (11).xlsx";
	String sheet="Sheet1";
	int rowCount=Excelutilssaucedemo.getRowCount(xl, sheet);
	for(int i=1;i<=rowCount;i++)
	{
		String UserName=Excelutilssaucedemo.getCellValue(xl, sheet, i, 0);
		System.out.println("username....."+UserName);
		String Pwd=Excelutilssaucedemo.getCellValue(xl, sheet, i, 1);
		System.out.println("password....."+Pwd);
		ob.clear();
		
		ob.setvalues(UserName, Pwd);
		
		ob.loginclick();
		
	}
	
	
	}
	@Test(priority=2)
	public void addproductstocart() throws Exception
	{
		Saucedemologinpage ob=new Saucedemologinpage(driver);
		ob.addtocart();
		Thread.sleep(2000);
		
		ob.cart();
		Thread.sleep(2000);
		
		ob.checkout();
		
	}
	@Test(priority=3)
	public void personaldetails() throws Exception
	{
		Saucedemologinpage ob=new Saucedemologinpage(driver);
		Thread.sleep(2000);
		ob.personaldetails();
		Thread.sleep(2000);
		ob.continueclick();
	}
	
	@Test(priority=4)
	public void gotohomeandlogout() throws Exception
	{
		Saucedemologinpage ob=new Saucedemologinpage(driver);
		ob.hamburger();
		ob.home();
		Thread.sleep(2000);
		
		ob.hamburger();
		Thread.sleep(2000);
		
		ob.logout();
	}
}
	


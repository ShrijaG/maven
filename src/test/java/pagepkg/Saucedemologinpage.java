package pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemologinpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(name="login-button")
	WebElement login;
/*
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
WebElement c1;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
WebElement c2;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
WebElement c3;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
WebElement c4;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
WebElement c5;
@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
WebElement c6;*/

@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
WebElement cart;

@FindBy(xpath="//*[@id=\"checkout\"]")
WebElement checkout;

@FindBy(xpath="//*[@id=\"first-name\"]")
WebElement firstname;
@FindBy(xpath="//*[@id=\"last-name\"]")
WebElement lastname;
@FindBy(xpath="//*[@id=\"postal-code\"]")
WebElement code;
@FindBy(xpath="//*[@id=\"continue\"]")
WebElement continuebutton;

@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
WebElement hamburger;

@FindBy(xpath="//*[@id=\"inventory_sidebar_link\"]")
WebElement allitems;
@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
WebElement logout;
	
	public Saucedemologinpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void setvalues(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	
	public void loginclick()
	{
		login.click();
	}
	public void clear()
	{
		username.clear();
		password.clear();
	}
	public void addtocart()
	{
		/*c1.click();
		c2.click();
		c3.click();
		c4.click();
		c5.click();
		c6.click();*/
		
		List<WebElement>li=driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button"));
		for(WebElement cart:li)
		{
			if(cart.getText().equals("Add to cart"))
			{
				cart.click();
			}
			else
			{
				System.out.println("Not Available");
			}
		}
	}
	public void cart()
	{
		cart.click();
	}
	public void checkout()
	{
		checkout.click();
	}
	public void personaldetails()
	{
		firstname.sendKeys("abc");
		lastname.sendKeys("asd");
		code.sendKeys("12345");
	}
	public void continueclick()
	{
		continuebutton.click();
	}
	public void hamburger()
	{
		hamburger.click();
	}
	public void home()
	{
		allitems.click();
	}
	public void logout()
	{
		logout.click();
	}
}

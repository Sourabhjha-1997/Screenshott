package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Step;

public class Desktop {
	WebDriver driver;
	public Desktop(WebDriver driver) {
		this.driver=driver;
	}
	By Desktopbutton= By.xpath("//li[@class=\"dropdown\"]//a[contains(text(),\"Desktops\")]");
	By Macbutton=By.xpath("//nav[@id=\"menu\"]//div//li//a[contains(text(),\"Mac (1)\")]");
	By Verify_Text=By.xpath("//div[@class=\"caption\"]//p[1]");
	By AddtoCart=By.xpath("//button[@onclick=\"cart.add('41', '1');\"]");
	By Cart=By.xpath("//div[@id=\"cart\"]//span");
	By Checkout=By.xpath("//p[@class=\"text-right\"]//a[2]");
	By VerifyText2=By.xpath("//table[@class=\"table table-bordered\"]//tbody//td[6]");
	By Continue=By.xpath("//div[@class=\"pull-left\"]//a");
	
	@Step("Trigger url")
	public void Trigger_url(String url) {
		this.driver.get(url);
	}
	
	@Step("Mouse Hover on Desktop Button")
	public void DesktopButton() {
		WebElement ele=driver.findElement(Desktopbutton);
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
	}
	@Step("Click on Mac(1)")
	public void Mac1() {
		driver.findElement(Macbutton).click();
	}
	@Step("Verifying Click on Mac(1)")
	public String verify() {
		String Str=driver.findElement(Verify_Text).getText();
		return Str;
	}
	@Step("Click on Add to Cart")
	public void ADDtoCART() {
		driver.findElement(AddtoCart).click();
	}
	@Step("Click on Cart")
	public void cart() {
		driver.findElement(Cart).click();
	}
	@Step("Click on Checkout")
	public void checkout() {
		driver.findElement(Checkout).click();
	}
	@Step("Verifying table")
	public String Total() {
		WebElement elt=driver.findElement(VerifyText2);
		String i = elt.getText();
		return i;   
	}
	@Step("Continue Shoping")
	public void Continue_button() {
		driver.findElement(Continue).click();
	}

}

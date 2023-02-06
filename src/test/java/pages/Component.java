package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;

public class Component {
	WebDriver driver;
	public Component (WebDriver driver) {
		this.driver=driver;
	}
	By Component=By.xpath("//ul[contains(@class,'navbar-nav')]//a[@class='dropdown-toggle' and contains(text(),'Components')]");
    By Monitor=By.xpath("//ul[@class=\"list-unstyled\"]//li[2]//a[contains(text(),\"Monitors (2)\")]");
	By Verify=By.xpath("//div[@id=\"content\"]//h2");
	By Addtocart=By.xpath("//div[2][@class=\"product-layout product-list col-xs-12\"]//div[@class=\"button-group\"]//button[1]");
	
	
	
	
	
	@Step("Click on Component")
	public void component() {
		driver.findElement(Component).click();
	}
	@Step("click on Monitors")
	public void monitors() {
		driver.findElement(Monitor).click();
	}
	@Step("Verify text on monitor page")
	public String verify(){
		String text=driver.findElement(Verify).getText();
		return text;
	}
	@Step("Click on add to CArt")
	public void ADD() {
		driver.findElement(Addtocart).click();
	}

}

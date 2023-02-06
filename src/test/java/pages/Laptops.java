package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Step;

public class Laptops {
	WebDriver driver;
	public Laptops(WebDriver driver) {
		this.driver=driver;
	}
	By LaptopsandNotebook=By.xpath("//ul[contains(@class,'navbar-nav')]//a[@class='dropdown-toggle' and contains(text(),'Laptops & Notebooks')]");
	By Showall=By.xpath("//a[contains(text(),\"Show All Laptops & Notebooks\")]");
	By verify1=By.xpath("//div[@id=\"content\"]//h2");
	By Size=By.xpath("//i[@class=\"fa fa-th-list\"]");
	By Dropdown1=By.xpath("//select[@id=\"input-sort\"]");
	By Dropdown2=By.xpath("//select[@id=\"input-limit\"]");
	By Macbookpro=By.xpath("//div[4][@class=\"product-layout product-list col-xs-12\"]//div[@class=\"button-group\"]//button[1]");
	By cart=By.xpath("//div[@id=\"cart\"]");
	By Viewcart=By.xpath(" //p[@class=\"text-right\"]//a[1]");
	By Verify2=By.xpath(" //div[@id=\"content\"]//h2");
	By cancel=By.xpath("//table[@class=\"table table-bordered\"]//tr[1]//i[@class=\"fa fa-times-circle\"]");
	By Continue =By.xpath("//div[@class=\"pull-left\"]//a");
	@Step("Mouse Hover on Laptops and Notebook")
	public void laptops() {
		WebElement edr=driver.findElement(LaptopsandNotebook);
		Actions est=new Actions(driver);
		est.moveToElement(edr).perform();
	}
	@Step("Click on Show all Laptops and Notebook")
	public void showall() {
		driver.findElement(Showall).click();
	}
	@Step("verify text for next page") 
	public String Verify() {
		//String mtr="Laptops & Notebooks";
		String str=driver.findElement(verify1).getText();
		return str;	
	}
	@Step("Arrange list in verticaly")
	public void click() {
		driver.findElement(Size).click();
	}
	@Step("Click on Dropdown1")
	public void dropdown() {
		WebElement tr=driver.findElement(Dropdown1);
		Select qr=new Select(tr);
		qr.selectByVisibleText("Price (Low > High)");
	}
	@Step("Click on Dropdown2")
	public void dropdown2() {
	WebElement tl=driver.findElement(Dropdown2);
	Select hg= new Select(tl);
    hg.selectByVisibleText("50");
	}
	@Step("Click on Macbook pro")
    public void Mackbookpro() {
		driver.findElement(Macbookpro).click();
	}
	@Step("Click on cart button")
	public void Cart() {
		driver.findElement(cart).click();
	}
	@Step("Click on view Cart")
	public void ViewCart() {
		driver.findElement(Viewcart).click();
	}
	@Step("verify text after click on view cart")
	public String verify2() {
		String text=driver.findElement(Verify2).getText();
		return text;
	}
	@Step("Cancel the Mackbook pro laptop")
	public void Cancel() {
		driver.findElement(cancel).click();
	}
	@Step("Go back to home page")
	public void ContButton() {
		driver.findElement(Continue).click();
	}

}

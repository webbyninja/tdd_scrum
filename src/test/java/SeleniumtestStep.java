package test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class SeleniumtestStep extends TestCase{
	

	private WebDriver driver;
	private String baseUrl;

	@Given("^user enter (\\d+) and (\\d+) in input box$")
	public void user_enter_and_in_input_box(int arg1, int arg2) throws Throwable {
		driver = new FirefoxDriver();
	    baseUrl = "http://ata123456789123456789.appspot.com/";
	    driver.get(baseUrl);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(arg1));
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(arg2));
	}

	@Given("^select \"([^\"]*)\"$")
	public void select(String arg1) throws Throwable {
		String operation = null;
		if(arg1.equals("Add"))
			operation = "gwt-uid-1";
		else if(arg1.equals("Mul"))
			operation = "gwt-uid-2";
		else if(arg1.equals("Sqr"))
			operation = "gwt-uid-3";
		else if(arg1.equals("Comp"))
			operation = "gwt-uid-4";
		else if(arg1.equals("SqrSub"))
			operation = "gwt-uid-5";
		else if(arg1.equals("Euclid(+)"))
			operation = "gwt-uid-6";
		else if(arg1.equals("Euclid(-)"))
			operation = "gwt-uid-7";
	    driver.findElement(By.id(operation)).click();
	}

	@When("^click on calculate$")
	public void click_on_calculate() throws Throwable {
	    driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
		String result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		assertEquals(arg1, Integer.parseInt(result));
		driver.quit();
	}
	
}

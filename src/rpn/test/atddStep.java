package rpn.test;

import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import rpn.RPNcalc;

public class atddStep {

    double result;
    
	@Given("^user enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
		RPNcalc rpn = new RPNcalc();
		result = rpn.calculate(arg1);
	}

	@Then("^result should be \"([^\"]*)\"$")
	public void result_should_be(String arg1) throws Throwable {
	    assertEquals(result, Double.valueOf(arg1),0);
	}

}

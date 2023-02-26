package pack;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("{string}")
    public void param1(String p) {
        System.out.println(p);
    }

    @When("{string}")
    public void param2(String p) {
        System.out.println(p);
    }

    @Then("{string}")
    public void param3(String p) {
        System.out.println(p);
    }

    /*@When("param = {string}")
    public void param(String string) throws Exception {
        switch (string) {
            case "pass":
                System.out.println("Success");
                break;
            case "fail":
                throw new Exception("Failing test");
            case "failedAssert":
                Assert.assertEquals("Test with failing assertion", 1, 2);
            case "skipByThrow":
                throw new PendingException();
        }
    }*/

    }

package com.mosesmansaray.springboot.inegration.cucumber.steps;

import com.mosesmansaray.springboot.inegration.cucumber.models.RestResponseModel;
import com.mosesmansaray.springboot.inegration.cucumber.config.CucumberStepsDefinition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@CucumberStepsDefinition
public class CommonSteps {

    @Autowired
    private RestResponseModel responseModel;

    @When("^the client receives status code of (\\d+)$")
    public void theClientReceivesStatusCodeOf(int statusCode) throws Throwable {
        final ResponseEntity response = responseModel.getResponse();
        assertThat(response.getStatusCode(), is(HttpStatus.valueOf(statusCode)));
    }

    @Then("^the client receives content \"([^\"]*)\"$")
    public void theClientReceivesContent(String responseBody) throws Throwable {
        final ResponseEntity response = responseModel.getResponse();
        assertThat(response.getBody().toString(), containsString(responseBody));
    }
}

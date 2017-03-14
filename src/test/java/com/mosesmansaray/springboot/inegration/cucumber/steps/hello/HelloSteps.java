package com.mosesmansaray.springboot.inegration.cucumber.steps.hello;

import com.mosesmansaray.springboot.inegration.cucumber.models.RestResponseModel;
import com.mosesmansaray.springboot.inegration.cucumber.config.CucumberStepsDefinition;
import com.mosesmansaray.springboot.inegration.cucumber.constants.AcceptanceTestConstants;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@CucumberStepsDefinition
public class HelloSteps {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RestResponseModel responseModel;

    @Given("^the client calls /hello$")
    public void theClientCallsHello() throws Throwable {

        ResponseEntity<String> forEntity = restTemplate.getForEntity(AcceptanceTestConstants.HELLO_WORLD_URI, String.class);
        saveResponse(forEntity);
    }


    public void saveResponse(final ResponseEntity responseEntity) {
        responseModel.setResponse(responseEntity);
    }
}

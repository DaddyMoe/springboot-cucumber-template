package com.mosesmansaray.springboot.inegration.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/failsafe-reports/acceptance-report"} )
public class AcceptanceTests {

}

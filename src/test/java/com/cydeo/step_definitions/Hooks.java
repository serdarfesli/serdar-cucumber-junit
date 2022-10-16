package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setupScenario() {
        System.out.println("==== Setting up browser using cucumber , starting Test ");
    }

    @After
    public void teardownScenario(Scenario scenario) {
if (scenario.isFailed()){
    byte [] screenShot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    scenario.attach(screenShot,"image/png",scenario.getName());
}
        Driver.closeDriver();
    }
}








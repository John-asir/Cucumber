package org.run;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\New folder\\Cucumber\\src\\test\\resources\\"
		+ "Features\\Login.Features", glue="org.step", 
		plugin= {"pretty","html:\\Cucumber\\target\\report"})

public class Runner {

}

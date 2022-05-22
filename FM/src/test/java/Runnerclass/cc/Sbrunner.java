package Runnerclass.cc;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =".\\FM\\featurefiles\\search.feature" ,glue = "stepdefination")
public class Sbrunner {
	
}

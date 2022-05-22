package Runnerclass.cc;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="\\FM\\featurefiles\\search2.feature" ,glue = "stepdefination")
public class sbrunner2 {

}

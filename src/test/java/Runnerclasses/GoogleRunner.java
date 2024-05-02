package Runnerclasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prava\\eclipse-workspace\\CUCUMBER\\src\\test\\resources\\Featurefile\\Google.feature",glue="Stepdeaf")
public class GoogleRunner{

}

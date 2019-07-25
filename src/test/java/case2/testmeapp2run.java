package case2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/case2/testmeapp2.feature",
glue="case2",
plugin="json:target\\jsonReport.json")
public class testmeapp2run {

}

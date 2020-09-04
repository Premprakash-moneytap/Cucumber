package Scripts;


import org.junit.runner.RunWith; 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class) 
@CucumberOptions(features = "C:\\Users\\DELL\\Desktop\\Test download\\Cucumber\\QA\\src\\main\\java\\Feature",
glue={"stepDefinition"},
format = {"pretty", "html:target/cucumber"}) 
public class runTest 
{ 
	
}
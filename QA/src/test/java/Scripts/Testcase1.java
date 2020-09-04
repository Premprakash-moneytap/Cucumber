package Scripts;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import Data.API_Auth;
import Data.API_ProfileData;
import Functions.API_NewFunctions;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.TestCase;

public class Testcase1  extends TestCase
{
	String Auth;
	String ExternalID;
	
	@Given("^Call Auth12312$")
	public void login() throws IOException, ParseException
	{
		Auth =API_NewFunctions.Auth_HDBFS(API_Auth.HBDFS_Username,API_Auth.HBDFS_Password);
		System.out.println(Auth);
		
	}
	@When("^fetch auth123123$")
	public void buildprofile() throws IOException, ParseException
	{
		ExternalID=API_NewFunctions.BuildProfile(Auth, API_ProfileData.HDBFS_ProfileData1);
		System.out.println(ExternalID);
	}

	@Then("^Validate213213$")
	public void display()
	{
		System.out.println(ExternalID);
	}
}

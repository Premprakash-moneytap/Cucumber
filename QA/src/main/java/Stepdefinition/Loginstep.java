package Stepdefinition;

import Data.API_Auth;
import Data.API_ProfileData;
import Functions.API_NewFunctions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Loginstep 
{

	String Auth;
	String ExternalID;
	
	
	@Given("^Call_Auth$")
	public void call_auth() throws Throwable {

		Auth =API_NewFunctions.Auth_HDBFS(API_Auth.HBDFS_Username,API_Auth.HBDFS_Password);
		System.out.println(Auth + "----------------------------");
	}
	
	@And("^Fetch_Auth$")
	public void fetch_auth() throws Throwable {
		ExternalID=API_NewFunctions.BuildProfile(Auth, API_ProfileData.HDBFS_ProfileData1);
		System.out.println(ExternalID);
	}
	

	@Then("^Validate$")
	public void Validate()
	{
		System.out.println(ExternalID);
	}
}


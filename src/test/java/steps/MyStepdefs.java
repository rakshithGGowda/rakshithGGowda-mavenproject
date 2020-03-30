package steps;

import dataProvider.ConfigFileReader;
import io.cucumber.java.en.*;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;


public class MyStepdefs {
    ConfigFileReader configFile= new ConfigFileReader();
    @Given("user sets base URI of JSON server")
    public void userPerformsGETOperationFor() throws Throwable {
        RestAssured.baseURI=configFile.getBaseUri();
    }

    @When("^user performs GET for post  number \"([^\"]*)\"$")
    public void userPerformsGETForPostNumber(String postNumber) throws Throwable {
        BDDStyleMethod.SimpleGetMethod(postNumber);
    }

    @Then("^author name must say \"([^\"]*)\"$")
    public void authorNameMustSay(String name) throws Throwable {

    }

    @Then("author names must be seen")
    public void authorNamesMustBeSeen() {
        BDDStyleMethod.PerformCollections();

    }

    @Then("path parameters must be passed")
    public void parametersMustBePassed() {
        BDDStyleMethod.WithPathParam();
    }

    @Then("query parameters must be passed")
    public void queryParametersMustBePassed() {
        BDDStyleMethod.WithQueryParam();
    }

    @When("user performs POST for creating post")
    public void userPerformsPOSTForCreatingPost() {
        System.out.println("Implementing post...");
    }

    @Then("new post has been created")
    public void newPostMustBeCreated() {

    }

    @When("user performs DELETE for deleting post")
    public void userPerformsDeleteForDeletePostNumber() {

    }



    @And("new {string},{string} and {string} are passed")
    public void newAndArePassed(String id, String title, String aname) {
        BDDStyleMethod.PostMethod(id,title,aname);
    }

    @Then("post with {string} must be deleted")
    public void postWithMustBeDeleted(String id) {
        BDDStyleMethod.DeleteMethod(id);
    }
}


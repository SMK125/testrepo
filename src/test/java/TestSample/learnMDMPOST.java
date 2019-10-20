package TestSample;

import org.testng.annotations.BeforeTest;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class learnMDMPOST {


@Test
public void checkMDMLogin()
{
	//JsonPath jsonPath =new JsonPath(new File("./src/test/java/request.json"));
	
System.out.println("This is MDM Login request");
RestAssured.baseURI="http://10.97.108.73:8180/eml/rest";

RequestSpecification httpRequest=RestAssured.given();

Response response=given().header("Cookie", "JSESSIONID=ioSaUWj-0l-lFUlH1DvvqiOxBVfHACKNfpvl6Jyb").and().queryParam("Authorization","YTpBZG1pbjEyMzpTUDE=").and().contentType(ContentType.JSON).when().get("/login/userinfo/SP1").then().
assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();
String RS=response.asString();
System.out.println("Response is : "+RS);

JsonPath JS=new JsonPath(RS);
String str1=JS.get("sessionId");
System.out.println("JSON Path is : "+JS);
System.out.println("sessionID from JSON Path is : "+str1);
		//Create a place =response (place id)



}

}


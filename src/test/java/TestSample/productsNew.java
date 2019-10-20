package TestSample;

import org.testng.annotations.BeforeTest;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class productsNew {

	@BeforeTest
	public void beforeTest() {
		RestAssured.baseURI = "http://localhost:3030/";
		RestAssured.port = 3030;
	}

	@Test
	public void getProducts()

	{
		//Response response=RestAssured.given().param("$limit",5).and().param("$skip",4).get("/products").then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();
		RestAssured.given().param("$limit",5).and().param("$skip",4).get("/products").then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
		//String rs=response.asString();
		//System.out.println(rs);
	}
	@Test
	public void getAPIVersion()
	{
		//RestAssured.given().get("/version").then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status", equalTo("OK"));
		Response RS=RestAssured.given().get("/version");
		String str=RS.asString();
		System.out.println(str);
		
	}
}

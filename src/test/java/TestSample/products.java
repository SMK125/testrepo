package TestSample;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

public class products {

	@BeforeTest
	public void beforeTest() {
		RestAssured.baseURI = "http://localhost:3030/";
		RestAssured.port = 3030;
	}

	@Test
	public void getProducts()

	{
		RestAssured.given().param("$limit",5).get("/products").then().assertThat().body("status",equalTo("OK"));
		//String jsonRespones = response.asString();
		//JsonPath js=new JsonPath(jsonRespones);
		//System.out.println(jsonRespones);
		
		
	}
}

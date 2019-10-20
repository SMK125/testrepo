package TestSample;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class learnPOST {

	Properties prop = new Properties();

	@BeforeTest
	public void getDatafromProp() throws IOException {

		FileInputStream FIS = new FileInputStream(
				"C:\\Users\\smulani\\eclipse-workspace\\com.tibco.mdm.sample\\src\\test\\java\\setEnvProperties\\env.properties");

		prop.load(FIS);

	}

	public void createPlaceAPI()

	{
		// JsonPath jsonPath =new JsonPath(new File("./src/test/java/request.json"));

		RestAssured.baseURI = "http://216.10.245.166";

		RequestSpecification httpRequest = RestAssured.given();

		given().queryParam("key", "qaclick123").

//body(new File("./src/test/java/resource/request.json")).
				body(new File("C:/Users/smulani/Desktop/request.json")).when().

				post("/maps/api/place/add/json").

				then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().

				body("status", equalTo("OK"));

// Create a place =response (place id)

// delete Place = (Request - Place id)

	}

	@Test
	public void deletePlace() {

		RestAssured.baseURI = prop.getProperty("HOST");
		Response RS = given().queryParam("key", "qaclick123").
		// body(new File("./src/test/java/resource/request.json")).
				body(new File("C:/Users/smulani/Desktop/request.json")).when().post("/maps/api/place/add/json").then()
				.assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status", equalTo("OK"))
				.extract().response();

		String AS = RS.asString();
		System.out.println(AS);
// Reposne is stored in AS,get parameters from response
		JsonPath JS = new JsonPath(AS);
		String pid = JS.get("place_id");
		System.out.println("Place ID is " + pid);

	}

}
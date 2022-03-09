package february2022.tugas5;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APITest extends BaseAPITest{
	
	@Test
	public void registerTest() {
		Response response = given().spec(commonJsonSpec).body(registerPayload).when().post("/register");
		assertEquals(response.getStatusCode(), 201);
		
		JsonPath jsonPathMatch = response.jsonPath();
		String Status = jsonPathMatch.get("Status");
		System.out.println("Status : " + Status);
		
		assertEquals(Status, "Created");
		String Message = jsonPathMatch.get("Message");
		System.out.println("Message : " + Message);
		
		assertEquals(Message, "New User Registered");
		
	}
}

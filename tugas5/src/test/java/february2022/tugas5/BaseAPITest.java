package february2022.tugas5;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;

import com.github.javafaker.Faker;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import february2022.tugas5.utils.DataUtility;

public class BaseAPITest {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com")
			.setContentType(ContentType.JSON).build().log().all();
//	RequestSpecification loginJsonSpec;
//	String token;
	
	Faker dummyData =  new Faker();
	
	String username = dummyData.name().username();
	String password = dummyData.internet().password(true);
	String email = dummyData.internet().emailAddress();
	String phoneNumber = dummyData.phoneNumber().phoneNumber();
	
	String payload = "{\"username\": \"%s\", \"password\": \"%s\", \"email\": \"%s\", \"phoneNumber\": \"%s\", }";
	String registerPayload = String.format(payload, username, password, email, phoneNumber);
	
	

//	@BeforeMethod
//	public void login() {
//		// ini adalah metode untuk hard code
//		// String loginPayload = "{\"email\": \"jogidemo321@gmail.com\",
//		// \"password\":\"builder123\"}";
//		// sementara dibawah adalah metode untuk memanggil data dengan menggunakan fillo
//		String loginPayload = DataUtility.getDataFromExcel("Payloads", "LoginPayload");
//		System.out.println(loginPayload);
//		Response response = given().spec(commonJsonSpec).body(loginPayload).when().post("/users/sign_in");
//		assertEquals(response.getStatusCode(), 200);
//		token = response.jsonPath().get("user.authtoken");
//		loginJsonSpec = new RequestSpecBuilder().setBaseUri("https://api-staging-builder.engineer.ai")
//				.setContentType(ContentType.JSON).addHeader("authtoken", token).build().log().all();
//	}
}

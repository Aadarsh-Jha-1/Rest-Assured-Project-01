package googlePlaceAPI.Requests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import googlePlaceAPI.Utils.Payload;
import googlePlaceAPI.Utils.Urls;

public class AddPlaceAPI {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = Urls.getBaseUrl();
		
	// Here We will give all the query parameters, headers and pay-loads	
		given()
		.log().all()
		.queryParam("key","qaclick123")
		.header("Content-Type","application/json")
		.body(Payload.getAddPlacePayload())
		
	
	// Here we will define the method or the crud operation with the respective end point	
		.when()
		.post(Urls.getAddPlaceEndPoint())

	
	// Here we will write all the assertions and test cases	
		.then()
		.log().all()
		
	//Status Code
		.assertThat().statusCode(200)
		
	//Data Verification
		.body("scope", equalTo("APP"))
		.body("status", equalTo("OK"))
		.body("place_id", instanceOf(String.class))
		.body("id", instanceOf(String.class))
		.header("Server","Apache/2.4.52 (Ubuntu)");
		
	
	}

}
 

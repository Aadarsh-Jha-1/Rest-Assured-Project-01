package googlePlaceAPI.Utils;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;



public class UtilityFunctions {
	
	
	// Get value of key
	
	public static String  getStringValueOf(String key,String responseData) {
		
		JsonPath  js = new JsonPath(responseData);
		
		String value = js.getString(key);
	
		return value;
		
	}
	
	
	
	
	//Add Place API
	
	public static String  AddPlaceAPI() {
		
		RestAssured.baseURI = Urls.getBaseUrl();
		
		String responseData = 

		 given()
		.queryParam("key","qaclick123")
		.header("Content-Type","application/json")
		.body(Payload.getAddPlacePayload())
	    .when()
		.post(Urls.getAddPlaceEndPoint())
	    .then()
		.assertThat()
		.statusCode(200)
		.body("scope", equalTo("APP"))
		.body("status", equalTo("OK"))
		.body("place_id", instanceOf(String.class))
		.body("id", instanceOf(String.class))
		.header("Server","Apache/2.4.52 (Ubuntu)")
		.extract().response().asString();
		
		return responseData;
		
	}
	
	
	
	//Get Place API
	
	public static void GetPlaceAPI(String placeIdValue) {
		
		RestAssured.baseURI = Urls.getBaseUrl();
		
		RestAssured.baseURI = Urls.getBaseUrl();

		     given()
		    .queryParam("place_id", placeIdValue)
		    .queryParam("key", "qaclick123")
		    .when()
		    .get(Urls.getPlaceEndPoint())
		    .then()
		    .assertThat()
		    .statusCode(200)  // Verify status code
		    .body("name", equalTo("Frontline house"))
			.body("types",equalTo("shoe park,shop"))
			.body("address",equalTo("29, side layout, cohen 09"));
	}
	

}

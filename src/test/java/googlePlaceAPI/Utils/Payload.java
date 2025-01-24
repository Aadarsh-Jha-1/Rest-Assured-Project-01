package googlePlaceAPI.Utils;

public class Payload {
	
	private static String addPlacePayload=
			
			"{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Frontline house\",\r\n"
			+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
			+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "  ],\r\n"
			+ "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n"
			+ "}";
	
	
	private static String updatePlacePayload(String placeID) 
	
		{
	
		return "{\r\n"
	            + "\"place_id\":\"" + placeID + "\",\r\n"
	            + "\"address\":\"70 winter walk, USA\",\r\n"
	            + "\"key\":\"qaclick123\"\r\n"
	            + "}";
	
		}
	
	
	private static String deletePlacePayload(String placeID) 
	
		{
	
		return "{\n\"place_id\":\"" + placeID + "\"\n}";
	
		}
	
	
	
	
	
	public static String getAddPlacePayload() 
	
		{
	
		return addPlacePayload;		
	
		}
	
	public static String getUpdatePlacePayload(String placeID) 
	
		{
	
		return updatePlacePayload(placeID);
	
		}
	
	public static String getdeletePlacePayload(String placeIdValue) 
	
		{
	
		return deletePlacePayload(placeIdValue);
	
		}

}

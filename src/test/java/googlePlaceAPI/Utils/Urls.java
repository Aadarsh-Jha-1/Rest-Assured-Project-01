package googlePlaceAPI.Utils;

public class Urls {

    
	private static String baseUrl = "https://rahulshettyacademy.com";

    public static String getBaseUrl() {
        return baseUrl;
    }
	 
    
	 
    private static String addPlaceEndPoint = "maps/api/place/add/json";
	 
	    public static String getAddPlaceEndPoint() {
	        return addPlaceEndPoint;
	    }
	    
	    
	    private static String getPlace = "maps/api/place/get/json";
		 
	    public static String getPlaceEndPoint() {
	        return getPlace;
	    }
	    
	    private static String updatePlace = "maps/api/place/update/json";
		 
	    public static String updatePlaceEndPoint() {
	        return updatePlace;
	    }

}

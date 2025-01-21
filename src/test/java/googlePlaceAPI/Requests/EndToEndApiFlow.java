package googlePlaceAPI.Requests;

import googlePlaceAPI.Utils.UtilityFunctions;

public class EndToEndApiFlow {
	
	public static void main(String[] args) {
		

		String responseData = UtilityFunctions.AddPlaceAPI();
		
		String placeID = UtilityFunctions.getStringValueOf("place_id", responseData);
		
		System.out.println("Place ID : "+placeID);
		
		
		// Add Others Methods 
		
	
	}

}
 

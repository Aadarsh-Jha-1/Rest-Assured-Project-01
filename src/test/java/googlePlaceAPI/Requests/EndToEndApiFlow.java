package googlePlaceAPI.Requests;

import googlePlaceAPI.Utils.UtilityFunctions;

public class EndToEndApiFlow {
	
	public static void main(String[] args) {
		

		String initialAddress = "29, side layout, cohen 09";
		
		String updatedAddress = "70 winter walk, USA";
		
		
		String responseData = UtilityFunctions.AddPlaceAPI();
		
		String placeID = UtilityFunctions.getStringValueOf("place_id", responseData);
		
		System.out.println("Place ID : "+placeID);
		
		
		// Add Others Methods 
		
		UtilityFunctions.GetPlaceAPI(placeID,initialAddress);
		
		UtilityFunctions.UpdatePlaceAPI(placeID);
		
		UtilityFunctions.GetPlaceAPI(placeID,updatedAddress);
		
		
		
	
	}

}
 

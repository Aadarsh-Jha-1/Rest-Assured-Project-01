package googlePlaceAPI.Requests;

import googlePlaceAPI.Utils.UtilityFunctions;

public class EndToEndApiFlow {
	
	public static void main(String[] args) {
		

		// Address Declaration
		
		String initialAddress = "29, side layout, cohen 09";
		
		String updatedAddress = "70 winter walk, USA";
		
		
		// Add Place API
		
		String responseData = UtilityFunctions.AddPlaceAPI();
		
		
		// Extract Place ID
		
		String placeID = UtilityFunctions.getStringValueOf("place_id", responseData);
		
		System.out.println("Place ID : "+placeID);
		

		// Get Place API
		
		UtilityFunctions.GetPlaceAPI(placeID,initialAddress);
		
		
		//Update Place API
		
		UtilityFunctions.UpdatePlaceAPI(placeID);
		
		
		// Check Updated Address
		
		UtilityFunctions.GetPlaceAPI(placeID,updatedAddress);
		
	
		//Delete Place API
		
		UtilityFunctions.DeletePlaceAPI(placeID);
		
		
		// Confirm deletion Of Place
		
		UtilityFunctions.ConfirmDeletion(placeID);
		
	}

}
 

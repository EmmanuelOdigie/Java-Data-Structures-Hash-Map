package JavaHashMap; // project made in eclipse

import java.util.HashMap; // imported HashMap class

public class JavaHashMapCities { // public class created 'JavaHashMapCities'

	public static void main(String[] args) { // Reads, runs & executes code
		//created an object from imported class HashMap set as a string - HashMap<String,String>
				//HashMap<String,String> - this is set up like this because it takes two String(txt) values
				//HashMap also takes others like integer it'll be this - HashMap<Integer, Integer>
				//Object made is 'myCities'
					HashMap<String,String> myCities = new HashMap<String,String>();
					
				// object calls onto the '.put' function to put in values of the two String(txt) into the object
					myCities.put("Ireland ", " Dublin");
					myCities.put("England ", " London");
					myCities.put("Italy ", " Rome");
					myCities.put("Netherlands ", " Amsterdam");
					myCities.put("America ", " Washington DC");
					myCities.put("America ", " Washington DC"); // duplicate, won't add it in
					
					for(String cities: myCities.values()) { // the values in object myCities are 
						// transferred into string cities in the for loop
						
						System.out.println(cities); // The values in object 'myCities' are now put into String 'cities'
						// the '.values()' is used to create the loop of the values after first key - the cities in this case
						
					}

			}
	}
	
// Display Cities
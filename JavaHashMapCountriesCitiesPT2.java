package JavaHashMap; // project made in eclipse
import java.util.HashMap;

public class JavaHashMapCountriesCitiesPT2 { // created public class 'JavaHashMapCountriesCities'

	public static void main(String[] args) { // reads, runs & executes
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
					
				// created for loop, set up a string variable 'countryCity', that takes in the object
				// myCities.keySet() - takes in the first set of the String thats in the object 'myCities'
				// got the object to call onto the '.get()' function to get the data in the keySet()
				// which will be the cities, then display them using System.out.println
					for(String countryCity : myCities.keySet()) {
						System.out.println("Country: " + countryCity + " -> " + " City:" + myCities.get(countryCity));
					}
		

	}
	
// result:
//Country: Netherlands  ->  City: Amsterdam
//Country: England  ->  City: London
//Country: America  ->  City: Washington DC
//Country: Ireland  ->  City: Dublin
//Country: Italy  ->  City: Rome

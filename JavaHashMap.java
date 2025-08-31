package JavaHashMap; // project made in eclipse
import java.util.HashMap; // imported HashMap class

public class JavaHashMap {// created public class 'JavaHashMap'

	public static void main(String[] args) {// reads, run & executes code
		
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
		
		System.out.println(myCities); // Displays the values in object 'myCities'

	}

}

// result: {Netherlands = Amsterdam, England = London, America = Washington DC, Ireland = Dublin, Italy = Rome}
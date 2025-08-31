// Java Data Structures: ArrayList //

package JavaDataStructures; // java project created when setting up

import java.util.HashMap; //import HashMaps

public class MyHashMaps {// created public class named 'MyHashMaps'

	public static void main(String[] args) {// reads, runs & executes
		
	// created object from inported class HashMap<String,String> named 'myArtistAlbums'
		HashMap<String, String> myArtistAlbums = new HashMap<String,String>();
		
// HashMap is good for storing and displaying pairs of information, use object created to call on the '.put' to add the information in the bracket	
		myArtistAlbums.put("Lil Wayne", " Carter VI"); // object calls onto the '.put' function, I put in the pair of strings I want to store using " " and a comma to add another string (txt)
		myArtistAlbums.put("Drake", " Iceman"); // object calls onto the '.put' function, I put in the pair of strings I want to store using " " and a comma to add another string (txt)
		myArtistAlbums.put("Kenderick", " GNX"); // object calls onto the '.put' function, I put in the pair of strings I want to store using " " and a comma to add another string (txt)
		myArtistAlbums.put("The Clipse", " Let God sort em out"); // object calls onto the '.put' function, I put in the pair of strings I want to store using " " and a comma to add another string (txt)
		myArtistAlbums.put("Lil Baby", " WHAM"); // object calls onto the '.put' function, I put in the pair of strings I want to store using " " and a comma to add another string (txt)
		System.out.println(myArtistAlbums); // display the information stored in 'myArtistAlbums'
		
		// it will display information with an equal sign
		// it useful to use if they relate to each other
		

	}

}

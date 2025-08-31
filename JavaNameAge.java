package JavaHashMap; // project created in eclipse
import java.util.HashMap; // imported HashMap class

public class JavaNameAge {// created a public class names 'JavaNameAge'

	public static void main(String[] args) {//read,runs & executes code
	
// created an object of imported class named 'myListNamesAge' the class set up to take <String,Integer>
// set up as - HashMap<String,Integer>
		HashMap<String,Integer> myListNamesAge = new HashMap<String,Integer>();
		
	//object calls onto the '.put' function to put the two attributes into the object
		myListNamesAge.put("Emmanuel", 26);
		myListNamesAge.put("Sola", 26);
		myListNamesAge.put("Ash", 25);
		myListNamesAge.put("Mom", 59);
		myListNamesAge.put("Dad", 63);
		myListNamesAge.put("Esther", 21);
		
	// Display text 
		System.out.println("Friends and families name & age");
	
	// for loop created with a string variable made called 'name' that takes in the first 
	// information - the names and stores it in attribute String 'name' taken from the object
	// the for loop with the keySet also stores the age in variable 'name'
	// when using system.out.println, calling onto string variable name will only display the first key of information
	//to display the ae included the object needs to call onto the '.get' function and string 'name'
	// myListNameAge.get(name) - this will display the age also
		for(String name : myListNamesAge.keySet()) {
			
			System.out.println("Name: " + name + " -> " + "Age: " + myListNamesAge.get(name));
		}

	}

}

// Result:
//Friends and families name & age
//Name: Sola -> Age: 26
//Name: Dad -> Age: 63
//Name: Esther -> Age: 21
//Name: Ash -> Age: 25
//Name: Emmanuel -> Age: 26
//Name: Mom -> Age: 59

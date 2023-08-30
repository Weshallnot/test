// Java Program to Convert Character Array to String
// Using copyOf() method ofArrays() Class

// Importing required classes
import java.util.*;

// Main class
class GFG {
    int saf;
    
    
    

	// Method 1
	// To convert a character
	// array to a string using the constructor
	public static String toString(char[] S)
	{
		// Creating object of String class
		String string = new String(S);

		return string;
	}

	// Method 2
	// Main driver method
	public static void main(String args[])
	{

		// Declaring and initializing a character array
		char s[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
					'r', 'g', 'e', 'e', 'k', 's' };

		// Printing converted string from character array
		System.out.println(toString(s));
	}
}

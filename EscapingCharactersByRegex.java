// Java Program to Illustrate Escaping Characters in Java
// Regex Using \Q and \E for escaping

// Importing required classes
import java.io.*;
import java.util.regex.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Sample strings as inputs
		String s = "Geeks.forGeeks";
		String s1 = "GeeksforGeeks";

		// Creating object of Pattern class

		// 1. Patterns with dot escaped
		Pattern p = Pattern.compile("\\Q.\\E");

		// 2, Pattern without dot escaped
		Pattern p1 = Pattern.compile(".");

		// Matchers for each pattern string combination
		Matcher m = p.matcher(s);
		Matcher m1 = p.matcher(s1);
		Matcher m2 = p1.matcher(s);
		Matcher m3 = p1.matcher(s1);

		// Print and display whether p,p1 matches
		// or not via boolean true false
		System.out.println("p matches s: " + m.find());
		System.out.println("p matches s1: " + m1.find());
		System.out.println("p1 matches s: " + m2.find());
		System.out.println("p1 matches s1: " + m3.find());
	}
}

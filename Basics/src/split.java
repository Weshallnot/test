// Java program to demonstrate working of split(regex,
// limit) with small limit.

public class split {

	// Main driver method
	public static void main(String args[])
	{
		// Custom input string
		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("ks",2);

		for (String a : arrOfStr)
			System.out.println(a);
	}
}

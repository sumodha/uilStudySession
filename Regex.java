import java.util.*;
import java.io.*;


public class Regex {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("backslash.dat"));
	    s.useDelimiter("[a ]{5}");
		while (s.hasNext())
		 System.out.println(s.next());
	}

}

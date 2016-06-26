import java.util.*;
import java.io.*;

public class FriendMap{
	public static void main(String [ ] args){
		System.out.println("Program Start");

		//Parse the friend list
		Parser myParser = new Parser();
		myParser.parse("Friendlist.txt");
	}	
}



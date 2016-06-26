
import java.io.*;
import java.util.*;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;
public class Parser{
	
	String filename;

	Parser(String filename){
		this.filename = filename;
	}

	Parser(){};

	public void parse(String filename){
		try{
			JsonReader reader = Json.createReader(new FileReader(filename));
			System.out.println("Parsing filename " + filename);
		}
		catch(FileNotFoundException e){
			System.out.println("file " + filename + " not found.");
		}
		/*
		
	
		JSONObject obj = new JSONObject(filename);
		JSONArray arr = obj.getJSONArray("people");
		System.println("Array legnth: " + arr.legnth);
		for (int i = 0; i < arr.length(); i++){
		    System.out.println(arr.getJSONObject(i).getString("first_name") );
		
		
		
		}
		*/
	}
}
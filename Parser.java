package customMap;

import java.io.*;
import java.util.*;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;

public class Parser{
	
	String filename;
	String workingDirectory;

	Parser(String filename){
		this.filename = filename;
		this.workingDirectory = "/Users/RAF/Google Drive/Github/FriendMap";
	}

	Parser(){};

	public void parse(String filename){
		String fullPath = workingDirectory + "/" + filename;
		System.out.println("INSIDE THE METHOD>>> fullPath = " + fullPath);

		try{
			JsonReader reader = Json.createReader(new FileReader(fullPath));
			System.out.println("Parsing filename " + filename);
		}
		catch(FileNotFoundException e){
			System.out.println("files " + fullPath + " not found.");
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
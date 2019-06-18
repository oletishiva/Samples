package com.exmaples;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		//JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader reader = new FileReader(System.getProperty("user.dir")+"/MyInfoError.JSON"))
		{
			//Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);
            parseEmployeeObject(jsonObject,"email_mobile_error");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}

	private static void parseEmployeeObject(JSONObject employee,String errorString) 
	{
		//Get employee object within list
		JSONObject employeeObject = (JSONObject) employee.get(errorString);
		
		//Get employee first name
		String firstName = (String) employeeObject.get("errorTitle");	
		System.out.println(firstName);
		
		//Get employee last name
		String lastName = (String) employeeObject.get("errorDescription");	
		System.out.println(lastName);
		
	}
}

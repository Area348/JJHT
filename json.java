//-- javac -cp ".;g:\git\JJHT\gson-2.6.2.jar" test.java

import java.util.*;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.google.gson.Gson;


public class json
{

	public static void openURL(String URL, String LIST)
	{
		String json = 	readUrl(URL);
		Gson gson 	= 	new Gson();
		//Meta meta 	= 	gson.fromJson(json,LIST);
	}//-- Einde method openURL()
	
	
	private static String readUrl(String urlString) throws Exception 
	{
		BufferedReader reader = null;
		try 
		{
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read); 

			return buffer.toString();
		}
		catch(Exception e)
		{
			System.out.println("BufferedReader Error!!!");
			//return null;
		}
		finally 
		{
			if (reader != null)
				reader.close();
		}
	}//-- Einde method readUrl()
	
}//-- Einde Class
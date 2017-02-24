//-- javac -cp ".;g:\git\JJHT\gson-2.6.2.jar" test.java

import java.util.*;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.google.gson.Gson;


public class test
{
	
	public static void main(String args[]) throws Exception
	{
		
		System.out.print("test 123");
		
		
		
		
		
		System.out.println(" 456");
		ArrayList<String> test 	= new ArrayList<String>();
		test.add("Host");
		test.add("Accept"); 
		test.add("DNT");
		
		String URL 	=	"http://ip.jsontest.com/";
		URL 		= 	"http://headers.jsontest.com/";
		String json = 	readUrl(URL);
		Gson gson 	= new Gson();
		
		Page page 	= gson.fromJson(json,Page.class);
		
		for(String item : test)
		{
			System.out.println(item);
		}
		
		
		System.out.println(page.Host);
		
		

		
		
		
	}//-- Einde Method main()
	
	static class Item 
	{
		String Host;
		String Accept;
		String DNT;

	}

	static class Page 
	{
		String Host;
		String Accept;
		String DNT;
		
	}
	
	
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
		finally 
		{
			if (reader != null)
				reader.close();
		}
	}//-- Einde method readUrl()
	
	
	
		
	
}//-- Einde Class
//-- javac -cp ".;g:\git\JJHT\gson-2.6.2.jar" test.java

import java.net.URL;
import java.io.InputStreamReader;
import java.io.InputStreamReader;
import com.google.gson.Gson;

public class test
{
	
	public static void main(String args[])
	{
		
		System.out.print("test 123");
		
		
		Gson gson = new Gson();
		
		
		System.out.println(" 456");
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
	}
	
	
	
	
	
	
	
}
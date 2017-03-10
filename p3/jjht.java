//-- javac -cp ".;g:\git\JJHT\gson-2.6.2.jar" JJHT.java

import java.util.*;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.google.gson.Gson;
import java.lang.reflect.Field;

public class jjht
{
	public static void main(String[] args) throws Exception 
	{

	//-- Verkrijg de inhoud van de website. (in dit geval json)
		String json = readUrl("http://jotihunt-api-v2.area348.nl/vos/cKOFQls4ihdc2FiR05qrIDOK5Ub8D0Ksive2xwRKmDmVcWVo22hvl0E65sKxJtOFfExN659Nhmn1eAphVm0WQKmQXnckHjKf59HVy0ie5tgu9CNyH3CLeSXXGFxuywycN2KqSkk1LW1kW12cl86WumqrjkJ1h6fwniFj40ecjNFyBNadSzsvCeLjNnOVS4OeQWty831KK2b98WaBhoHsCtZxaMLdmpfjaX8b5uFG3Dz7yt2nxBNLv659pAASI8y/A/all");					  
	//--Print de verkregen inhout van json, voor controle van de inhoud.
		System.out.println(json);
		System.out.println("---------------------------");
	//-- Verkrijg het TYPE van de inhoud van json (vrees dat het hier altijd om een string gaat).
		Class cls = json.getClass();	
	//-- Print het TYPE of json.
		System.out.println("The type of object is: " + cls.getName());
		System.out.println("---------------------------");
	
	//-- Maak een nieuw Gson object aan en noem deze gson.
		Gson gson = new Gson();  
		
		//.getType();
		
		
		System.out.println("---------------------------");
	//-- fromJson zo als die bij 1 object werkt.	
		//-- Page page = gson.fromJson(json, Page.class);

		Object naam = gson.fromJson(URLJOTIAPI, ......)
		
		
		// Field[] fields = page.getClass().getDeclaredFields();
		// for (int i=0; i<fields.length; i++)
		// {
			// System.out.println(fields[i].getName() + " - " + fields[i].get(page));
		// }
		
		System.out.println("---------------------------");
		//System.out.println(page.id);
		
		
		for (Item item : page.items)
		{
			System.out.println("    " + item.id);
		}
		
	}

	private static String readUrl(String urlString) throws Exception {
		BufferedReader reader = null;
		try {
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read); 

			return buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}
	}
}
//-- javac -cp ".;g:\git\JJHT\gson-2.6.2.jar" JJHT.java

import java.util.*;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class p3
{


	public static void main(String[] args) throws Exception 
	{

	// JsonParser parser = new JsonParser();
	// JsonObject rootObejct = parser.parse(yourJsonString).getAsJsonObject();
	// JsonElement projectElement = rootObejct.get("project");
	
	
	//-- Verkrijg de inhoud van de website. (in dit geval json)
		System.out.print("Inhoud URL (A/last - Single line):");
		String json = readUrl("http://jotihunt-api-v2.area348.nl/vos/cKOFQls4ihdc2FiR05qrIDOK5Ub8D0Ksive2xwRKmDmVcWVo22hvl0E65sKxJtOFfExN659Nhmn1eAphVm0WQKmQXnckHjKf59HVy0ie5tgu9CNyH3CLeSXXGFxuywycN2KqSkk1LW1kW12cl86WumqrjkJ1h6fwniFj40ecjNFyBNadSzsvCeLjNnOVS4OeQWty831KK2b98WaBhoHsCtZxaMLdmpfjaX8b5uFG3Dz7yt2nxBNLv659pAASI8y/A/last");					  
	//--Print de verkregen inhout van json, voor controle van de inhoud.
		System.out.println(json);
		System.out.println("");
	//-- Verkrijg het TYPE van de inhoud van json (vrees dat het hier altijd om een string gaat).
		Class cls = json.getClass();	
	//-- Print het TYPE of json.
		System.out.println("The type of object is: " + cls.getName());
		System.out.println("");
	
	//-- Maak een nieuw Gson object aan en noem deze gson.
		Gson gson = new Gson();  
		
		//.getType();
		
	
		System.out.println("");
	//-- fromJson zo als die bij 1 object werkt.	
		System.out.print("gson.fromJson(): ");
		Page page = gson.fromJson(json, Page.class);
		System.out.println("");
		System.out.println("");
	//-- Laat het id van het object (van uit de db zien)
		System.out.println("id in de db:" + page.id +"Single ref op gehaald via page.id.");
		System.out.println("");
		System.out.println("");
		System.out.println("RUN FIELDS:");
		Field[] fields = page.getClass().getDeclaredFields();
		for (int i=0; i<fields.length; i++)
		{
			System.out.println("\t" + fields[i].getName() + " - " + fields[i].get(page));
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		


//-- OBJECT binnen halen.		
		System.out.print("Inhoud URL2 (A/All Multi lines.): ");
		String json2 = readUrl("http://jotihunt-api-v2.area348.nl/vos/cKOFQls4ihdc2FiR05qrIDOK5Ub8D0Ksive2xwRKmDmVcWVo22hvl0E65sKxJtOFfExN659Nhmn1eAphVm0WQKmQXnckHjKf59HVy0ie5tgu9CNyH3CLeSXXGFxuywycN2KqSkk1LW1kW12cl86WumqrjkJ1h6fwniFj40ecjNFyBNadSzsvCeLjNnOVS4OeQWty831KK2b98WaBhoHsCtZxaMLdmpfjaX8b5uFG3Dz7yt2nxBNLv659pAASI8y/A/all");					  
	//--Print de verkregen inhout van jsons, voor controle van de inhoud.
		System.out.println(json2);
		System.out.println("");
	//-- Verkrijg het TYPE van de inhoud van json2 (vrees dat het hier altijd om een string gaat).
		Class cls2 = json2.getClass();	
	//-- Print het TYPE of json.
		System.out.println("The type of object is: " + cls2.getName());
		System.out.println("");
		
	
	//-- Maak een nieuw Gson object aan en noem deze gson.
		Gson gson2 = new Gson();  
		
		//.getType();
		
	
		System.out.println("");
	//-- fromJson zo als die bij 1 object werkt.	
		System.out.print("gson2.fromJson(): ");
		Page[] page2 = gson2.fromJson(json2, Page[].class);
		System.out.println("");
		System.out.println("");
	//-- Laat het id van het object (van uit de db zien)
		System.out.println("id in de db:" + page2[0].id +" (Single ref op gehaald via page2[#].id.)");
		System.out.println("");
		System.out.println("");
		System.out.println("RUN FIELDS:");
		System.out.println("Aantal Objecten gevonden in de array = " + page2.length);
		
		for (int t = 0; t < page2.length; t++)
		{
			System.out.println("T = " + t);
			Field[] fields2 = page2[t].getClass().getDeclaredFields();
			for (int i=0; i<fields2.length; i++)
			{
				System.out.println("\t" + fields2[i].getName() + " - " + fields2[i].get(page2[t]));
			}
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");



	
		
		//Page[] page2 = gson.fromJson(jsonString,Page[].class);
		
		//System.out.println("TEST: " + json2.getType());
		
		// if(json2.isJsonObject())
		// {
			// System.out.println("Json2 is een object.");
		// }
		// else if(json2.isJsonArray())
		// {
			// System.out.println("Json2 is een Array.");
		// }
		
		
		
		
		
		
//-- HIER MEE VERDER ZIE:
//-- http://stackoverflow.com/questions/16654042/gson-expected-begin-array-but-was-begin-object
//-- http://sachinpatil.com/blog/2012/07/03/gson/
	//Page[] test = gson.fromJson(json2, Page[].class);
	
	//System.out.println("Json2: " + json2);
	//Page[] test = gson.fromJson(json2, Page[].class);
	
	//String test = json2.getClass();
	
//	Gson gson2 = new Gson();
//	Type token = new TypeToken<List<gson2>>(){}.getType();
//	return gson2.fromJson(json2, token);
	
//	System.out.println(token);
	
	
	// try{
		// Hunter hunter = gson.fromJson(...,Hunter.class);
		// doe iets met hunter.
	// }  catch(NOTANOBJECTERROR  e){
		// aannemen dat het een array is.
		// Hunter[] hunters = gson.fromJson(...,Hunter[].class);
	// }
		
		
		
		//Object naam = gson.fromJson(URLJOTIAPI, ......);
		
		

		

		
		
		
		
		// System.out.print("Inhoud URL: ");
		// String json = readUrl("http://jotihunt-api-v2.area348.nl/vos/cKOFQls4ihdc2FiR05qrIDOK5Ub8D0Ksive2xwRKmDmVcWVo22hvl0E65sKxJtOFfExN659Nhmn1eAphVm0WQKmQXnckHjKf59HVy0ie5tgu9CNyH3CLeSXXGFxuywycN2KqSkk1LW1kW12cl86WumqrjkJ1h6fwniFj40ecjNFyBNadSzsvCeLjNnOVS4OeQWty831KK2b98WaBhoHsCtZxaMLdmpfjaX8b5uFG3Dz7yt2nxBNLv659pAASI8y/A/last");					  
		
		
		// for (Item item : Page.items)
		// {
			// System.out.println("    " + item.id);
		// }

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
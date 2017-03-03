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

		String json = readUrl("http://jotihunt-api-v2.area348.nl/vos/cKOFQls4ihdc2FiR05qrIDOK5Ub8D0Ksive2xwRKmDmVcWVo22hvl0E65sKxJtOFfExN659Nhmn1eAphVm0WQKmQXnckHjKf59HVy0ie5tgu9CNyH3CLeSXXGFxuywycN2KqSkk1LW1kW12cl86WumqrjkJ1h6fwniFj40ecjNFyBNadSzsvCeLjNnOVS4OeQWty831KK2b98WaBhoHsCtZxaMLdmpfjaX8b5uFG3Dz7yt2nxBNLv659pAASI8y/A/all");					  

		Gson gson = new Gson();        
		Page page = gson.fromJson(json, Page.class);

		/*
		Field[] fields = page.getClass().getDeclaredFields();
		for (int i=0; i<fields.length; i++)
		{
			System.out.println(fields[i].getName() + " - " + fields[i].get(page));
		}
		*/
		System.out.println("---------------------------");
		//System.out.println(page.id);
		
		/*
		for (Item item : page.items)
		{
			System.out.println("    " + item.id);
		}
		*/
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
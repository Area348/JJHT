//-- javac -cp ".;g:\git\JJHT\gson-2.6.2.jar" JJHT.java

import java.util.*;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.google.gson.Gson;


public class jjht
{
	public static void main(String[] args) throws Exception {

		String json = readUrl("http://www.javascriptkit.com/"
							  + "dhtmltutors/javascriptkit.json");

		Gson gson = new Gson();        
		Page page = gson.fromJson(json, Page.class);

		System.out.println(page.title);
		for (Item item : page.items)
			System.out.println("    " + item.title);
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
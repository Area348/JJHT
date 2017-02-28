//-- javac -cp ".;g:\git\JJHT\gson-2.6.2.jar" meta.java

import java.util.*;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.google.gson.Gson;

//-- Class voor het afhandelen van alle meta info
public class meta extends json
{
	//Class vars:
	String API_VERSION 	= null;
	String MAP			= null;
	String URL			= null;
	String JAAR			= null;
	String THEMA		= null;
	String KML_URL		= null;
	String type			= "meta";
	
	
	
	public void setAPI_VERSION()
	{
		
	}
	public void setMAP()
	{
		
	}
	public void setURL()
	{
		
	}
	public void setJAAR()
	{
		
	}
	public void setTHEMA()
	{
		
	}
	public void setKML_VERSION()
	{
		
	}
	
	public ArrayList<String> metaList()
	{
		ArrayList<String> metaList = new ArrayList<String>();
		metaList.add("API_VERSION");
		metaList.add("MAP");
		metaList.add("URL");
		metaList.add("JAAR");
		metaList.add("THEMA");
		metaList.add("KML_URL");
		return metaList;
	}
	
}

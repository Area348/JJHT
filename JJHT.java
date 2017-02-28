//-- javac -cp ".;g:\git\JJHT\gson-2.6.2.jar" JJHT.java

import java.util.*;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.google.gson.Gson;

public class JJHT
{
	public static void main(String args[])
	{
		System.out.println("HELP");
		String URLhttp 	= "http://jotihunt-api-v2.area348.nl";
		String URLcat	= "vos";
		String Sleutel 	= "cKOFQls4ihdc2FiR05qrIDOK5Ub8D0Ksive2xwRKmDmVcWVo22hvl0E65sKxJtOFfExN659Nhmn1eAphVm0WQKmQXnckHjKf59HVy0ie5tgu9CNyH3CLeSXXGFxuywycN2KqSkk1LW1kW12cl86WumqrjkJ1h6fwniFj40ecjNFyBNadSzsvCeLjNnOVS4OeQWty831KK2b98WaBhoHsCtZxaMLdmpfjaX8b5uFG3Dz7yt2nxBNLv659pAASI8y";
		String Team		= "A";
		String Extra	= "all";
		
		
		String URLmeta 	= URLhttp + "/" + URLcat + "/" + Sleutel + "/" + Team + "/" + Extra;
		
		json json 		= new json();
		Gson gson 		= new Gson();
		
		String RAWjson 	= json.readUrl(URLmeta);
		meta meta 		= gson.fromJson(RAWjson,  meta.class);

		
	}//-- Einde Method main()
	
	
	
	
	
}
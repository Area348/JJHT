import java.util.*;
import static java.lang.System.out;

class FullMoons 
{
	
	static int DAY_IN = 1000 * 60 * 60 * 24;
	
	public static void main(String[] arg)
	{
		
		
		Calendar c = Calendar.getInstance();
		
		c.set(2017,0,12,12,34);
		
		out.println("Start: " + c);
		out.println();
		out.println("-----------");
		out.println();
		
		out.println(String.format("Full moon on %tc", c));
		
		long day1 = c.getTimeInMillis();
		
				
				
		for(int x = 0; x < 60; x++)
		{
			day1 += (DAY_IN * 29.5);
			c.setTimeInMillis(day1);


			out.println(String.format("Full moon on %tc", c));
		
		
		}

			
		
	}
	
	
	
	
	
}
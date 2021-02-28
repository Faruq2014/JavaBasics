package conditionalStatement;

import java.time.LocalTime;

public class TimeOfTheDay {

	public static void main(String[] args) {
		 System.out.println(GetTimeOfDay());

	}
	
	public static String GetTimeOfDay(){    
		
		LocalTime time = LocalTime.now();  
	
	    if (time.getHour() >= 0 && time.getHour() < 6)
	    {
	        return "Night";
	    }
	    
	     if (time.getHour() >= 6 && time.getHour() < 12)
	    {
	        return "Morning";
	    }
	    
	    if (time.getHour() >= 12 && time.getHour() < 18)
	    {
	        return "Noon";
	    }
	    
	    return "Evening";
	}

}

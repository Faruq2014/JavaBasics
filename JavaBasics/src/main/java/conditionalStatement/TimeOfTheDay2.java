package conditionalStatement;

import java.time.LocalTime;

public class TimeOfTheDay2 {

	public static void main(String[] args) {
		 System.out.println(GetTimeOfDay(24,10));

	}
	
	public static String GetTimeOfDay(int Hour, int Minute){    
		
		//LocalTime time = LocalTime.now(); 
		LocalTime time1 = LocalTime.of(Hour, Minute);  
	
	    if (time1.getHour() >= 0 && time1.getHour() < 6)
	    {
	        return "Night";
	    }
	    
	     if (time1.getHour() >= 6 && time1.getHour() < 12)
	    {
	        return "Morning";
	    }
	    
	    if (time1.getHour() >= 12 && time1.getHour() < 18)
	    {
	        return "Noon";
	    }
	    
	    return "Evening";
	}

}

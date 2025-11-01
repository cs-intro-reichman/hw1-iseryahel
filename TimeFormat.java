// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) 
	{	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); // getting the hours
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); // getting the miuntes
		if (hours>=12) // if the number is bigger then 12 we need to change it to the apropriete format
		{
			if(hours>12)
			{
			hours=hours-12; // we minus 12 beacause then its suite to wantd outcome
			}
			if(minutes<10) // if the minuts is single value  we add 0
			{
				System.out.println (hours+ ":0" + minutes + " PM") ;
			}
			else
			{
				System.out.println (hours+ ":" + minutes + " PM") ;
			}

		}
		else
		{
			if (hours==00) // if its midnight we want to print only 1 zero
			{
				if(minutes<10) // if the minuts is single value  we add 0
				{
					System.out.println (hours+ ":0" + minutes + " AM") ;
				}
			
			else
				{
					System.out.println (0 + ":0" + minutes + " AM") ;
				}
			}
			else if(minutes<10) // if the minuts is single value  we add 0
			{
				System.out.println (hours+ ":0" + minutes + " AM") ;
			}
			else
			{
				System.out.println (hours+ ":" + minutes + " AM") ;
			}
		}

	}
}
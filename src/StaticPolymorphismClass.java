
public class StaticPolymorphismClass
{	
	// Constructor with (variables) to pass values
	public StaticPolymorphismClass() 
	{
		// TODO Auto-generated method stub
	} // end constructor RandomClass
	

// Static Polymorphism -----------------------------------------------
	public void learnJava( int weekTotal )
	{
		System.out.println( "How many weeks does it take to learn Java?\nIn the beginning, start with this many weeks: " + weekTotal );
	}
	
	public void learnJava( int week1, int week2 )
	{
		System.out.println( "Then Add this many Weeks: " + week1 + "," + week2 ); 
	}
	
	public double learnJava( double weekTotal )
	{
		System.out.println( "And then Add this many Weeks: " + weekTotal );
		return weekTotal;
	}
// Static Polymorphism -----------------------------------------------


} // end class
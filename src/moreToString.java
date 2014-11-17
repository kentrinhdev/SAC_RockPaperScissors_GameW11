
public class moreToString
	{
		int rollno;
		String name;
		String city;

		moreToString(int rollno, String name, String city)
		{
			this.rollno = rollno;
			this.name = name;
			this.city = city;
		}
 
		public String toString()
		{
			return rollno + " " + name + " " + city + "\n";
		}

	
} // end class moreToString
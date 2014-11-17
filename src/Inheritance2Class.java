
public class Inheritance2Class 
{
	public Inheritance2Class() 
	{
		// TODO Auto-generated constructor stub
	}

	
	class A 
	{
		public A() 
		{
			// Members and methods declarations of A.
			System.out.println("New A");
		}
	}

	class B extends A 
	{
		public B() 
		{
			// Members and methods from A are inherited.
			// Members and methods declarations of B.
			super();
			System.out.println("New B");
		}
	}
	
	
} // end Inheritance2Class

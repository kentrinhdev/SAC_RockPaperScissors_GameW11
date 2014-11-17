
public class Child extends Parent
{
	String name;
	public void details()
	{
		super.name = "Jor El"; // Refers to the Parent class member
		name = "Kal El";
		System.out.println( "The Parent = " + super.name + 
				"\n and the Child = " + name + "\n" );
	}

}

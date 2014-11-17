import java.util.Scanner;
import java.util.Random;

public class RandomClass 
{
	// 3 Move objects: Rock, Paper, Scissors
	//private int rockMove; // rockMove = 1
	//private int paperMove; // paperMove = 2
	//private int scissorsMove; // scissorsMove = 3
	String firstName;
	String lastName;
	boolean goodProgrammer;
	
	// Constructor with (variables) to pass values
	public RandomClass( String first, String last ) 
	{
		firstName = first;
		lastName = last;
	} // end constructor RandomClass
	
	
public static String getChoice (int number) 
{
    String choice;
    
    switch (number) 
    {
        case 1:
            choice = "rock";
            break;
        case 2:
            choice = "paper";
            break;
        case 3:
            choice = "scissors";
            break;
        default:
            choice = null;
    }
    
    return choice;
}
	

// Method should generate a random number and
// 	return the computers choice.
public static String computerChoice() 
{
   // Create a Random object.
   Random rand = new Random();

   // Generate a random number in the range of
   // 1 through 3.
   int num = rand.nextInt(3) + 1;

   // Return the computer's choice.
   return getChoice (num) ;
}


// Method should return the user's choice.
public static String userChoice(Scanner keyboard) 
{
    // Ask the user for input
    System.out.print("Enter 1 - rock, 2 - paper, or 3 - scissors: ");

    int userChoice = keyboard.nextInt();
    
    String play = getChoice (userChoice);
    
    // Validate the choice.
    while (play == null) 
    {
        
        System.out.print("Enter 1 - rock, 2 - paper, or 3 - scissors: ");
        userChoice = keyboard.nextInt();
        play = getChoice (userChoice);
    }

    // Return the user's choice.
    return play;
}
	


// The determineWinner method returns the output based on parameters
public static String determineWinner (String computerChoice, String userChoice) 
{
    checkNotNull(computerChoice, "computer must have a choice");
    checkNotNull(userChoice, "user must have a choice");
    
    String output;
    
    output = "The computer's choice was " + computerChoice + ".\n";
    output += "The user's choice was " + userChoice + ".\n\n";

    // check logic
    if (userChoice.equalsIgnoreCase("rock")) {
        if (computerChoice.equalsIgnoreCase("scissors"))
            output += "Rock beats scissors.\nThe user wins!";
        else if (computerChoice.equalsIgnoreCase("paper"))
            output += "Paper beats rock.\nThe computer wins!";
        else
            output += "The game is tied!\nPlay again...";
    } else if (userChoice.equalsIgnoreCase("paper")) {
        if (computerChoice.equalsIgnoreCase("scissors"))
            output += "Scissors beats paper.\nThe computer wins!";
        else if (computerChoice.equalsIgnoreCase("rock"))
            output += "Paper beats rock.\nThe user wins!";
        else
            output += "The game is tied!\nPlay again...";
    } else if (userChoice.equalsIgnoreCase("scissors")) {
        if (computerChoice.equalsIgnoreCase("rock"))
            output += "Rock beats scissors.\nThe computer wins!";
        else if (computerChoice.equalsIgnoreCase("paper"))
            output += "Scissors beats paper.\nThe user wins!";
        else
            output += "The game is tied!\nPlay again...";
    }
    
    return output;
}


private static void checkNotNull(String computerChoice, String string) 
{
	// TODO Auto-generated method stub
}


} // end class
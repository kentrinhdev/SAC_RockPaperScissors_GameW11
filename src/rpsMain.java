/**
* Khiem Trinh
* Professor Durendal
* CS112 Section 88195
* Tuesday 7 PM
* Week 7 Homework - RockPaperScissors with Class and Constructor
* Rules: Rock beats Scissors / Scissors beats Paper / Paper beats Rock
*/

import java.util.Scanner;

public class rpsMain
{
    public static void main(String[] args)
    {
    String computer;
    String user;
    Scanner keyboard = new Scanner(System.in);

// Constructor Call from Main -----------------------------------------------------------------   
 // Instantiate new object called aboutProgrammer for constructor public RandomClass
    RandomClass aboutProgrammer = new RandomClass( "Ken", "Trinh" ); // Pass values
    System.out.println("::: Programmer ID Card :::\nFirst Name: " + aboutProgrammer.firstName +
    		"\nLast Name: " + aboutProgrammer.lastName + "\n" );
// Constructor Call from Main -----------------------------------------------------------------   
    
// Static Polymorphism Call from Main ---------------------------------------------------------   
    StaticPolymorphismClass dev = new StaticPolymorphismClass();
    double allWeeksTotal;
    dev.learnJava(1); // Initial value
    dev.learnJava( 1,9 ); // Override with new value
    allWeeksTotal = dev.learnJava( 11.5 ); // Override again with final value
    System.out.println( "The total number of weeks to learn Java is " + allWeeksTotal + ".\n");
// Static Polymorphism Call from Main ---------------------------------------------------------  
    
// Inheritance Call from Main -----------------------------------------------------------------    
    Animal animal = new Animal();
    Bird bird = new Bird();
    Dog dog = new Dog();
    System.out.println();
    animal.sleep();
    animal.eat();
    bird.sleep();
    bird.eat();
    dog.sleep();
    dog.eat();
    
    Child childObject = new Child();
    childObject.details();
// Inheritance Call from Main -----------------------------------------------------------------    


        ToString tString = new ToString( 1, 11 );
        System.out.println( tString );
        
        moreToString s1 = new moreToString(101,"Professor","Einstein");
        moreToString s2 = new moreToString(102,"Teacher's Assistant","TA");
        
        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()

    
    // Play the game as long as there is a tie.
    do {
        // Get the computer's choice.
        computer = RandomClass.computerChoice();

        // Get the user's choice.
        user = RandomClass.userChoice(keyboard);

        // Determine the winner.
        String output = RandomClass.determineWinner(computer, user);
        System.out.println(output);
        
    } while (user.equalsIgnoreCase(computer));

    keyboard.close();
    
} // end main
} // end class rpsMain
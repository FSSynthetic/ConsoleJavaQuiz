package src;

import java.util.Scanner;

public class  StartMenu {

    public static void main(String[] args) {
	
		//Just a simple welcome menu with two options to choose from.
		
		System.out.println("\n------------------------------------------------------");
		System.out.println("Welcome to my quiz!");
		System.out.println();
		System.out.println("Please select an option:");
		System.out.println();
		System.out.println("Start: 1");
		System.out.println("Quit:  2");
		System.out.println("------------------------------------------------------");
		
		
		Scanner in = new Scanner(System.in); // Capturing the users response and deciding what outcome is presented through the conditional statement's.
		int Option = in.nextInt();
		
		if (Option == 1 ) {
		    StartQuiz(); // If this option is chosen, it will call the StartQuiz method.
        }
        
		else if (Option == 2) {
		    QuitQuiz(); // If this option is chosen, it will call the QuitQuiz method.
        }
        
		else { // If a number doesn't match up to 1 or 2, this statement will engage and redirect the user back to the beginning of the main method.
		    System.out.println("\nERROR:  Invalid Response. Please try again.");
			
		    // Pause the program for a selected amount of time.
			
		    try { // Set the "5" to whatever number you want to set the pause time in seconds.
			    Thread.sleep(5  * 1000); // You can change the "1000" to change the time conversion. Ex: 1 * 1000 is 1 second. 1 * 100 is 1/10 of a second.
		    } catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			    
		    // End pause
			    
		    }
		    StartMenu.main(args); // Calling main method.
        }
    }
			    
	public static void StartQuiz() {

		//This is the menu where the user picks what type of quiz they take.

		System.out.println("\n------------------------------------------------------");
		System.out.println("Alright, choose what type of quiz you would like to take or quit the program:");
		System.out.println();
		System.out.println("Java Based Quiz: 1");
		System.out.println("Technology Based Quiz: 2");
		System.out.println("Discord Based Quiz: 3");
		System.out.println("Random Questions: 4");
		System.out.println("Quit Quiz: 5");
		System.out.println("------------------------------------------------------");
			
		Scanner in = new Scanner(System.in);
        int Option = in.nextInt();

		// These are the different types of quizzes separated into 4 classes.

		if (Option == 1) {
		    src.Quizzes.JavaQuiz.JavaMain(null);
		}
		else if (Option == 2) {
		    src.Quizzes.TechQuiz.TechMain(null);
		}
		else if (Option == 3) {
		    src.Quizzes.DiscQuiz.DiscMain(null);
		}
		else if (Option == 4) {
            src.Quizzes.RandQuiz.RandMain(null);
		}
		else if (Option == 5) {
			QuitQuiz();
		}
		else { 
			System.out.println("\nERROR:  Invalid Response. Please try again.");
		}

		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
		StartQuiz();
        
    }

    public static void QuitQuiz() { // Just a simple exit message

		System.out.println("\nEXITING: You have a nice day!");

		    try {
			    Thread.sleep(6 * 1000);
		    } catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			
		    }
    }
}

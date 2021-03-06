package src.Quizzes;

import java.util.Scanner;

public class TechQuiz {
    
    public static void TechMain(String[] args) { // Just a simple briefing message.

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("You are about to start the Technology Based Quiz.");
        System.out.println();
        System.out.println("It may also be worth noting that while you're taking the quiz,");
        System.out.println("if you type any response other than the correct answer, it'll be marked incorrect.");
        System.out.println();
        System.out.println("Are you sure you want to continue?");
        System.out.println();
        System.out.println("Yes: 1");
        System.out.println("No: 2");
        System.out.println("------------------------------------------------------");


        Scanner in = new Scanner(System.in);
		int Option = in.nextInt();
		
		if (Option == 1 ) {
			StartQuiz(null);
		}
		else if (Option == 2) {
			src.StartMenu.main(null);
		}
		else {
			System.out.println("ERROR:  Invalid Response. Please try again.");
			
			
			try {
			    Thread.sleep(5 * 1000);
			} catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			    
			    
			}
			TechQuiz.TechMain(args);
			    
        }
        in.close();
    }

    public static void StartQuiz(String[] args) {
        int Correct = 0;

        System.out.println("Alright, here we go!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
	    // Here begins the strings of questions. Each question in assigned to a variable. The questions variables are later placed into an array.

        String Q1 = "\n------------------------------------------------------\n"
            +   "Question 1:\n"
            +   " \n"
            +   "What does the abbreviation CPU stand for?\n"
            +   " \n"
            +   "Compacting Processing Unit: A\nCompiling Processing Unit: B\nCentral Processing Unit: C\nCommunication Processing Unit D\n"
            +   "------------------------------------------------------";

        String Q2 = "\n------------------------------------------------------\n"
            +   "Question 2:\n"
            +   " \n"
            +   "When was the Microsoft operating system, \"Windows\" created?\n"
            +   " \n"
            +   "1985: A\n1992: B\n2001: C\n1988: D\n"
            +   "------------------------------------------------------";

        String Q3 = "\n------------------------------------------------------\n"
            +   "Question 3:\n"
            +   " \n"
            +   "What is software?\n"
            +   " \n"
            +   "The physical components of a computer: A\nA collection of data or instructions that tell the computer how to work: B\nAnother term for the CPU: C\nBoth 1 and 2: D\n"
            +   "------------------------------------------------------";

        String Q4 = "\n------------------------------------------------------\n"
            +   "Question 4:\n"
            +   " \n"
            +   "What is Hardware?\n"
            +   " \n"
            +   "Any visible program like the Google Search Engine, Microsoft Excel, Notepad, etc, that the user can interact with: A\nEverything computer piece except for the Motherboard: B\nJust the tower of a PC: C\nThe physical components of a computer that executes functions that make the computer work: D\n"
            +   "------------------------------------------------------";

        String Q5 = "\n------------------------------------------------------\n"
            +   "Question 5:\n"
            +   " \n"
            +   "When was Linux founded and released?\n"
            +   " \n"
            +   "2003: A\n1989: B\n1991: C\n2000: D\n"
            +   "------------------------------------------------------";

        String Q6 = "\n------------------------------------------------------\n"
            +   "Question 6:\n"
            +   " \n"
            +   "Who created the Linux Operating System?\n"
            +   " \n"
            +   "Steve Jobs: A\nLinus Torvalds: B\nMark Zuckerberg: C\nLinux Torvalds: D\n"
            +   "------------------------------------------------------";

        String Q7 = "\n------------------------------------------------------\n"
            +   "Question 7:\n"
            +   " \n"
            +   "When was \"The Logic Theorist\", (arguably the first Artificial Intelligence program) create and published?\n"
            +   " \n"
            +   "1955-1956: A\n1950-1967: B\n2000-2001: C\n1957-1964: D\n"
            +   "------------------------------------------------------";

        String Q8 = "\n------------------------------------------------------\n"
            +   "Question 8:\n"
            +   " \n"
            +   "When did the first Iphone get released?\n"
            +   " \n"
            +   "1998: A\n2004: B\n2007: C\n2006: D\n"
            +   "------------------------------------------------------";

        String Q9 = "\n------------------------------------------------------\n"
            +   "Question 9:\n"
            +   " \n"
            +   "Who are the founders of Apple\n"
            +   " \n"
            +   "Steve Jobs: A\nSteve Jobs, Steve Wozniak, and Ronald Wayne: B\nSteve Wozniak and Mark Zuckerberg: C\nKevin Systrom, Mike Krieger, and Steve Jobs: D\n"
            +   "------------------------------------------------------";

        String Q10 = "\n------------------------------------------------------\n"
            +   "Question 10:\n"
            +   " \n"
            +   "When was the first phone invented and released\n"
            +   " \n"
            +   "1980: A\n1868: B\n1902: C\n1876: D\n"
            +   "------------------------------------------------------";
	
	// End of Questions: Now the questions are places into their array along with the answers in a separate array.
	    
        String[] Questions = {Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10};

        char[] Answers = {'c', 'a', 'b', 'd', 'c', 'b', 'a', 'c', 'b', 'd'};

	/* Here is the magic of the code that prints out all questions and compairs the user's answer to the correct answer.
	    It goes through a simple for loop and if the user answer mathces the Answers array, it will add one point to the Correct variable.
	*/    
	    
        for(int i = 0; i < Questions.length; i++){
            System.out.println(Questions[i]);
            Scanner scan = new Scanner(System.in);
            char answer = scan.nextLine().charAt(0);
            if(answer == (Character.toLowerCase(Answers[i]))) {
            	System.out.println("\nCorrect!");  
            	Correct++;
            }
            else{
		System.out.println("\nIncorrect");
		System.out.println("The correct answer was \"" + (Answers[i]) + "\"");
            }
        }

        // End of Quiz Questions.

        System.out.println("\nYou have finished the Tech Quiz!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        
        if (Correct >= 6) { // If the user has 6 or more answers correct, this statement will execute.
            System.out.println("\nYou got " + Correct + "/10 correct with a minimum of 6/10 to pass. You passed!");

        }
        else { // If the user has less than 6 correct answers, this statement will execute.
            System.out.println("\nYou got " + Correct + "/10 correct with a minimum of 6/10 to pass. Unfortunately, You failed.");
        }

        try {
            Thread.sleep(13 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }

        System.out.println("\nThanks for playing, see you around!");

        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        src.StartMenu.main(null);
    }
}

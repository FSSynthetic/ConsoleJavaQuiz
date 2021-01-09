package src.Quizzes;

import java.util.Scanner;

public class DiscQuiz {
    
    public static void DiscMain(String[] args) { // Just a simple briefing message.

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("You are about to start the Discord Based Quiz.");
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
			System.out.println("\nERROR:  Invalid Response. Please try again.");
			
			
			try {
			    Thread.sleep(5 * 1000);
			} catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			    
			    
			}
			DiscQuiz.DiscMain(args);
			    
        }
        in.close();
    }

    public static void StartQuiz(String[] args) {
        int Correct = 0;

        System.out.println("\nAlright, here we go!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
	    // Here begins the strings of questions. Each question in assigned to a variable. The questions variables are later placed into an array.

        String Q1 = "\n------------------------------------------------------\n"
            +   "Question 1:\n"
            +   " \n"
            +   "When was Discord first ever released?\n"
            +   " \n"
            +   "January 25th, 2015: A\nMarch 6th, 2009: B\nMay 13th, 2015: C\nDecember 2nd, 2012: D\n"
            +   "------------------------------------------------------";

        String Q2 = "\n------------------------------------------------------\n"
            +   "Question 2:\n"
            +   " \n"
            +   "Who is the founder of Discord?\n"
            +   " \n"
            +   "Daniel Ek: A\nLarry Page: B\nBobby Murphy: C\nJason Citron: D\n"
            +   "------------------------------------------------------";

        String Q3 = "\n------------------------------------------------------\n"
            +   "Question 3:\n"
            +   " \n"
            +   "What is the name of Discord's mascot?\n"
            +   " \n"
            +   "Wumpus: A\nDragon: B\nClyde: C\nGhostface Chillah: D\n"
            +   "------------------------------------------------------";

        String Q4 = "\n------------------------------------------------------\n"
            +   "Question 4:\n"
            +   " \n"
            +   "What name did Discord officially give to their logo?\n"
            +   " \n"
            +   "Wumpus: A\nHypno: B\nLarry: C\nClyde: D\n"
            +   "------------------------------------------------------";

        String Q5 = "\n------------------------------------------------------\n"
            +   "Question 5:\n"
            +   " \n"
            +   "What id Discord's subscription service called?\n"
            +   " \n"
            +   "Hypesquad: A\nNitro: B\nTOS: C\nPartner: D\n"
            +   "------------------------------------------------------";

        String Q6 = "\n------------------------------------------------------\n"
            +   "Question 6:\n"
            +   " \n"
            +   "What badge is unlocked when helping Discord find and fix bugs?\n"
            +   " \n"
            +   "Bug Hunter Badge: A\nHelper Badge: B\nFixer Badge: C\nPartner Badge: D\n"
            +   "------------------------------------------------------";

        String Q7 = "\n------------------------------------------------------\n"
            +   "Question 7:\n"
            +   " \n"
            +   "When was Discord Dark Mode first released?"
            +   " \n"
            +   "January 19th, 2016: A\nAugust 6th, 2015: B\nSeptember 3rd, 2015: C\nJune 5th, 2016: D\n"
            +   "------------------------------------------------------";

        String Q8 = "\n------------------------------------------------------\n"
            +   "Question 8:\n"
            +   " \n"
            +   "What is the name of the robot hamster that pops up on Discord's 404 page?\n"
            +   " \n"
            +   "ChatterBox: A\nMarky: B\nWumperston: C\nNelly: D\n"
            +   "------------------------------------------------------";

        String Q9 = "\n------------------------------------------------------\n"
            +   "Question 9:\n"
            +   " \n"
            +   "What was Discord Inc. originally called?\n"
            +   " \n"
            +   "Game Talk: A\nDisc Space: B\nOpenFeint: C\nHammer and Chisel Inc.: D\n"
            +   "------------------------------------------------------";

        String Q10 = "\n------------------------------------------------------\n"
            +   "Question 10:\n"
            +   " \n"
            +   "What discord badge represents the old Hammer and Chisel Inc. logo?\n"
            +   " \n"
            +   "HypeSquad Badge: A\nBug Hunter Badge: B\nOwner Badge: C\nDiscord Staff Badge: D\n"
            +   "------------------------------------------------------";
	    
	// End of Questions: Now the questions are places into their array along with the answers in a separate array.
	    
        String[] Questions = {Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10};

        char[] Answers = {'c', 'd', 'a', 'b', 'd', 'a', 'b', 'd', 'd', 'd'};
	
	    /* Here is the magic of the code that prints out all questions and compairs the user's answer to the correct answer.
	    	It goes through a simple for loop and if the user answer mathces the Answers array, it will add one point to the Correct variable.
	    */
	    
        for(int i = 0; i < Questions.length; i++){
            System.out.println(Questions[i]);
            Scanner scan = new Scanner(System.in);
            char answer = scan.nextLine().charAt(0);
            if (answer == (Character.toLowerCase(Answers[i]))) {
            	System.out.println("You answered correctly!");  
            	Correct++;
            }
            else{
		System.out.println("Incorrect");
		System.out.println("The correct answer was" + Character.toLowerCase(Answers[i]));
            }
        }

        // End of Quiz Questions.

        System.out.println("You have finished the Discord Quiz!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        
        if (Correct >= 6) { // If the user has 6 or more answers correct, this statement will execute.
            System.out.println("You got " + Correct + "/10 correct with a minimum of 6/10 to pass. You passed!");

        }
        else { // If the user has less than 6 correct answers, this statement will execute.
            System.out.println("You got " + Correct + "/10 correct with a minimum of 6/10 to pass. Unfortunately, You failed.");
        }

        try {
            Thread.sleep(13 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }

        System.out.println("Welp, back to the main menu you go!");

        try {
            Thread.sleep(4 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
    }
}

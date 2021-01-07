package src.Quizzes;

import java.util.Scanner;

public class RandQuiz {
    
    public static void RandMain(String[] args) { // Just a simple briefing message.
        ClearConsole();

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("You are about to start the Random Question Based Quiz.");
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
			System.out.println(\n"ERROR:  Invalid Response. Please try again.");
			
			
			try {
			    Thread.sleep(5 * 1000);
			} catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			    
			    
			}
			TechQuiz.RandMain(args);
			    
        }
        in.close();
    }

    public static void StartQuiz(String[] args) {
        int Correct = 0;

        System.out.println(\n"Alright, here we go!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
	    // Here begins the strings of questions. Each question in assigned to a variable. The questions variables are later placed into an array.

        String Q1 = \n"------------------------------------------------------\n"
            +   "Question 1:\n"
            +   " \n"
            +   "What is 24 * 4 + 6 -17?\n"
            +   " \n"
            +   "73: A\n56: B\n94: C\n85: D\n"
            +   "------------------------------------------------------";

        String Q2 = \n"------------------------------------------------------\n"
            +   "Question 2:\n"
            +   " \n"
            +   "What was the first planet ever discovered with a telescope?\n"
            +   " \n"
            +   "Mars: A\nVenus: B\nUranus: C\nEarth: D\n"
            +   "------------------------------------------------------";

        String Q3 = \n"------------------------------------------------------\n"
            +   "Question 3:\n"
            +   " \n"
            +   "Who was the First president of the United States of America?\n"
            +   " \n"
            +   "George Washington: A\nRonald Reagan: B\nJohn Quincy Adams: C\nUlysses S. Grant: D\n"
            +   "------------------------------------------------------";

        String Q4 = \n"------------------------------------------------------\n"
            +   "Question 4:\n"
            +   " \n"
            +   "`When was Wikipedia founded??\n"
            +   " \n"
            +   "1994: A\n2001: B\n2004: C\n2006: D\n"
            +   "------------------------------------------------------";

        String Q5 = \n"------------------------------------------------------\n"
            +   "Question 5:\n"
            +   " \n"
            +   "What time format has 24 hours instead of the standard 12?\n"
            +   " \n"
            +   "24 Hour Time: A\nExpanded Time: B\nMilitary Time: C\nInternational Time: D\n"
            +   "------------------------------------------------------";

        String Q6 = \n"------------------------------------------------------\n"
            +   "Question 6:\n"
            +   " \n"
            +   "Who was the first king of England?\n"
            +   " \n"
            +   "Queen Elizabeth l: A\nAthelstan: B\nJulius Caesar: C\nLinus Torvalds: D\n"
            +   "------------------------------------------------------";

        String Q7 = \n"------------------------------------------------------\n"
            +   "Question 7:\n"
            +   " \n"
            +   "What is 15 * 3(4 + 3) - 67?\n"
            +   " \n"
            +   "256: A\n145: B\n93: C\n248: D\n"
            +   "------------------------------------------------------";

        String Q8 = \n"------------------------------------------------------\n"
            +   "Question 8:\n"
            +   " \n"
            +   "When was the first university founded?\n"
            +   " \n"
            +   "2001: A\n1088: B\n1934: C\n1285: D\n"
            +   "------------------------------------------------------";

        String Q9 = \n"------------------------------------------------------\n"
            +   "Question 9:\n"
            +   " \n"
            +   "Who were the first humans to set foot on the moon?\n"
            +   " \n"
            +   "Neil Armstrong, and Edwin \"Buzz\" Aldrin: A\nNeil Armstrong, Michael Collins and Edwin \"Buzz\" Aldrin: B\nessica Meir: C\nAlan Shepard: D\n"
            +   "------------------------------------------------------";

        String Q10 = \n"------------------------------------------------------\n"
            +   "Question 10:\n"
            +   " \n"
            +   "What was the landmass of all 7 continents called when they were once linked together?\n"
            +   " \n"
            +   "Pangaea: A\nNorthern Hemisphere: B\nThe Collective Land: C\nEurasia: D\n"
            +   "------------------------------------------------------";
	    
	// End of Questions: Now the questions are places into their array along with the answers in a separate array.
	    
        String[] Questions = {Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10};

        char[] Answers = {'d', 'c', 'a', 'b', 'c', 'b', 'd', 'b', 'a', 'a'};
	
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
		System.out.println("The correct answer was" Character.toLowerCase(Answers[i])));
            }
        }


        // End of Quiz Questions.

        System.out.println("You have finished the TechQuiz!");

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

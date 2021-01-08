package src.Quizzes;

import java.util.Scanner;

public class JavaQuiz {
    
    public static void JavaMain(String[] args) { // Just a simple briefing message.

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("You are about to start the Java Based Quiz.");
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
			JavaQuiz.JavaMain(args);
			    
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
            +   "Is Java short for JavaScript?\n"
            +   " \n"
            +   "Yes: A\No: B\n"
            +   "------------------------------------------------------";

        String Q2 = \n"------------------------------------------------------\n"
            +   "Question 2:\n"
            +   " \n"
            +   "What type of programming language is Java?\n"
            +   " \n"
            +   "Procedural Programming Language: A\nFunctional Programming Language: B\nObject-oriented Programming Language: C\nScripting Programming Language: D\n"
            +   "------------------------------------------------------";

        String Q3 = \n"------------------------------------------------------\n"
            +   "Question 3:\n"
            +   " \n"
            +   "When was Java invented?\n"
            +   " \n"
            +   "1998: A\n1996: B\n1989: C\n2001: D\n"
            +   "------------------------------------------------------";

        String Q4 = \n"------------------------------------------------------\n"
            +   "Question 4:\n"
            +   " \n"
            +   "What is one of the two proper way to create a print statement?\n"
            +   " \n"
            +   "System.out.println(\"Text\");: A\nSystem,out,println(\"Text\");: B\nPrint(\"Text\");: C\nWriteLine(\"Text\");: D\n"
            +   "------------------------------------------------------";

        String Q5 = \n"------------------------------------------------------\n"
            +   "Question 5:\n"
            +   " \n"
            +   "Out of the four examples below, which one properly declares a variable?\n"
            +   " \n"
            +   "(Variable (String test);: A\nDECLARE @TestVariable AS VARCHAR(100)='Test';: B\n CreateVar(Test);: C\nString Test;: D\n"
            +   "------------------------------------------------------";

        String Q6 = \n"------------------------------------------------------\n"
            +   "Question 6:\n"
            +   " \n"
            +   "Java was originally developed by whom working for Sun Microsystems in 1996?\n"
            +   " \n"
            +   "Bjarne Stroustrup: A\nJason Citron: B\nJames Gosling: C\nPerl/Larry Wall: D\n"
            +   "------------------------------------------------------";

        String Q7 = \n"------------------------------------------------------\n"
            +   "Question 7:\n"
            +   " \n"
            +   "Which method can be used to find the highest value of x and y?"
            +   " \n"
            +   "Math.largest(x,y): A\nMath.maxNum(x,y): B\n93Math.maximum(x,y): C\nMath.max(x,y): D\n"
            +   "------------------------------------------------------";

        String Q8 = \n"------------------------------------------------------\n"
            +   "Question 8:\n"
            +   " \n"
            +   "Is it possible to inherit attributes and methods from one class to another?\n"
            +   " \n"
            +   "Yes: A\nNo: B\n"
            +   "------------------------------------------------------";

        String Q9 = \n"------------------------------------------------------\n"
            +   "Question 9:\n"
            +   " \n"
            +   "Can the value of a string variable can be surrounded by single quotes?\n"
            +   " \n"
            +   "Yes: A\nNo: B\n"
            +   "------------------------------------------------------";

        String Q10 = \n"------------------------------------------------------\n"
            +   "Question 10:\n"
            +   " \n"
            +   "Which method can be used to find the length of a string?\n"
            +   " \n"
            +   "getSize(): A\nlength(): B\nlen(): C\ngetSize(): D\n"
            +   "------------------------------------------------------";
	    
	// End of Questions: Now the questions are places into their array along with the answers in a separate array.
	    
        String[] Questions = {Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10};

        char[] Answers = {'a', 'c', 'b', 'a', 'd', 'c', 'd', 'a', 'a', 'b'};
	
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

        System.out.println("You have finished the JavaQuiz!");

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

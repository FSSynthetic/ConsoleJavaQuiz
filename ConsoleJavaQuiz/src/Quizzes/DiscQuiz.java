package src.Quizzes;

import java.util.Scanner;

public class DiscQuiz {

    private static void ClearConsole() { // Clear Console method.

		System.out.print("\033[H\033[2J");  
        System.out.flush();

	}
    
    public static void DiscMain(String[] args) { // Just a simple briefing message.

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("You are about to start the Discord Based Quiz.");
        System.out.println();
        System.out.println("It may also be worth noting that while you're taking the quiz,");
        System.out.println("if you type a response other than the correct answer, you'll be marked incorrect.");
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
		ClearConsole();
			System.out.println("ERROR:  Invalid Response. Please try again.");
			
			
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
        ClearConsole();

        System.out.println("Alright, here we go!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }

        ClearConsole();

        int Correct = 0; // This is the "Correct" variable. This will count how many questions the user answered correct.

        System.out.println("------------------------------------------------------");
        System.out.println("Question 1:");
        System.out.println();
        System.out.println("When was Discord first ever released?");
        System.out.println();
        System.out.println("January 25th, 2015: 1");
        System.out.println("March 6th, 2009: 2");
        System.out.println("May 13th, 2015: 3");
        System.out.println("December 2nd, 2012: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q1 = new Scanner(System.in);
        int Question1 = Integer.parseInt(Q1.nextLine());

        if (Question1 == 3) { // If the user response is equal to the expression inside the parentheses, it will add 1 to the "Correct" variable.
            Correct++;
        }
        else { // If the user response is not equal to the expression inside the parentheses, it will just continue the program without adding to the "Correct" variable.
        }

        ClearConsole();

        System.out.println("Next Question!");

        try { // Pause statement
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        Q1.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 2:");
        System.out.println();
        System.out.println("Who is the founder of Discord?");
        System.out.println();
        System.out.println("Daniel Ek: 1");
        System.out.println("Larry Page: 2");
        System.out.println("Bobby Murphy: 3");
        System.out.println("Jason Citron: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q2 = new Scanner(System.in);
        int Question2 = Integer.parseInt(Q2.nextLine());

        if (Question2 == 4) {
            Correct++;
        }
        else {
        }

        ClearConsole();

        System.out.println("Next Question!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        Q2.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 3:");
        System.out.println();
        System.out.println("What is the name of Discord's mascot?");
        System.out.println();
        System.out.println("Wumpus: 1");
        System.out.println("Dragon: 2");
        System.out.println("Clyde: 3");
        System.out.println("Ghostface Chillah: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q3 = new Scanner(System.in);
        int Question3 = Integer.parseInt(Q3.nextLine());

        if (Question3 == 1) {
            Correct++;
        }
        else {
        }

        ClearConsole();

        System.out.println("Next Question!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        Q3.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 4:");
        System.out.println();
        System.out.println("What name did Discord officially give to their logo?");
        System.out.println();
        System.out.println("Wumpus: 1");
        System.out.println("Hypno: 2");
        System.out.println("Larry: 3");
        System.out.println("Clyde: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q4 = new Scanner(System.in);
        int Question4 = Integer.parseInt(Q4.nextLine());

        if (Question4 == 4) {
            Correct++;
        }
        else {
        }

        ClearConsole();

        System.out.println("Next Question!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        Q4.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 5:");
        System.out.println();
        System.out.println("What id Discord's subscription service called?");
        System.out.println();
        System.out.println("Hypesquad: 1");
        System.out.println("Nitro: 2");
        System.out.println("TOS: 3");
        System.out.println("Partner: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q5 = new Scanner(System.in);
        int Question5 = Integer.parseInt(Q5.nextLine());

        if (Question5 == 2) {
            Correct++;
        }
        else {
        }

        ClearConsole();

        System.out.println("Next Question!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        Q5.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 6:");
        System.out.println();
        System.out.println("What badge is unlocked when helping Discord find and fix bugs?");
        System.out.println();
        System.out.println("Bug Hunter Badge: 1");
        System.out.println("Helper Badge: 2");
        System.out.println("Fixer Badge: 3");
        System.out.println("Partner Badge: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q6 = new Scanner(System.in);
        int Question6 = Integer.parseInt(Q6.nextLine());

        if (Question6 == 1) {
            Correct++;
        }
        else {
        }

        ClearConsole();

        System.out.println("Next Question!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        Q6.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 7:");
        System.out.println();
        System.out.println("When did Discord Dark Mode get released?");
        System.out.println();
        System.out.println("January 19th, 2016: 1");
        System.out.println("August 6th, 2015: 2");
        System.out.println("September 3rd, 2015: 3");
        System.out.println("June 5th, 2016: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q7 = new Scanner(System.in);
        int Question7 = Integer.parseInt(Q7.nextLine());

        if (Question7 == 2) {
            Correct++;
        }
        else {
        }

        ClearConsole();

        System.out.println("Next Question!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        Q7.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 8:");
        System.out.println();
        System.out.println("What was Discord almost named?");
        System.out.println();
        System.out.println("ChatterBox: 1");
        System.out.println("FireStone: 2");
        System.out.println("Wyvern: 3");
        System.out.println("Chizl: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q8 = new Scanner(System.in);
        int Question8 = Integer.parseInt(Q8.nextLine());

        if (Question8 == 3) {
            Correct++;
        }
        else {
        }

        ClearConsole();

        System.out.println("Next Question!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        Q8.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 9:");
        System.out.println();
        System.out.println("What was Discord Inc. originally called?");
        System.out.println();
        System.out.println("Game Talk: 1");
        System.out.println("Disc Space: 2");
        System.out.println("OpenFeint: 3");
        System.out.println("Hammer and Chisel Inc: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q9 = new Scanner(System.in);
        int Question9 = Integer.parseInt(Q9.nextLine());

        if (Question9 == 4) {
            Correct++;
        }
        else {
        }

        ClearConsole();

        System.out.println("Next Question!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }
        Q9.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 10:");
        System.out.println();
        System.out.println("What discord badge represents the old Hammer and Chisel Inc logo?");
        System.out.println();
        System.out.println("HypeSquad Badge: 1");
        System.out.println("Bug Hunter Badge: 2");
        System.out.println("Owner Badge: 3");
        System.out.println("Discord Staff Badge: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q10 = new Scanner(System.in);
        int Question10 = Integer.parseInt(Q10.nextLine());

        if (Question10 == 4) {
            Correct++;
        }
        else {
        }
        Q10.close();

        // End of Quiz Questions.

        ClearConsole();

        System.out.println("You have finished the TechQuiz!");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }

        ClearConsole();

        
        if (Correct >= 6) { // If the user has 6 or more answers correct, this statement will execute.
            ClearConsole();
            System.out.println("You got " + Correct + "/10 correct with a minimum of 6/10 to pass. You passed!");

        }
        else { // If the user has less than 6 correct answers, this statement will execute.
            ClearConsole();
            System.out.println("You got " + Correct + "/10 correct with a minimum of 6/10 to pass. Unfortunately, You failed.");
        }

        try {
            Thread.sleep(13 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }

        ClearConsole();

        System.out.println("Welp, back to the main menu you go!");

        try {
            Thread.sleep(4 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
               
        }


    }
}
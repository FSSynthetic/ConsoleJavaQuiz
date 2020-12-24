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
        System.out.println("January 25th, 2015: A");
        System.out.println("March 6th, 2009: B");
        System.out.println("May 13th, 2015: C");
        System.out.println("December 2nd, 2012: D");
        System.out.println("------------------------------------------------------");

        Scanner Q1 = new Scanner(System.in);
        char Question1 = Q1.nextLine().charAt(0);

        if (Character.toLowerCase(Question1) == 'c') { // If the user response is equal to the expression inside the parentheses, it will add 1 to the "Correct" variable.
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

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 2:");
        System.out.println();
        System.out.println("Who is the founder of Discord?");
        System.out.println();
        System.out.println("Daniel Ek: A");
        System.out.println("Larry Page: B");
        System.out.println("Bobby Murphy: C");
        System.out.println("Jason Citron: D");
        System.out.println("------------------------------------------------------");

        Scanner Q2 = new Scanner(System.in);
        char Question2 = Q2.nextLine().charAt(0);

        if (Character.toLowerCase(Question2) == 'd') {
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

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 3:");
        System.out.println();
        System.out.println("What is the name of Discord's mascot?");
        System.out.println();
        System.out.println("Wumpus: A");
        System.out.println("Dragon: B");
        System.out.println("Clyde: C");
        System.out.println("Ghostface Chillah: D");
        System.out.println("------------------------------------------------------");

        Scanner Q3 = new Scanner(System.in);
        char Question3 = Q3.nextLine().charAt(0);

        if (Character.toLowerCase(Question3) == 'a') {
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

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 4:");
        System.out.println();
        System.out.println("What name did Discord officially give to their logo?");
        System.out.println();
        System.out.println("Wumpus: A");
        System.out.println("Hypno: B");
        System.out.println("Larry: C");
        System.out.println("Clyde: D");
        System.out.println("------------------------------------------------------");

        Scanner Q4 = new Scanner(System.in);
        char Question4 = Q4.nextLine().charAt(0);

        if (Character.toLowerCase(Question4) == 'd') {
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

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 5:");
        System.out.println();
        System.out.println("What id Discord's subscription service called?");
        System.out.println();
        System.out.println("Hypesquad: A");
        System.out.println("Nitro: B");
        System.out.println("TOS: C");
        System.out.println("Partner: D");
        System.out.println("------------------------------------------------------");

        Scanner Q5 = new Scanner(System.in);
        char Question5 = Q5.nextLine().charAt(0);

        if (Character.toLowerCase(Question5) == 'b') {
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

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 6:");
        System.out.println();
        System.out.println("What badge is unlocked when helping Discord find and fix bugs?");
        System.out.println();
        System.out.println("Bug Hunter Badge: A");
        System.out.println("Helper Badge: B");
        System.out.println("Fixer Badge: C");
        System.out.println("Partner Badge: D");
        System.out.println("------------------------------------------------------");

        Scanner Q6 = new Scanner(System.in);
        char Question6 = Q6.nextLine().charAt(0);

        if (Character.toLowerCase(Question6) == 'a') {
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

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 7:");
        System.out.println();
        System.out.println("When did Discord Dark Mode get released?");
        System.out.println();
        System.out.println("January 19th, 2016: A");
        System.out.println("August 6th, 2015: B");
        System.out.println("September 3rd, 2015: C");
        System.out.println("June 5th, 2016: D");
        System.out.println("------------------------------------------------------");

        Scanner Q7 = new Scanner(System.in);
        char Question7 = Q7.nextLine().charAt(0);

        if (Character.toLowerCase(Question7) == 'b') {
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

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 8:");
        System.out.println();
        System.out.println("What was Discord almost named?");
        System.out.println();
        System.out.println("ChatterBox: A");
        System.out.println("FireStone: B");
        System.out.println("Wyvern: C");
        System.out.println("Chizl: D");
        System.out.println("------------------------------------------------------");

        Scanner Q8 = new Scanner(System.in);
        char Question8 = Q8.nextLine().charAt(0);

        if (Character.toLowerCase(Question8) == 'c') {
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

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 9:");
        System.out.println();
        System.out.println("What was Discord Inc. originally called?");
        System.out.println();
        System.out.println("Game Talk: A");
        System.out.println("Disc Space: B");
        System.out.println("OpenFeint: C");
        System.out.println("Hammer and Chisel Inc: D");
        System.out.println("------------------------------------------------------");

        Scanner Q9 = new Scanner(System.in);
        char Question9 = Q9.nextLine().charAt(0);

        if (Character.toLowerCase(Question9) == 'd') {
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

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 10:");
        System.out.println();
        System.out.println("What discord badge represents the old Hammer and Chisel Inc logo?");
        System.out.println();
        System.out.println("HypeSquad Badge: A");
        System.out.println("Bug Hunter Badge: B");
        System.out.println("Owner Badge: C");
        System.out.println("Discord Staff Badge: D");
        System.out.println("------------------------------------------------------");

        Scanner Q10 = new Scanner(System.in);
        char Question10 = Q10.nextLine().charAt(0);

        if (Character.toLowerCase(Question10) == 'd') {
            Correct++;
        }
        else {
        }

        // End of Quiz Questions.

        ClearConsole();

        System.out.println("You have finished the Discord based quiz!");

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
        src.StartMenu.StartQuiz();

    }
}
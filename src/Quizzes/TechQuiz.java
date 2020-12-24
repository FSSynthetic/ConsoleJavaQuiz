package src.Quizzes;

import java.util.Scanner;

public class TechQuiz {
    
    private static void ClearConsole() {

	    System.out.print("\033[H\033[2J");  
        System.out.flush();

    }
    
    public static void TechMain(String[] args) { // Just a simple briefing message.
        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("You are about to start the Technology Based Quiz.");
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
			TechQuiz.TechMain(args);
			    
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
        System.out.println("What does the abbreviation CPU stand for?");
        System.out.println();
        System.out.println("Compacting Processing Unit: 1");
        System.out.println("Compiling Processing Unit: 2");
        System.out.println("Central Processing Unit: 3");
        System.out.println("Communication Processing Unit 4");
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
        System.out.println("When was the Microsoft operating system, \"Windows\" created?");
        System.out.println();
        System.out.println("1985: 1");
        System.out.println("1992: 2");
        System.out.println("2001: 3");
        System.out.println("1988: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q2 = new Scanner(System.in);
        int Question2 = Integer.parseInt(Q2.nextLine());

        if (Question2 == 1) {
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
        System.out.println("What is software?");
        System.out.println();
        System.out.println("The physical components of a computer: 1");
        System.out.println("A collection of data or instructions that tell the computer how to work: 2");
        System.out.println("Another term for the CPU: 3");
        System.out.println("Both 1 and 2: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q3 = new Scanner(System.in);
        int Question3 = Integer.parseInt(Q3.nextLine());

        if (Question3 == 2) {
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
        System.out.println("What is Hardware?");
        System.out.println();
        System.out.println("Any visible program like the Google Search Engine, Microsoft Excel, Notepad, etc, that the user can interact with: 1");
        System.out.println("Everything computer piece except for the Motherboard: 2");
        System.out.println("Just the tower of a PC: 3");
        System.out.println("The physical components of a computer that executes functions that make the computer work: 4");
        System.out.println("------------------------------------------------------");

        Scanner Q4 = new Scanner(System.in);
        char Question4 = Q4.nextLine().charAt(0);

        if (Character.toLowerCase(Question4) == 'b') {
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
        System.out.println("When was Linux founded and released?");
        System.out.println();
        System.out.println("2003: 1");
        System.out.println("1989: 2");
        System.out.println("1991: 3");
        System.out.println("2000: 4");
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
        Q5.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 6:");
        System.out.println();
        System.out.println("Who created the Linux Operating System?");
        System.out.println();
        System.out.println("Steve Jobs: A");
        System.out.println("Linus Torvalds: B");
        System.out.println("Mark Zuckerberg: C");
        System.out.println("Linux Torvalds: D");
        System.out.println("------------------------------------------------------");

        Scanner Q6 = new Scanner(System.in);
        char Question6 = Q6.nextLine().charAt(0);

        if (Character.toLowerCase(Question6) == 'b') {
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
        System.out.println("When was \"The Logic Theorist\", (arguably the first Artificial Intelligence program) create and published?");
        System.out.println();
        System.out.println("1955-1956: A");
        System.out.println("1950-1967: B");
        System.out.println("2000-2001: C");
        System.out.println("1957-1964: D");
        System.out.println("------------------------------------------------------");

        Scanner Q7 = new Scanner(System.in);
        char Question7 = Q7.nextLine().charAt(0);

        if (Character.toLowerCase(Question7) == 'a') {
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
        System.out.println("When did the first Iphone get released?");
        System.out.println();
        System.out.println("1998: A");
        System.out.println("2004: B");
        System.out.println("2007: C");
        System.out.println("2006: D");
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
        Q8.close();

        ClearConsole();

        System.out.println("------------------------------------------------------");
        System.out.println("Question 9:");
        System.out.println();
        System.out.println("Who are the founders of Apple?");
        System.out.println();
        System.out.println("Steve Jobs: A");
        System.out.println("Steve Jobs, Steve Wozniak, and Ronald Wayne: B");
        System.out.println("Steve Wozniak and Mark Zuckerberg: C");
        System.out.println("Kevin Systrom, Mike Krieger, and Steve Jobs: D");
        System.out.println("------------------------------------------------------");

        Scanner Q9 = new Scanner(System.in);
        char Question9 = Q9.nextLine().charAt(0);

        if (Character.toLowerCase(Question9) == 'b') {
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
        System.out.println("When was the first phone invented and released?");
        System.out.println();
        System.out.println("1980: A");
        System.out.println("1868: B");
        System.out.println("1902: C");
        System.out.println("1876: D");
        System.out.println("------------------------------------------------------");

        Scanner Q10 = new Scanner(System.in);
        char Question10 = Q10.nextLine().charAt(0);

        if (Character.toLowerCase(Question10) == 'd') {
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

String Q1 = "------------------------------------------------------\n"
    +   "Question 1:\n"
    +   " \n"
    +   "What does the abbreviation CPU stand for?\n"
    +   " \n"
    +   "Compacting Processing Unit: A\nCompiling Processing Unit: B\nCentral Processing Unit: C\nCommunication Processing Unit D\n"
    +   "------------------------------------------------------";

String[] Questions = {Q1, };

char[] Answers = {'a', 'b', 'c'};

for(int i = 0; i < Questions.length; i++;){
    System.out.println(Questions[i]);
    Scanner scan = new Scanner(System.in);
    char answer = scan.nextLine().charAt(0);
    if(answer == (Character.toLowerCase(Answers[i]))) {
    System.out.println("you answered correctly");  
    Correct++;
  }
  else{
    System.out.println("no");
  }
}
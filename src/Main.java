
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. What is the capital of Pakistan?",
                "2. Which planet is called the Red Planet?",
                "3. Who invented Java?",
                "4. What is the largest ocean?",
                "5. Which language is used for Android development?"
        };

        String[][] options = {
                {"A. Lahore", "B. Karachi", "C. Islamabad", "D. Quetta"},
                {"A. Venus", "B. Mars", "C. Earth", "D. Jupiter"},
                {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
                {"A. Indian Ocean", "B. Atlantic Ocean", "C. Pacific Ocean", "D. Arctic Ocean"},
                {"A. Python", "B. Java", "C. C++", "D. JavaScript"}
        };

        char[] answers = {'C', 'B', 'A', 'C', 'B'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char choice = Character.toUpperCase(sc.next().charAt(0));

        
            if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
                System.out.println(" Invalid input! Please enter A, B, C, or D.");
                i--; 
                continue;
            }

            if (choice == answers[i]) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Correctct!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}

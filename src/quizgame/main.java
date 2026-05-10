package quizgame;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        String[] questions = {
                "What is the capital of France?",
                "Which language is used for Android development?",
                "How many days are there in a week?"
        };

        String[][] options ={{"1. Paris", "2. London", "3. Rome"},
                                {"1. Java", "2. Python", "3. C++"},
                                {"1. 5", "2. 6", "3. 7"}};

        Scanner input = new Scanner(System.in);

        int[] answers ={1,1,3};
        int userAnswer;
        int score=0;
        System.out.println("################################");
        System.out.println("Welcome to the Basic quiz game:");

        for(int i=0; i < questions.length; i++){
            System.out.println("\n"+questions[i]);
            for (String option: options[i]){
                System.out.println(option);
            }
            System.out.println("Now Please select the option of your answers:");
            userAnswer = input.nextInt();

            if(userAnswer==answers[i]){
                score+=1;
            }

        }

        System.out.printf("Your score is: %d",score);




    }
}

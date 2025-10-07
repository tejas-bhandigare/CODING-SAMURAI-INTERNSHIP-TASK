import java.util.*;

class Question{
    String questionText;
    String[] options;
    int correctAnswer;
   
    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    boolean checkAnswer(int userAnswer){
        return userAnswer == correctAnswer;        
    }  
}

public class OnlineQuizApp  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Question[] quize ={
new Question("Which language is useed for the Android developement ?", new String[]{"python","java","c++","swift"},2),

 new Question("What does OOP stand for?",
                    new String[]{"Object Oriented Programming", "Only One Program", "Open Operational Process", "Output Oriented Programming"}, 1),
            new Question("Which keyword is used to inherit a class in Java?",
                    new String[]{"this", "super", "extends", "implements"}, 3)
        };

        int score =0;

        System.out.println("Welcome to the Online Quiz!");

        for (int i =0;i < quize.length;i++){
            Question q = quize[i];
            System.out.println("\nQuestion " + (i + 1) + ": " + q.questionText);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }
            System.out.print("Your answer (1-" + q.options.length + "): ");
            int userAnswer = sc.nextInt();

            if (q.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + q.options[q.correctAnswer - 1]);
            }
        }

        System.out.println("===== Quiz Over! =====");
        System.out.println("Your Final Score: " + score + " out of " + quize.length);

        sc.close();

    }
    
}

import java.lang.classfile.constantpool.ConstantPool;
import java.util.Scanner;

public class Mian {
    public static void main(String[] args){
        //https://youtu.be/xTtL8E4LzTQ?t=20658
        //  QUIZ GAME

        //ARRAY OF QUESTIONS[]
        //opions array[][]
        //declare variables
        // welcome message
        //qustion loop
        // options
        // get guess fromm user
        // check our guess
        // display final score

        String[] questions= {"What is the main function of a router?",
                            "Which part of the computer is considered the brain?",
                            "who is known as the father of computer?",
                            "What year was Facebook launched?",
                            "What was teh first programming language?"};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"},}; // fortran is the first commercialy available prgramming language

        int[] ans = {3, 1, 4, 2, 3};
        int score = 0;
        int guess ; // user's input
        Scanner sc = new Scanner(System.in);
        System.out.println("###########################");
        System.out.println("Welcome To The Quiz Game!!!");
        System.out.println("###########################");

        for(int i = 0; i < questions.length; i++){
            System.out.println((i+1) + ". " + questions[i]);
            char j = 'a';
            int k = 0;
            for(String option : options[i]) {
                System.out.printf("   %s\n", option);
                k++;
            }


            System.out.print("Enter Ans : ");
            int input = sc.nextInt();
            sc.nextLine();
            if(ans[i] == input){
                score++;
            }

        }
        System.out.println("Toatl score : " + score);


        sc.close();


    }
}

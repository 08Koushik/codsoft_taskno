import java.util.Scanner;
import java.util.Random;
 

public class NoGame {
    public static void NumGame()

    {
         Random random=new Random();
        int guessingNumber= random.nextInt(100);
        Scanner input= new Scanner(System.in);
        int Attempts= 8;
        int i, guess;
        System.out.println( "GUESS THE NUMBER BETWEEN 1 TO 100 IN LESS THAN GIVEN ATTEMPTS\n");
        System.out.println("READY to goo..!!!");
        for (i = 0; i < Attempts; i++){
        System.out.println("Guess the number:");
        guess = input.nextInt();
        if (guessingNumber == guess) {
            System.out.println( "woahh You guessed the corect number.");
            break;
         }

         else if (guessingNumber> guess && i != Attempts- 1) {

                System.out.println("The number is greater than " + guess);

         }

        else if (guessingNumber < guess && i!= Attempts - 1) {

                System.out.println("The number is less than " + guess);

            }

        }
 
          if (i == Attempts) {
            System.out.println("REACHED MAXIMUM ATTEMPTS .");
            System.out.println("CORRECT NUMBER"+guessingNumber);
            System.out.println("do you want to continue yes or no");
             int X=input.nextInt();
            if(X==0){
                NumGame();
            }
            else{
                System.out.println("THANK YOU ..EXIT THE GAME");
            }
        }

    }

public static void main(String arg[]){
        NumGame();
 }
}
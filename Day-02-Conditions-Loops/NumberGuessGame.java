import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = 25;

        System.out.print("Guess the number: ");

        int guess = sc.nextInt();

        if(guess == secret){

            System.out.println("Correct!");

        }else{

            System.out.println("Wrong! The correct number is " + secret);

        }

        sc.close();
    }

}
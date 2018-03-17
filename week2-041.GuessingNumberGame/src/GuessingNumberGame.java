
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        System.out.println("Guess a number: ");
        int nr = Integer.parseInt(reader.nextLine());
        int i = 1;
        
        // program your solution here. Do not touch the above lines!
        while(numberDrawn != nr) {
            if (nr > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + i);
            }
            else if (nr < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + i);
            }
            System.out.println("Guess a number: ");
            nr = Integer.parseInt(reader.nextLine());
            i++;
        }
        
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

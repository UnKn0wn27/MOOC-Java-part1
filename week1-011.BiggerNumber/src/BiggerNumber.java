
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int nr1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int nr2 = Integer.parseInt(reader.nextLine());
        
        int bigger;
        if (nr1 > nr2) {
            bigger = nr1;
        } else {
            bigger = nr2;
        }
        
        System.out.println("The bigger number of the two numbers given was: " + bigger);
        // Implement your program here. Remember to ask the input from user
    }
}

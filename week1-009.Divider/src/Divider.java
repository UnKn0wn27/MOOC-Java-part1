
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int nr1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int nr2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Division: " + nr1 + " / " + nr2 + " = " + ((double)nr1 / nr2));

        // Implement your program here. Remember to ask the input from user.
    }
}

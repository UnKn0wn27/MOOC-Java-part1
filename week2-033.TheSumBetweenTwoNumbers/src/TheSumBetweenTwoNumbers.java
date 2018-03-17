
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int nr1 = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int nr2 = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        for(int i = nr1; i <= nr2; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}

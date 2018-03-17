
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        System.out.print("Type the password: ");
        String pass = reader.nextLine();
        if (pass.equals(password)) {
            System.out.println("Right!");
            System.out.println("The secret is: jryy qbar!");
        }
        else {
            System.out.println("Wrong!");
            
            while (pass != password) {
                System.out.print("Type the password: ");
                pass = reader.nextLine();
                if (pass.equals(password)) {
                    System.out.println("Right!");
                    System.out.println("The secret is: jryy qbar!");
                    break;
                }
                else {
                    System.out.println("Wrong!");
                }
            }
        }
        // Write your code here
    }
}

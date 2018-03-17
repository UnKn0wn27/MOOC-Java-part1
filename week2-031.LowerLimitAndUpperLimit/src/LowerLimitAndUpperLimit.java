
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int nr1 = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int nr2 = Integer.parseInt(reader.nextLine());
        
        for(int i = nr1; i <= nr2; i++) {
            System.out.println(i);
        }
        
    }
}


import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int nr = Integer.parseInt(reader.nextLine());
        
        int sum_of_pow = 0;
        
        for(int i = 0; i <= nr; i++){
            sum_of_pow += Math.pow(2, i);
        }
        
        System.out.println("The result is " + sum_of_pow);
    }
}

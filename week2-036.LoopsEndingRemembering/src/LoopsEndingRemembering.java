import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int nr = 0;
        int sum = 0;
        int i = 0;
        int even = 0;
        int odd = 0;
        
        while(nr != -1) {
            nr = Integer.parseInt(reader.nextLine());
            if (nr != -1) {
                sum += nr;
                i++;
                if (nr % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
        }
        System.out.println("Thank you and see you later!");
        if (even > 0 || odd > 0) {
            System.out.println("The sum is " + sum);
            System.out.println("How many numbers: " + i);
            System.out.println("Average: " + ((float)sum / i));
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
        }
    }
}

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int nr1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int nr2 = Integer.parseInt(reader.nextLine());
        
        if (nr1 > nr2) {
            System.out.println("Greater number: " + nr1);
        } 
        else if (nr1 < nr2) {
            System.out.println("Greater number: " + nr2);
        } 
        else {
            System.out.println("The numbers are equal!");
        }
    }
}

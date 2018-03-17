
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name1 = reader.nextLine();
        System.out.print("Type your age: ");
        int nr1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type your name: ");
        String name2 = reader.nextLine();
        System.out.print("Type your age: ");
        int nr2 = Integer.parseInt(reader.nextLine());
        System.out.println(name1 + " and " + name2 + " are " + (nr1 + nr2) + " years old in total.");
        // Implement your program here
    }
}

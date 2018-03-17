import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the word; ");
        String word = reader.nextLine();
        
        System.out.println("Length of th end part: ");
        int nr = Integer.parseInt(reader.nextLine());
        int end = (word.length() - nr);
        System.out.println("Result: " + word.substring(end));
    }
}

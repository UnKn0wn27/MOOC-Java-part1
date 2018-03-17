
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        String word = "";
        
        while(true) {
            System.out.println("Type a wor: ");
            word = reader.nextLine();
            if(words.contains(word)){
                break;
            }
            words.add(word);
        }
        System.out.println("You gave the word" + word + "twice");
        
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenstats = new NumberStatistics();
        NumberStatistics oddstats = new NumberStatistics();
        
        int nr = 0;
        System.out.println("Type numbers:");
        while (nr != -1) {
            nr = Integer.parseInt(reader.nextLine());
            if(nr != -1) {
                if(nr%2==0){
                    evenstats.addNumber(nr);
                }
                else {
                    oddstats.addNumber(nr);
                }
                stats.addNumber(nr);
            }
        }
        
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenstats.sum());
        System.out.println("sum of odd: " + oddstats.sum());

    }
}

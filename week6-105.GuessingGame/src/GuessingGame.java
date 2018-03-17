import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        // write the guessing logic here    
        int average_nr = average(lowerLimit, upperLimit);
        int number_of_guesses = howManyTimesHalvable(average_nr) + 1;
        int current_nr = average_nr;
        
        for(int i = 0; i < number_of_guesses; i++){
            boolean greaterThan = isGreaterThan(average_nr);
            
            if(greaterThan){
                lowerLimit = average_nr + 1;
                if (upperLimit == lowerLimit) {
                    current_nr = upperLimit;
                    break;
                }
                average_nr = average(lowerLimit, upperLimit);
                current_nr = upperLimit;
            }
            else{                
                upperLimit = average_nr;

                if (lowerLimit == upperLimit) {
                    current_nr = lowerLimit;
                    break;
                }
                average_nr = average(lowerLimit, upperLimit);
                current_nr = lowerLimit;
            }
            
        }
        System.out.println("The number you're thinking of is " + current_nr + ".");
    }

    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String answear = this.reader.nextLine();
        return answear.equals("y");
    }
    
    public int average(int firstNumber, int secondNumber){
        return (firstNumber + secondNumber)/2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}

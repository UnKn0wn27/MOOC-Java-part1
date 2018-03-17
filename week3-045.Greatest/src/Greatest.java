
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int nr;
        
        if(number1 > number2 && number1 > number3) {
            nr = number1;
        }
        else if (number2 > number1 && number2 > number3) {
            nr = number2;
        }
        else {
            nr=number3;
        }
        return nr;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}

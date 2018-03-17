
public class Least {

    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        // method needs a return in the end
        int nr;
        if (number1 > number2) {
            nr = number2;
        }
        else {
            nr = number1;
        }
        return nr;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}

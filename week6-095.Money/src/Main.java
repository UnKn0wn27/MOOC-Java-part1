
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        Money r1 = new Money(10, 0);
        Money r2 = new Money(2, 0);
        Money r3 = r1.minus(r2);
        r3.cents();
        System.out.println(r3.cents());
    }
}

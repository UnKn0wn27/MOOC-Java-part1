public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter c = new Counter(2, false); 
        c.decrease(5); 
        System.out.println(c.value());
    }
}

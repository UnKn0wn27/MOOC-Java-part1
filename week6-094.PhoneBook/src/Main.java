
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Phonebook p = new Phonebook(); 
        p.add("Pekka", "040-123654"); 
        p.add("Jukka", "045-332211"); 
        String test = p.searchNumber("Pekka");
        System.out.println(test);
    }
}

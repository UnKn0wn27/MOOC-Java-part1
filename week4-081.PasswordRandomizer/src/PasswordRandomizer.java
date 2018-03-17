import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length_pass;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length_pass = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        
        for(int i = 0; i < this.length_pass; i++){
            char get_chr = alphabet.charAt(this.random.nextInt(alphabet.length()));
            password += get_chr;
        }
        
        return password;
    }
}

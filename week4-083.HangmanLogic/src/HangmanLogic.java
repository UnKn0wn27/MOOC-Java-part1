
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
        if(this.word.contains(letter)){
            if(!this.guessedLetters.contains(letter)) {
                this.guessedLetters += letter;
            }
        }
        else {
            if(!this.guessedLetters.contains(letter)) {
                this.guessedLetters += letter;
                this.numberOfFaults++;
            }
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        String hidden_word = "";
        for(int i = 0; i < this.word.length(); i++) {
            hidden_word += "_";
        }
        for(int i = 0; i < this.guessedLetters.length(); i++){
            char c = this.guessedLetters.charAt(i);
            if(this.word.contains(Character.toString(c))) {
                for(int j = 0; j < this.word.length(); j++){
                    if(this.word.charAt(j) == c){
                        hidden_word = hidden_word.substring(0, j) + Character.toString(c) + hidden_word.substring(j+1);
                    }
                }
            }
        }
        return hidden_word;
    }
}

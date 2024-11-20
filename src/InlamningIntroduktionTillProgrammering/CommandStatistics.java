package InlamningIntroduktionTillProgrammering;

public class CommandStatistics {
    private int AmountOfCharacters;
    private int AmountOfRows;
    private int AmountOfWords;
    private String LongestWord;

    public CommandStatistics() {
        this.AmountOfCharacters = 0;
        this.AmountOfRows = 0;
        this.AmountOfWords = 0;
        this.LongestWord = "";
    }

    //Metod uppdatera statistik
    public void Addrow(String rad) {
        AmountOfCharacters += rad.length();
        AmountOfRows++;

        // Dela upp raden i ord baserat på mellanslag
        String[] wordArray = rad.split("\\s+");
        AmountOfWords += wordArray.length;

        // Kontrollera längden på varje ord för att hitta det längsta
        for (String word : wordArray) {
            if (word.length() > LongestWord.length()) {
                LongestWord = word;
            }
        }
    }

    // Metod kontrollera "STOPP"
    public boolean isSTOP(String rad) {
        return rad.equalsIgnoreCase("STOPP");
    }

    //Metod hämta antal tecken
    public int getAmountOfCharacters(){
        return AmountOfCharacters;
    }

    //metod hämta antal rader
    public int getAmountOfRows(){
        return AmountOfRows;
    }

    // Metod för att hämta antalet ord
    public int getAmountOfWords() {
        return AmountOfWords;
    }

    // Metod för att hämta det längsta ordet
    public String getLongestWord() {
        return LongestWord;
    }
}

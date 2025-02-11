package MORSEKOD;

// Klass som hanterar översättning mellan text och Morse-kod
public class MorseLogic {
    private static final String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    private static final char[] ALFABETET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String textToMorse(String text) {
        String result = "";
        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                result += " / ";
            } else {
                for (int j = 0; j < ALFABETET.length; j++) {
                    if (c == ALFABETET[j]) {
                        result += MORSE[j] + " ";
                        break;
                    }
                }
            }
        }
        return result.trim();
    }

    public static String morseToText(String morse) {
        String result = "";
        String[] words = morse.split(" / ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                for (int i = 0; i < MORSE.length; i++) {
                    if (letter.equals(MORSE[i])) {
                        result += ALFABETET[i];
                        break;
                    }
                }
            }
            result += " ";
        }
        return result.trim();
    }
}

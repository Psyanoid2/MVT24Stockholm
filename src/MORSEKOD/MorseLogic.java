package MORSEKOD;

public class MorseLogic {
    private static final String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
            "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    private static final char[] ALFABETET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String textToMorse(String text) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                result.append(" / ");
            } else if (c < 'A' || c > 'Z') {
                throw new IllegalArgumentException("Ogiltig input: " + c + ". Endast A - Z tillåts.");
            } else {
                for (int j = 0; j < ALFABETET.length; j++) {
                    if (c == ALFABETET[j]) {
                        result.append(MORSE[j]).append(" ");
                        break;
                    }
                }
            }
        }
        return result.toString().trim();
    }

    public static String morseToText(String morse) {
        StringBuilder result = new StringBuilder();
        String[] words = morse.split(" / ");

        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                boolean found = false;
                for (int i = 0; i < MORSE.length; i++) {
                    if (letter.equals(MORSE[i])) {
                        char decodedChar = ALFABETET[i];
                        if (decodedChar < 'A' || decodedChar > 'Z') {
                            throw new IllegalArgumentException("Ogiltig morsekod: " + letter);
                        }
                        result.append(decodedChar);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    throw new IllegalArgumentException("Ogiltig morsekod: " + letter);
                }
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}

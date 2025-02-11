package MORSEKOD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Testklass för att testa MorseLogic med JUnit
public class MorseTest {

    @Test
    public void testTextToMorse() {
        assertEquals(". -", MorseLogic.textToMorse("A"));
        assertEquals(". - / -...", MorseLogic.textToMorse("A B"));
        assertEquals(".... . . .-.. .-.. ---", MorseLogic.textToMorse("HELLO"));
    }

    @Test
    public void testMorseToText() {
        assertEquals("A", MorseLogic.morseToText(". -"));
        assertEquals("A B", MorseLogic.morseToText(". - / -..."));
        assertEquals("HELLO", MorseLogic.morseToText(".... . . .-.. .-.. ---"));
    }

    @Test
    public void testEmptyInput() {
        assertEquals("", MorseLogic.textToMorse(""));
        assertEquals("", MorseLogic.morseToText(""));
    }

    @Test
    public void testInvalidCharacters() {
        assertEquals("", MorseLogic.textToMorse("123")); // Ej stöd för siffror
        assertEquals("", MorseLogic.morseToText(".---- ..---")); // Ej stöd för siffror
    }

    @Test
    public void testSentenceWithSpaces() {
        assertEquals(".... . .-.. .-.. --- / .-- --- .-. .-.. -..", MorseLogic.textToMorse("HELLO WORLD"));
        assertEquals("HELLO WORLD", MorseLogic.morseToText(".... . .-.. .-.. --- / .-- --- .-. .-.. -.."));
    }
}

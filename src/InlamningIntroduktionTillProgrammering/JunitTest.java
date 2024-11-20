package InlamningIntroduktionTillProgrammering;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {


    // Test1: Kontrollera om "ärStop" identifierar "stop" korrekt
    @Test
    public void testIsStopp() {
        CommandStatistics statistik = new CommandStatistics();

        assertTrue(statistik.isSTOP("stopp"), "Metoden borde returnera true för 'stopp'");
        assertTrue(statistik.isSTOP("STOPP"), "Metoden borde returnera true för 'STOPP' (skiftlägesokänsligt)");
        assertFalse(statistik.isSTOP("fortsätt"), "Metoden borde returnera false för 'fortsätt'");
    }

    // Test2: Lägg till en rad och kontrollera tecken och radantal
    @Test
    public void testTeckenOchRad() {
        CommandStatistics statistik = new CommandStatistics();

        statistik.Addrow("Testa detta"); // 10 tecken
        assertEquals(11, statistik.getAmountOfCharacters(), "Antalet tecken borde vara 11");
        assertEquals(1, statistik.getAmountOfRows(), "Antalet rader borde vara 1");
    }

    // Test3: Kontrollera det längsta ordet
    @Test
    public void testLangstaOrd() {
        CommandStatistics statistik = new CommandStatistics();

        statistik.Addrow("Det här är ett mycket långt ord: nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljninssystemdiskussionsinläggsförberedelsearbeten");
        assertEquals("nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljninssystemdiskussionsinläggsförberedelsearbeten", statistik.getLongestWord(), "Det längsta ordet borde vara 'nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljninssystemdiskussionsinläggsförberedelsearbeten'");
    }

    // Testfall 4: Lägg till flera rader och kontrollera ackumulering av tecken och rader
    @Test
    public void testAckumulering() {
        CommandStatistics statistik = new CommandStatistics();

        statistik.Addrow("Första raden");   // 12 tecken
        statistik.Addrow("Andra raden");    // 11 tecken
        statistik.Addrow("Tredje raden");   // 12 tecken

        assertEquals(35, statistik.getAmountOfCharacters(), "Antalet tecken borde vara 35 efter tre rader");
        assertEquals(3, statistik.getAmountOfRows(), "Antalet rader borde vara 3 efter tre rader");
        assertEquals(6, statistik.getAmountOfWords(), "Antalet ord borde vara 6 efter tre rader");
    }
}

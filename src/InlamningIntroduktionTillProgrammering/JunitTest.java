package InlamningIntroduktionTillProgrammering;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {


    // Testfall 1: Kontrollera om "ärStop" identifierar "stop" korrekt
    @Test
    public void testIsStopp() {
        CommandStatistics statistik = new CommandStatistics();

        assertTrue(statistik.isSTOPP("stopp"), "Metoden borde returnera true för 'stopp'");
        assertTrue(statistik.isSTOPP("STOPP"), "Metoden borde returnera true för 'STOPP' (skiftlägesokänsligt)");
        assertFalse(statistik.isSTOPP("fortsätt"), "Metoden borde returnera false för 'fortsätt'");
    }

    // Testfall 2: Lägg till en rad och kontrollera tecken och radantal
    @Test
    public void testTeckenOchRad() {
        CommandStatistics statistik = new CommandStatistics();

        statistik.laggTillRad("Testa detta"); // 10 tecken
        assertEquals(11, statistik.getAntalTecken(), "Antalet tecken borde vara 11");
        assertEquals(1, statistik.getAntalRader(), "Antalet rader borde vara 1");
    }

    // Testfall 3: Kontrollera det längsta ordet
    @Test
    public void testLangstaOrd() {
        CommandStatistics statistik = new CommandStatistics();

        statistik.laggTillRad("Det här är ett mycket långt ord: nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljninssystemdiskussionsinläggsförberedelsearbeten");
        assertEquals("nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljninssystemdiskussionsinläggsförberedelsearbeten", statistik.getLangstaOrd(), "Det längsta ordet borde vara 'nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljninssystemdiskussionsinläggsförberedelsearbeten'");
    }

    // Testfall 4: Lägg till flera rader och kontrollera ackumulering av tecken och rader
    @Test
    public void testAckumulering() {
        CommandStatistics statistik = new CommandStatistics();

        statistik.laggTillRad("Första raden");   // 12 tecken
        statistik.laggTillRad("Andra raden");    // 11 tecken
        statistik.laggTillRad("Tredje raden");   // 12 tecken

        assertEquals(35, statistik.getAntalTecken(), "Antalet tecken borde vara 35 efter tre rader");
        assertEquals(3, statistik.getAntalRader(), "Antalet rader borde vara 3 efter tre rader");
        assertEquals(6, statistik.getAntalOrd(), "Antalet ord borde vara 6 efter tre rader");
    }
}

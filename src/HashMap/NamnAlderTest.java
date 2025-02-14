package HashMap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NamnAlderLagringTest {
    @Test
    void testHamtaAlder() {
        NamnAlderLagring namnAlderLagring = new NamnAlderLagring();
        namnAlderLagring.laggTill("Eva", 35);
        namnAlderLagring.laggTill("Oskar", 40);

        assertEquals(35, namnAlderLagring.hamtaAlder("Eva"));
        assertEquals(40, namnAlderLagring.hamtaAlder("Oskar"));
        assertNull(namnAlderLagring.hamtaAlder("Lena"));
    }
}

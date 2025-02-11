package UppgiftOOP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberToLetterConverter {
        private final String[][] mappings = new String[26][2];

        public NumberToLetterConverter() {
                for (int i = 0; i < 26; i++) {
                        mappings[i][0] = String.valueOf(i + 1);
                        mappings[i][1] = String.valueOf((char) ('A' + i));
                }
        }

        public String convert(int number) {
                if (number < 1 || number > 26) {
                        throw new IllegalArgumentException("Number out of range");
                }
                return mappings[number - 1][1];
        }
}

class NumberToLetterConverterTest {
        private final NumberToLetterConverter converter = new NumberToLetterConverter();

        @Test
        void testConvert1ToA() {
                assertEquals("A", converter.convert(1));
        }

        @Test
        void testConvert3ToC() {
                assertEquals("C", converter.convert(3));
        }

        @Test
        void testConvert26ToZ() {
                assertEquals("Z", converter.convert(26));
        }

        @Test
        void testConvert10ToJ() {
                assertEquals("J", converter.convert(10));
        }

        @Test
        void testConvertOutOfRange() {
                assertThrows(IllegalArgumentException.class, () -> converter.convert(27));
        }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testSoma() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void testSubtracao() {
        assertEquals(2, 5 - 3);
    }

    @Test
    void testMultiplicacao() {
        assertEquals(6, 2 * 3);
    }

    @Test
    void testDivisao() {
        assertEquals(2, 4 / 2);
    }

    @Test
    void testBooleano() {
        assertTrue(5 > 1);
    }
}
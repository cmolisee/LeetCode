import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerSolutionTest {

    RomanToIntegerSolution romanToIntegerSolution;

    @BeforeEach
    void setUp() {
        romanToIntegerSolution = new RomanToIntegerSolution();
    }

    @Test
    @Description("V = 5")
    void testA() {
        assertEquals(5, romanToIntegerSolution.romanToInteger("V"));
    }

    @Test
    @Description("IIV = 3")
    void testB() {
        assertEquals(3, romanToIntegerSolution.romanToInteger("IIV"));
    }

    @Test
    @Description("III = 3")
    void testC() {
        assertEquals(3, romanToIntegerSolution.romanToInteger("III"));
    }

    @Test
    @Description("VII = 7")
    void testD() {
        assertEquals(7, romanToIntegerSolution.romanToInteger("VII"));
    }
}
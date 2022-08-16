import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagSolutionTest {

    ZigZagSolution zigZagSolution;

    @BeforeEach
    void setUp() {
        zigZagSolution = new ZigZagSolution();
    }

    @Test
    void TestA() {
        String ans = zigZagSolution.convert("PAYPALISHIRING", 1);
        String expected = "PAYPALISHIRING";

        System.out.println(ans);
        assertEquals(expected, ans);
    }

    @Test
    void TestB() {
        String ans = zigZagSolution.convert("PAYPALISHIRING", 2);
        String expected = "PYAIHRNAPLSIIG";

        System.out.println(ans);
        assertEquals(expected, ans);
    }

    @Test
    void TestC() {
        String ans = zigZagSolution.convert("PAYPALISHIRING", 3);
        String expected = "PAHNAPLSIIGYIR";

        System.out.println(ans);
        assertEquals(expected, ans);
    }

    @Test
    void TestD() {
        String ans = zigZagSolution.convert("PAYPALISHIRING", 4);
        String expected = "PINALSIGYAHRPI";

        System.out.println(ans);
        assertEquals(expected, ans);
    }
}
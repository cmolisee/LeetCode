import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTwoIntegerSolutionTest {

    DivideTwoIntegerSolution divideTwoIntegerSolution;

    @BeforeEach
    void setUp() {
        divideTwoIntegerSolution = new DivideTwoIntegerSolution();
    }

    @Test
    void testA() {
        int answer = divideTwoIntegerSolution.divide(10, 3);
        int expected = 3;

        System.out.println("divideTwoIntegerSolution.divide(10, 3) = 3");

        assertEquals(expected, answer);
    }

    @Test
    void testB() {
        int answer = divideTwoIntegerSolution.divide(7, -3);
        int expected = -2;

        System.out.println("divideTwoIntegerSolution.divide(7, -3) = -2");

        assertEquals(expected, answer);
    }
}
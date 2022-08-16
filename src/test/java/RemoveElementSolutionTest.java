import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementSolutionTest {

    RemoveElementSolution removeElementSolution;

    @BeforeEach
    void setUp() {
        removeElementSolution = new RemoveElementSolution();
    }

    @Test
    void testA() {
        int ans = removeElementSolution.removeElement(new int[]{3, 2, 2, 3}, 3);
        int expected = 2;
        System.out.println("removeElement(new int[]{3, 2, 2, 3}, 3) = " + ans);
        assertEquals(expected, ans);
    }

    @Test
    void testB() {
        int ans = removeElementSolution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        int expected = 5;
        System.out.println("removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 3) = " + ans);
        assertEquals(expected, ans);
    }

    @Test
    void testC() {
        int ans = removeElementSolution.removeElement(new int[]{1}, 1);
        int expected = 0;
        System.out.println("removeElement(new int[]{1}, 1) = " + ans);
        assertEquals(expected, ans);
    }

    @Test
    void testD() {
        int ans = removeElementSolution.removeElement(new int[]{2, 2, 3}, 2);
        int expected = 1;
        System.out.println("removeElement(new int[]{2, 2, 3}, 2) = " + ans);
        assertEquals(expected, ans);
    }

    @Test
    void testE() {
        int ans = removeElementSolution.removeElement(new int[]{}, 0);
        int expected = 0;
        System.out.println("removeElement(new int[], 2) = " + ans);
        assertEquals(expected, ans);
    }
}
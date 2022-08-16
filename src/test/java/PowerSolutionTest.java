import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerSolutionTest {

    PowerSolution powerSolution;

    @BeforeEach
    void setUp() {
        powerSolution = new PowerSolution();
    }

    @Test
    @Description("x=2.00000, n=10 => 1024.00000")
    void testA() {
        double ans = powerSolution.pow(2.00000, 10);
        System.out.println("powerSolution.pow(2.00000, 10) = " + ans);
        assertEquals(1024.00000, ans);
    }

    @Test
    @Description("x=2.10000, n=3 => 9.26100")
    void testB() {
        double ans = powerSolution.pow(2.10000, 3);
        System.out.println("powerSolution.pow(2.10000, 3) = " + ans);
        assertEquals(9.26100, ans);
    }

    @Test
    @Description("x=2.00000, n=-2 => 0.25000")
    void testC() {
        double ans = powerSolution.pow(2.00000, -2);
        System.out.println("powerSolution.pow(2.00000, -2) = " + ans);
        assertEquals(0.25000, ans);
    }

    @Test
    @Description("x=100, n=5 => 10,000,000,000")
    void testD() {
        double ans = powerSolution.pow(100, 5);
        System.out.println("powerSolution.pow(100, 5) = " + ans);
        assertEquals(10000000000.00000, ans);
    }

    @Test
    @Description("x=100, n=5 => 10,000,000,000")
    void testE() {
        double ans = powerSolution.pow(100, -5);
        System.out.println("powerSolution.pow(100, -5) = " + ans);
        assertEquals(0, ans);
    }

    @Test
    @Description("x=-1.00000, n=2147483647 => 1.00000")
    void testF() {
        double ans = powerSolution.pow(-1.00000, Integer.MIN_VALUE);
        System.out.println("powerSolution.pow(1.00000, 2147483647) = " + ans);
        assertEquals(1.00000, ans);
    }

    @Test
    @Description("x=-1.00000, n=-2147483648 => 1.00000")
    void testG() {
        double ans = powerSolution.pow(-1.00000, Integer.MAX_VALUE + 1);
        System.out.println("powerSolution.pow(1.00000, 2147483647) = " + ans);
        assertEquals(1.00000, ans);
    }
}
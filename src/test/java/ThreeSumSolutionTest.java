import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumSolutionTest {

    ThreeSumSolution threeSumSolution;

    @BeforeEach
    void setUp() {
        threeSumSolution = new ThreeSumSolution();
    }

    @Test
    void testA() {
        List<List<Integer>> ans = threeSumSolution.threeSum(new int[]{0,0,0});
        assertEquals(1, ans.size());
        ans.forEach((i) -> {
            assertEquals(
                    0,
                    i.stream().mapToInt(Integer::valueOf).sum()
            );
        });
    }

    @Test
    void testB() {
        List<List<Integer>> ans = threeSumSolution.threeSum(new int[]{0,0,0,1,0,-1});
        assertEquals(2, ans.size());
        ans.forEach((i) -> {
            assertEquals(
                    0,
                    i.stream().mapToInt(Integer::valueOf).sum()
            );
        });
    }

    @Test
    void testC() {
        List<List<Integer>> ans = threeSumSolution.threeSum(new int[]{0,0,0,0});
        assertEquals(1, ans.size());
        ans.forEach((i) -> {
            assertEquals(
                    0,
                    i.stream().mapToInt(Integer::valueOf).sum()
            );
        });
    }

    @Test
    void testD() {
        List<List<Integer>> ans = threeSumSolution.threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4});
        assertEquals(9, ans.size());
        ans.forEach((i) -> {
            assertEquals(
                    0,
                    i.stream().mapToInt(Integer::valueOf).sum()
            );
        });
    }
}
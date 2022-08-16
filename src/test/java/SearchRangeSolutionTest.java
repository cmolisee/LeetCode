import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SearchRangeSolutionTest {

    SearchRangeSolution searchRangeSolution;

    @BeforeEach
    void setUp() {
        searchRangeSolution = new SearchRangeSolution();
    }

    @Test
    void testA() {
        int[] ans = searchRangeSolution.searchRange(
                new int[]{5, 7, 7, 8, 8, 10},
                8
        );
        int[] expected = {3,4};
        assertArrayEquals(expected, ans);
    }

    @Test
    void testB() {
        int[] ans = searchRangeSolution.searchRange(
                new int[]{},
                8
        );
        int[] expected = {-1, -1};
        assertArrayEquals(expected, ans);
    }

    @Test
    void testC() {
        int[] ans = searchRangeSolution.searchRange(
                new int[]{9},
                9
        );
        int[] expected = {0, 0};
        assertArrayEquals(expected, ans);
    }

    @Test
    void testD() {
        int[] ans = searchRangeSolution.searchRange(
                new int[]{1,1,3,3,4,4,4,5,5,5,5,7,7,7,7,9},
                6
        );
        int[] expected = {-1, -1};
        assertArrayEquals(expected, ans);
    }

    @Test
    void testE() {
        int[] ans = searchRangeSolution.searchRange(
                new int[]{2, 2},
                2
        );
        int[] expected = {0, 1};
        assertArrayEquals(expected, ans);
    }
}
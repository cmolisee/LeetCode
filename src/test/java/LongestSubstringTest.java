import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringSolutionTest {

    LongestSubstringSolution longestSubstringSolution;

    @BeforeEach
    void setup() {
        longestSubstringSolution = new LongestSubstringSolution();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test abcabcbb")
    void testA() {
        assertEquals(3, longestSubstringSolution.LongestSubstring("abcabcbb"));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test bbbbbbbb")
    void testB() {
        assertEquals(1, longestSubstringSolution.LongestSubstring("bbbbbbbb"));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test pwwkew")
    void testC() {
        assertEquals(3, longestSubstringSolution.LongestSubstring("pwwkew"));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test empty string")
    void testD() {
        assertEquals(0, longestSubstringSolution.LongestSubstring(""));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test string with space")
    void testE() {
        assertEquals(1, longestSubstringSolution.LongestSubstring(" "));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test dvdf")
    void testF() {
        assertEquals(3, longestSubstringSolution.LongestSubstring("dvdf"));
    }
}
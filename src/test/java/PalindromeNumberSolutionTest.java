import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberSolutionTest {

    PalindromeNumberSolution palindromeNumberSolution;

    @BeforeEach
    void setUp() {
        palindromeNumberSolution = new PalindromeNumberSolution();
    }

    @Test
    void testA() {
        boolean a1 = palindromeNumberSolution.isPalindrome(0);
        boolean a2 = palindromeNumberSolution.isPalindrome2(0);
        assertTrue(a1);
        assertTrue(a2);
    }

    @Test
    void testB() {
        boolean a1 = palindromeNumberSolution.isPalindrome(101);
        boolean a2 = palindromeNumberSolution.isPalindrome2(101);
        assertTrue(a1);
        assertTrue(a2);
    }

    @Test
    void testC() {
        boolean a1 = palindromeNumberSolution.isPalindrome(Integer.MAX_VALUE);
        boolean a2 = palindromeNumberSolution.isPalindrome2(Integer.MAX_VALUE);
        assertFalse(a1);
        assertFalse(a2);
    }

    @Test
    void testD() {
        boolean a1 = palindromeNumberSolution.isPalindrome(567898765);
        boolean a2 = palindromeNumberSolution.isPalindrome2(567898765);
        assertTrue(a1);
        assertTrue(a2);
    }

    @Test
    void testE() {
        boolean a1 = palindromeNumberSolution.isPalindrome(1234567899);
        boolean a2 = palindromeNumberSolution.isPalindrome2(1234567899);
        assertFalse(a1);
        assertFalse(a2);
    }
}
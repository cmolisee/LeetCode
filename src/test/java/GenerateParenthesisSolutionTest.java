import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesisSolutionTest {

    GenerateParenthesisSolution generateParenthesisSolution;

    @BeforeEach
    void setUp() {
        generateParenthesisSolution = new GenerateParenthesisSolution();
    }

    @Test
    void testA() {
        List<String> ans = generateParenthesisSolution.generateParenthesis(3);
        List<String> expected = Arrays.asList(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
        );
        for(int i = 0; i < ans.size(); ++i) {
            assertEquals(expected.get(i), ans.get(i));
        }
    }
}
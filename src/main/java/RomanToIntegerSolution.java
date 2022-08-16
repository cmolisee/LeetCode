import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToIntegerSolution {
    public int romanToInteger(String s) {
        Map<Character, Integer> RomanIntMap = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        List<Integer> ints = new ArrayList<>();

        int i = 0;
        for (Character c: s.toCharArray()) {
            int val = RomanIntMap.get(c);

            if (ints.size() == 0) {
                ints.add(val);
                ++i;
            } else if (val == ints.get(i - 1)) {
                ints.set(i - 1, ints.get(i - 1) + val);
            } else if (val > ints.get(i - 1)) {
                ints.set(i - 1, ints.get(i - 1) * -1);
                ints.add(val);
                ++i;
            } else if (val < ints.get(i - 1)) {
                ints.add(val);
                ++i;
            }
        }

        return ints.stream().mapToInt(Integer::intValue).sum();
    }
}

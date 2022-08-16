public class LongestSubstringSolution {
    public int LongestSubstring(String s) {
        StringBuilder test = new StringBuilder();
        int max = 0;

        if (s.length() == 1) {
            return 1;
        }

        for (char c : s.toCharArray()) {
            String curr = String.valueOf(c);

            if (test.toString().contains(curr)) {
                test = new StringBuilder(
                        test.substring(test.indexOf(curr) + 1)
                );
            }

            test.append(c);
            max = Math.max(test.length(), max);
        }

        return max;
    }
}

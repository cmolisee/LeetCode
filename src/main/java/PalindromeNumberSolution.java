public class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x == Integer.MAX_VALUE) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        StringBuilder s = new StringBuilder(String.valueOf(x));
        return s.toString().equals(s.reverse().toString());
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || x == Integer.MAX_VALUE) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        long r = 0L;
        int a = x;
        while (a > 0) {
            int t =  a % 10;
            r = r * 10 + t;
            a /= 10;
        }

        return x == r;
    }

}

public class DivideTwoIntegerSolution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }

        if (divisor == dividend) {
            return 1;
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int q = 0;
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);

        while (a - b >= 0) {
            int x = 0;
            while (a - ((b << 1) << x) >= 0) {
                x++;
            }
            q += 1 << x;
            a -= b << x;
        }

        if ((dividend >= 0) == (divisor >= 0)) {
            return q;
        } else {
            return -1 * q;
        }
    }
}

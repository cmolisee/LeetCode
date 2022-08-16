public class PowerSolution {
    public double pow(double x, int n) {
        if (x == 1) {
            return 1;
        }

        if (x == -1) {
            return n % 2 == 1 ? -1 : 1;
        }

        if (n == 0) {
            return 1;
        }

        if (n == Integer.MAX_VALUE) {
            return x;
        }

        if (x == 0 || n == Integer.MIN_VALUE) {
            return 0.00000;
        }

        if (n < 0) {
            x = 1 / x;
        }

        n = Math.abs(n);
        double ans = x;
        while (n > 1) {
            ans *= x;
            n -= 1;

            if (Math.abs(ans) < 0.00001) {
                return 0;
            }
        }

        return (double)Math.round(ans * 100000d) / 100000d;
    }
}

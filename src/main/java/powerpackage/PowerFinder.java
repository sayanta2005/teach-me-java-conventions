package powerpackage;

public class PowerFinder {
    public static int getPower(int base, int exp) {
        int ans = 1;
        for (int i = 0; i < exp; i++) {
            ans *= base;
        }
        return ans;
    }
}

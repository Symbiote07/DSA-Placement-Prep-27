class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0, r, k = 0;

        while (n != 0) {
            r = n % 10;
            sum += r;
            k += r * r;
            n /= 10;       // Important
        }

        return (k - sum >= 50);
    }
}
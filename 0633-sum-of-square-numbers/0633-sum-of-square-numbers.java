class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i <= (int) Math.sqrt(c); i++) {
            int rem = c - i * i;
            int r = (int) Math.round(Math.sqrt(rem));
            if ((long) r * r == rem)
                return true;
        }
        return false;
    }
}
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(""+a+b);
        int abab = 2 * a * b;
        return Math.max(ab, abab);
    }
}
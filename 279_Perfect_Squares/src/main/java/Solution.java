public class Solution {
    public int numSquares(int n) {
        int[] allAnswer = new int[n+1];
        for(int i = 0 ; i <= n ; i++){
            allAnswer[i] = i;
            for(int j = 1; i - j*j >= 0 ;j++){
                allAnswer[i] = Math.min(allAnswer[i],allAnswer[i - j*j] + 1);
            }
        }
        return allAnswer[n+1];
    }
}

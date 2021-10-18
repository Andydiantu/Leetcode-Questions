public class Solution {
    public int maxProfit(int[] prices){
        int[][] answerMatrix = new int[prices.length][4];
        answerMatrix[0][0] = -prices[0];
        for(int i = 1; i < prices.length; i++){
            answerMatrix[i][0] =   - prices[i];
            answerMatrix[i][1] = Math.max(answerMatrix[i-1][1], answerMatrix[i-1][0] + prices[i]);
            answerMatrix[i][2] = Math.max(answerMatrix[i-1][2], answerMatrix[i-1][1] - prices[i]);
            answerMatrix[i][3] = Math.max(answerMatrix[i-1][3], answerMatrix[i-1][2] + prices[i]);
        }

        return answerMatrix[prices.length-1][3];
    }
}

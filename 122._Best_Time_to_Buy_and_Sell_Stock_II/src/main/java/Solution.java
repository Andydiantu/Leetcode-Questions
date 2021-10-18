public class Solution {
    public int maxProfit(int[] prices){
        int[][] answerMatrix = new int[2][2];

        answerMatrix[0][0] = -prices[0];
        for(int i = 1; i < prices.length; i ++ ){
            answerMatrix[1][0] = Math.max(answerMatrix[0][0],answerMatrix[0][1] - prices[i]);
            answerMatrix[1][1] = Math.max(answerMatrix[0][1],answerMatrix[0][0] + prices[i]);

            answerMatrix[0][0] = answerMatrix[1][0];
            answerMatrix[0][1] = answerMatrix[1][1];
        }

        return answerMatrix[1][1];
    }
}

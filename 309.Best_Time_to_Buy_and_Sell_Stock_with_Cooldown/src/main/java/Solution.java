public class Solution {
    public int maxProfit(int[] prices) {
        int [][] answerMatrix = new int[prices.length][3];

        //base case
        answerMatrix[0][0] = -prices[0];

        for(int i = 1; i < prices.length; i ++){
            answerMatrix[i][0] = Math.max(answerMatrix[i-1][0],answerMatrix[i-1][2]-prices[i]);
            answerMatrix[i][1] = answerMatrix[i-1][0] + prices[i];
            answerMatrix[i][2] = Math.max(answerMatrix[i-1][1],answerMatrix[i-1][2]);
        }

        return Math.max(answerMatrix[prices.length-1][1],answerMatrix[prices.length-1][2]);
    }
}

public class Solution {
    public String convert(String s, int numRows) {

        String answer = "";
        int numInUnit = 0;
        if (numRows == 1){
            numInUnit = 1;
        }
        else if (numRows == 2){
            numInUnit = 2;
        } else {
            numInUnit = 4 + (numRows - 3) * 2;
        }

        for (int i = 0; i < numRows; i ++){
            int j = 0;
            while ((j * numInUnit + i) < s.length()){
                answer = answer + s.charAt(numInUnit * j + i);
                if (i != 0 & i != (numRows - 1)  & (j * (numInUnit) + (numInUnit - i)) < s.length()){
                    answer = answer + s.charAt((j * (numInUnit) + (numInUnit - i) ));
                }
                j ++;
            }
        }
        return  answer;
    }

//
//    B   F   D
//    C C P F A
//    D   D   Z
}

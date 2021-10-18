import java.net.BindException;
import java.util.List;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2 ){
            return s;
        }

        int maxLength = 1;
        int indexStart = 0;
        int indexEnd = 0;
        for (int i = 1; i < s.length(); i++){
            int maxSingle = expandTwoSides(s,i,i);
            if (maxSingle > maxLength){
                maxLength = maxSingle;
                indexStart = i - ((maxLength - 1)/2);
                indexEnd = i +  ((maxLength - 1)/2);
            }
            int maxDouble = expandTwoSides(s,i-1,i);
            if (maxDouble > maxLength){
                maxLength = maxDouble;
                indexStart = i - (maxLength / 2);
                indexEnd   = i + (maxLength/2)-1;
            }

        }

        return s.substring(indexStart,indexEnd+1);
    }

    public int expandTwoSides(String s, int indexLeft, int indexRight) {

        while(indexLeft >= 0 & indexRight < s.length() & s.charAt(indexLeft) == s.charAt(indexRight)){
            indexLeft--;
            indexRight++;
            if (!(indexLeft >= 0 & indexRight < s.length())){
                break;
            }
        }
        return indexRight - indexLeft - 1;
    }
}

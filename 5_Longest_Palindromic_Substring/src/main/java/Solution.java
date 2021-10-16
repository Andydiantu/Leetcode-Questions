import java.util.List;

public class Solution {
    public String longestPalindrome(String s) {

        return null;
    }

    public void currPalindrome(String s, List<Integer> middleListSingle, List<Integer> middleListDouble, int currWide ){
        List<Integer> newMiddleListSingle = null;
        List<Integer> newMiddleListDouble = null;

         for (int i : middleListSingle){
             if ((i + currWide < s.length()) && (i - currWide >= 0) ){
                 if (s.charAt(i+currWide) == s.charAt(i-currWide)){
                     newMiddleListSingle.add(i);
                 } else {
                     continue;
                 }
             } else {
                 continue;
             }
         }

         for (int i : middleListDouble){
  //           if (())
         }
    }
}

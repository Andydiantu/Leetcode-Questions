import java.util.Stack;

public class Solution {
    public int reverse(int x) {
        long ans = 0; // need to spcify long here to make sure value dont loss when exceed the limit of int32
        while (x != 0){
            int digit = x % 10;
            ans = ans * 10 + digit;
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
                return 0;
            }
            x = x /10;
        }

        return (int)ans;
    }
}

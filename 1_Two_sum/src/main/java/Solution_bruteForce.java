import java.util.Arrays;

public class Solution_bruteForce {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[0];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i]+nums[j] == target){
                    ans = new int[]{i, j};
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        System.out.println(nums.toString());
        int[] answer = twoSum(nums,6);

        System.out.println(Arrays.toString(answer));

    }
}

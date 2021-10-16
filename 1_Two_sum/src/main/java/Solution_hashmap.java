import java.util.Arrays;
import java.util.HashMap;
public class Solution_hashmap {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberSet = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++){
             numberSet.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++){
            int remain = target - nums[i];
            if (numberSet.containsKey(remain)){
                int index = numberSet.get(remain);
                if (index != i){
                    return new int[] {i,index};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums;
        int target;
        nums = new int[]{3, 3};
        target = 6;

        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(10%10);
    }
}

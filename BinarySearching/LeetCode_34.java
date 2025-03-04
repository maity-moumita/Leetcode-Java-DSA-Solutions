import java.util.Arrays;

public class LeetCode_34 {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                ans[0] = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}

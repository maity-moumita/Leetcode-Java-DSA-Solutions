import java.util.Arrays;

public class Array_1480 {
    public static void main(String[] args){
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];

        for(int i = 1;i<nums.length;i++){
            ans[i] = nums[i] + ans[i-1];
        }
        return ans;
    }
}

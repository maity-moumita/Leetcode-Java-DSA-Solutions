import java.util.Arrays;

public class Array_1920{
    public static void main(String[] args){       
           int[] nums = {0,2,1,5,3,4};
           System.out.println(Arrays.toString(buildArray(nums)));
        }
        static int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];
            for(int i = 0;i<nums.length;i++){
                ans[i] = nums[nums[i]];
            } 
            return ans;
       }
    }
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_1389{
    public static void main(String[] args) {
         int[] nums = {0,1,2,3,4};
         int[] index = {0,1,2,2,1};
         System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    static public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
           target.add(index[i],nums[i]);
        }
        int[] ans = new int[target.size()];
        for(int i = 0;i< nums.length;i++){
           ans[i] = target.get(i);
        }
        return ans;
       }
}
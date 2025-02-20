import java.util.Arrays;

public class Array_1365 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smaller = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    smaller++;
                }
            }
            ans[i] = smaller;
        }
        return ans;
    }
}

public class LeetCode_81 {
    public static void main(String[] args){
        int[] nums = {2,25,6,0,0,1,2};
        int target = 25;
        System.out.println(search(nums, target));
    }
    static public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (nums.length == 0)
            return false;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target)
                return true;
        }
        return false;
    }
}

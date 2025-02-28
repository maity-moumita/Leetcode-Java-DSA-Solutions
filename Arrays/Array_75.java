public class Array_75 {
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
    static public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp;
                if (nums[j] < nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

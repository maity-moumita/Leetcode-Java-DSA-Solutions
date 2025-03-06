public class Leetcode_153 {
    public static void main(String[] args){
        int[] nums = {11,13,15,17};
        System.out.println(findMin(nums));
    }
    static public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] <= nums[end])
            return nums[start];
        // What we're doing here that if nums[start] > nums[end] means the array is
        // sorted without any rotation just return nums[start]

        // But if it is not then it will go inisde the loop and we'll check the
        // nums[mid] > nums[end] if it is greater means we still not reached yet at the
        // smallest number if we reahed then it will return nums[start] because we
        // changed the start index.

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}

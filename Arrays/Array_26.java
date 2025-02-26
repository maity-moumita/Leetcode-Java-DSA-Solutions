public class Array_26 {
    public static void main(String[] args){
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    static public int removeDuplicates(int[] nums) {
        // List<Integer> expectedNums = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (!expectedNums.contains(nums[i])) {
        // expectedNums.add(nums[i]);
        // }
        // }

        // for (int i = 0; i < expectedNums.size(); i++) {
        // nums[i] = expectedNums.get(i);
        // }
        // int k = expectedNums.size();
        // return k;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

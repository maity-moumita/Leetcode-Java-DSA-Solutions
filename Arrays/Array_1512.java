public class Array_1512 {
    public static void main(String[] args){
       int[] nums = {1,1,1,1};
       System.out.println(numIdenticalPairs(nums));
    }
    static public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}

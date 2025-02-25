public class Array_1295 {
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i< nums.length;i++){
            int n = nums[i];
            int key = 0;
            while(n>0){
                n = n/10;
                key++;
            }
    
            if(key %2 == 0) count++;
        }
            return count;
        }
}

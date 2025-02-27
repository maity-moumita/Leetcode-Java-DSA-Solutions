import java.util.Arrays;

public class Array_66 {
    public static void main(String[] args){
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static public int[] plusOne(int[] digits) {
        int[] nums = new int[digits.length + 1];
        int n = digits.length - 1;
        for (int i = n; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        nums[0] = 1;
        return nums;
    }
}

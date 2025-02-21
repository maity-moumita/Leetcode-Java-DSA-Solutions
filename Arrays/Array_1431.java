import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                result.add(j, true);
            } else {
                result.add(j, false);
            }
        }
        return result;
    }
}

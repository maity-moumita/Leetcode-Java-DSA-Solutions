import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_1773 {
    public static void main(String[] args) {
        String[][] itemsArray = { { "phone", "blue", "pixel" }, { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" } };
        String ruleKey = "color", ruleValue = "silver";
        
         // Convert 2D array to List of List
        List<List<String>> items = new ArrayList<>();
        for (String[] row : itemsArray) {
            items.add(Arrays.asList(row));
        }

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
        int index = -1;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                matches++;
            }
        }

        return matches;
    }
}

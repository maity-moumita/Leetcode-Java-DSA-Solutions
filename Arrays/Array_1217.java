public class Array_1217 {
    public static void main(String[] args) {
       int[] position =  {2,2,2,3,3};
       System.out.println(minCostToMoveChips(position));
    }
    static public int minCostToMoveChips(int[] position) {
        int evenCost = 0;
        int oddCost = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                evenCost++;
            } else {
                oddCost++;
            }
        }
        return Math.min(evenCost, oddCost);
    }
}

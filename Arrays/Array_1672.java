import java.util.Arrays;

public class Array_1672 {
    public static void main(String[] args){
      int[][] accounts = {{1,5},{7,3},{17,5}};
      System.out.println((maximumWealth(accounts)));
    }
        static int maximumWealth(int[][] accounts) {
            int wealth = 0;
            for (int i = 0; i < accounts.length; i++) {
                int total = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    total += accounts[i][j];
    
                    if (total > wealth)
                        wealth = total;
                }
            }
            return wealth;
        }
    }


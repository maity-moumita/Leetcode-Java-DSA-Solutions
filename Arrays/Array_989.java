import java.util.ArrayList;
import java.util.List;

public class Array_989 {
    public static void main(String[] args){
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
    static public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        for(int i = num.length-1;i >= 0 ;--i){
            ans.add(0,(num[i] + k)%10);
            k = (num[i] + k)/10;
        }
        while(k>0){
            ans.add(0,k%10);
            k/= 10;
        }
        return ans;
    }
}

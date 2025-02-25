public class Array_1572{
    public static void main(String[] args){
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }
    static public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0;i< mat.length;i++){
            sum += mat[i][i];

            if(i!= n-i-1){
                sum+= mat[i][n-i-1];
            }
        }
        return sum;
    }
}
import java.util.Arrays;

public class Array_832 {
    public static void main(String[] args){
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    static public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] flippedInvert = new int[n][n];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                flippedInvert[i][n - 1 - j] = image[i][j];
                if (flippedInvert[i][n - 1 - j] == 1) {
                    flippedInvert[i][n - 1 - j] = 0;
                } else {
                    flippedInvert[i][n - 1 - j] = 1;
                }
            }
        }
        return flippedInvert;
    }
}

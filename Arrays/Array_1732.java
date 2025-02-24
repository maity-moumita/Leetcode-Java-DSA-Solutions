public class Array_1732 {
    public static void main(String[] args){
      int[] gain = {-5,1,5,0,-7};
      System.out.println(largestAltitude(gain));
    }
    static public int largestAltitude(int[] gain) {
        int Altitude = 0;
        int[] array = new int[gain.length + 1];
        array[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            array[i + 1] = array[i] + gain[i];
            if (array[i + 1] > Altitude) {
                Altitude = array[i + 1];
            }
        }
        return Altitude;
    }
}

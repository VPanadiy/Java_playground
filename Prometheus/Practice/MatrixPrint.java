package Others.Prometheus.Practice1;

/**
 * Created by Splayd on 25.02.2017.
 * *  2  3  4  *
 * 6  *  8  * 10
 * 11 12  * 14 15
 * 16  * 18  * 20
 * 22 23 24  *
 */
public class MatrixPrint {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = count++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            int startPos = 0;
            int endPos = array.length - 1;
            for (int j = 0; j < array.length; j++) {
                if (j == startPos + i) {
                    System.out.format("%2s ", "*");
                } else if (j == endPos - i) {
                    System.out.format("%2s ", "*");
                } else {
                    System.out.format("%2d ", array[i][j]);
                }
            }
            System.out.println();
        }
    }
}

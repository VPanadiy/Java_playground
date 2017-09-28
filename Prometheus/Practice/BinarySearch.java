package Others.Prometheus.Practice1;

/**
 * Created by Splayd on 25.02.2017.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int data[] = {3, 6, 7, 10, 10, 56, 60};
        int numberToFind = 10;

        boolean flag = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == numberToFind && !flag) {
                flag = true;
                System.out.println(i);
            }
        }

        if (!flag) {
            System.out.println(-1);
        }
    }
}

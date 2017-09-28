package Others.Prometheus.Practice1;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        for (int j = 0; j < length - 1; j++) {
            for (int i = 0; i < length - 1; i++) {
                int temporarry = array[i];
                if (temporarry > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temporarry;
                }
            }
        }
        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
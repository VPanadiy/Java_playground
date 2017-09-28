/**
 * Created by Vitaliy on 21.03.2017.
 */

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getNumber(50));
    }

    public long getNumber(int position) {
        if (position > 0 && position < 50) {
            if (position == 1)return 1;
            if (position == 2)return 1;
            return (getNumber(position - 1) + getNumber(position - 2));
        } else {
            return -1;
        }
    }
}
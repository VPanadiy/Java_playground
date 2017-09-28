package Others.Prometheus.Practice1;

public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double x1;
        double x2;

        if (discriminant > 0) {
            if (a == 0) {
                x1 = 0.0;
                x2 = 0.0;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        } else if (discriminant == 0) {
            if (a == 0) {
                System.out.println("x1=");
                System.out.println("x2=");
            } else {
                x1 = -(b / (2 * a));
                x2 = x1;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        } else if (discriminant < 0) {
            System.out.println("x1=");
            System.out.println("x2=");
        }
    }
}




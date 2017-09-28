package Others.JavaKids.TemperatureCalc;

/**
 * Created by Splayd on 28.11.2016.
 */
public class TemperatureCalc {
    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();
        System.out.println(temp.convertTemp(20, 'C'));
    }
}

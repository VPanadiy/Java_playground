package Others.JavaKids.TemperatureCalc;

import static java.lang.Math.abs;

/**
 * Created by Splayd on 28.11.2016.
 */
public class TemperatureConverter {
    public double temp;

    public String convertTemp(int temperature, char convertTo) {
        String ans;
        if (convertTo == 'F') {
            temp = (temperature - 32) / 1.8;
            int i = (int)temp;
            ans = "Температура равна " + i + " за Цельсием";
        } else if (convertTo == 'C') {
            temp = (temperature * 1.8) + 32;
            int i = (int)temp;
            ans = "Температура равна " + i + " за Фаренгейтом";
        } else {
            ans = "Температурный параметр не известен";
        }
        return ans;
    }


}

package Others.IdealWeight;

/************************************
 * Count weight by IMB. Formula:    *
 * IMB = weight / (height*height)   *
 * Created by Splayd on 03.12.2016. *
 ************************************/
public class CountKatlyOrIndexMassOfTheBody {

    public static String weightIMB(float weight, float height, int age, char gender) {
        String result;
        if (gender == 'M') {
            if (height <= 165) {
                weight = weight - (weight * 10 / 100);
            } else if (height >= 188) {
                weight = weight + (weight * 10 / 100);
            } else {
                weight = weight;
            }
        } else {
            if (height <= 154) {
                weight = weight - (weight * 10 / 100);
            } else if (height >= 174) {
                weight = weight + (weight * 10 / 100);
            } else {
                weight = weight;
            }
        }
        float IMB = weight / (height * height);
        if (age >= 18 && age <= 25) {
            if (IMB <= 17.5f) {
                result = "Insufficient, dangerous to health";
            } else if (IMB > 17.5f && IMB <= 19.5f) {
                result = "Slightly reduced, harmless to health";
            } else if (IMB > 19.5f && IMB <= 22.9f) {
                result = "Normal";
            } else if (IMB >= 23.0f && IMB <= 27.4f) {
                result = "Surplus";
            } else if (IMB >= 27.5f && IMB <= 29.9f) {
                result = "Obesity is 1 degree";
            } else if (IMB >= 30.0f && IMB <= 34.9f) {
                result = "Obesity grade 2";
            } else if (IMB >= 35.0f && IMB <= 39.9f) {
                result = "Obesity grade 3";
            } else if (IMB >= 40.0f) {
                result = "Obesity grade 4";
            } else {
                result = "Oops!!! I don`t know";
            }
        } else if (age >= 26 && age <= 46) {
            if (IMB <= 18.0f) {
                result = "Insufficient, dangerous to health";
            } else if (IMB > 18.0f && IMB <= 20.0f) {
                result = "Slightly reduced, harmless to health";
            } else if (IMB > 20.0f && IMB <= 25.9f) {
                result = "Normal";
            } else if (IMB >= 26.0f && IMB <= 27.9f) {
                result = "Surplus";
            } else if (IMB >= 28.0f && IMB <= 30.9f) {
                result = "Obesity is 1 degree";
            } else if (IMB >= 31.0f && IMB <= 35.9f) {
                result = "Obesity grade 2";
            } else if (IMB >= 36.0f && IMB <= 40.9f) {
                result = "Obesity grade 3";
            } else if (IMB >= 41.0f) {
                result = "Obesity grade 4";
            } else {
                result = "Oops!!! I don`t know";
            }
        } else {
            result = "Oops!!! I don`t know";
        }
        return result;
    }
}

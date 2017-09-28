package Others.IdealWeight;

/**********************************************
 * Weight count by Lowrance formula.          *
 * Formula for woman only!:                   *
 * weight = (height - 100) - (height - 150)/2 *
 * Created by Splayd on 03.12.2016.           *
 **********************************************/
public class DreamOLowrance {
    public static String weightLowrance(float height) {
        float weight;
        String result;
        if (height < 175) {
            weight = (height - 100) - (height - 150) / 2;
            result = String.valueOf(weight);
        } else {
            weight = (height - 100) - (height - 150) / 2;
            result = String.valueOf(weight) + ". But, it don`t suitable for you! ";
        }
        return result;
    }
}

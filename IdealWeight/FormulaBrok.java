package Others.IdealWeight;

/******************************************
 * Weight count by Brok Formula           *
 * Formula:                               *
 * For man = (height(in mm) - 100)* 1.15  *
 * For woman = (height(in mm) - 110)* 1.15*
 * Created by Splayd on 03.12.2016.       *
 ******************************************/
public class FormulaBrok {
    public static float weightBrok(float height, char genderBrok) {
        float weightBrok;
        float man = (height - 100) * 1.15f;
        float woman = (height - 110) * 1.15f;
        if (genderBrok == 'M') {
            // count weight for man
            weightBrok = man;
        } else {
            // count weight for woman
            weightBrok = woman;
        }
        return weightBrok;
    }
}

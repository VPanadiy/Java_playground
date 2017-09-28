package Others.IdealWeight;

/*****************************************
 * Weight base on IMB, but little modify.*
 * Formula:                              *
 * weight = Weight (grams) * height;     *
 * Created by Splayd on 03.12.2016.      *
 *****************************************/
public class IndexKatly {
    public static String weightKatly(float weight, float height, int age, String bodyType, char gender) {
        String result;
        float weightKatly = weight * 1000;
        float weightIndex = weightKatly / height;
        if (gender == 'M') {
            if (age >= 26 && age <= 39) {
                if (bodyType == "Largest") {
                    if (weightIndex < 390) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 430) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                } else if (bodyType == "Normal") {
                    if (weightIndex < 350) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 390) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                } else {
                    if (weightIndex < 340) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 350) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                }
            } else if (age > 40) {
                if (bodyType == "Largest") {
                    if (weightIndex < 390) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 450) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                } else if (bodyType == "Normal") {
                    if (weightIndex < 350) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 410) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                } else {
                    if (weightIndex < 340) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 370) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                }
            } else {
                result = "Oops!!! I don`t know";
            }

        } else {
            if (age >= 26 && age <= 39) {
                if (bodyType == "Largest") {
                    if (weightIndex < 380) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 420) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                } else if (bodyType == "Normal") {
                    if (weightIndex < 340) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 380) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                } else {
                    if (weightIndex < 330) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 340) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                }
            } else if (age > 40) {
                if (bodyType == "Largest") {
                    if (weightIndex < 380) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 440) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                } else if (bodyType == "Normal") {
                    if (weightIndex < 340) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 400) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                } else {
                    if (weightIndex < 330) {
                        result = "Your weight is too low to be your ideal!";
                    } else if (weightIndex > 360) {
                        result = "Your weight is too height to be your ideal!";
                    } else {
                        result = "Your weight is ideal!";
                    }
                }
            } else {
                result = "Oops!!! I don`t know";
            }
        }
        return result;
    }
}

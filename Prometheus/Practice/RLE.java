import java.util.Scanner;

/**
 * Created by Vitaliy on 22.03.2017.
 */
public class RLE {

    public static void main(String[] args) {
        RLE rle = new RLE();
        Scanner scanner = new Scanner(System.in);
        String input = "Hhhhhhhhhhhhhheeeellooooo";
        String input2 = "Hhhhhhhhhhhhhheeeellooooo";
        //String code = rle.rleParse(input);
        String decode = rle.rleUnParse(input);
        //System.out.println(code);
        System.out.println(decode);
        System.out.println(rle.compare(input2, decode));
    }

    public String rleParse(String input) {
        StringBuilder builder = new StringBuilder();

        if (input.equals("")) {
            return "";
        }


        String inputCount = input.concat("!");

        int count = 1;
        for (int i = 0; i < inputCount.length() - 1; i++) {
            if (inputCount.charAt(i) == inputCount.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    if (count > 9) {
                        do {
                            builder.append(inputCount.charAt(i));
                            builder.append("9");
                            count = count - 10;
                        } while (count > 10);

                        if (count != 0) {
                            builder.append(inputCount.charAt(i));
                            builder.append(Math.abs(count));
                        }

                        count = 1;
                    } else {
                        builder.append(inputCount.charAt(i)).append(count);
                        count = 1;
                    }
                } else {
                    builder.append(inputCount.charAt(i));
                }
            }
        }
        return builder.toString();
    }

    public String rleUnParse(String input) {
        StringBuilder builder = new StringBuilder();
        boolean flag;

        if (input.equals("")) {
            return "";
        }

        if (input.charAt(0) >= 48 && input.charAt(0) <= 57){
            return "";
        } else {
            builder.append(input.charAt(0));
            flag = true;
        }

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57){
                if (!flag){
                    return "";
                }
                int countDuplicate = input.charAt(i) - 48;
                for (int j = 0; j < countDuplicate - 1 ; j++) {
                    builder.append(input.charAt(i-1));
                }
                flag = false;
            } else {
                if (input.charAt(i) == input.charAt(i - 1)){
                    return "";
                }
                flag = true;
                builder.append(input.charAt(i));
            }
        }

        return builder.toString();
    }

    public String compare(String code, String decode) {
        if (code.equals(decode)) {
            return "Input before code and decode is equal!!!";
        } else {
            return "Input before code and decode is not equal!!!";
        }
    }
}

package Others.IdealWeight;

import java.util.InputMismatchException;
import java.util.Scanner;

/***********************************
 * Calculator of the ideal weight  *
 * Created by Splayd on 03.12.2016.*
 ***********************************/

public class IdealWeight {
    public static void main(String[] args) {
        TableOfEgorLevitsky tableOfEgorLevitsky = new TableOfEgorLevitsky();
        String bodyType;
        String command;
        float weight;
        float height;
        String result;
        float lowrance;


        final Scanner scan = new Scanner(System.in);
        System.out.println("Hello! This is calculator of ideal weight. You can calculate your weight by several formulas and compare your result for your best!");
        System.out.println("Now, give answer please, for some questions.");
        System.out.println("Enter your age: ");
        int age = 0;

/*        try {
            age = scan.nextInt();
        } catch ( InvalidIntException e){
            final ValidateIntArgumentException validateIntArgumentException = new ValidateIntArgumentException();
            validateIntArgumentException.ValidateAge(age);
        }*/


        System.out.println("Enter your height: ");
        height = scan.nextFloat();
        System.out.println("Enter your weight: ");
        weight = scan.nextFloat();

        System.out.println("Enter your body type (largest, normal or thin): ");
        scan.nextLine();

        bodyType = scan.nextLine();
        String bodyL = getCheckScan("largest", "L", bodyType, "Largest");
        String bodyN = getCheckScan("Normal", "N", bodyType, CONST.NORMAL);
        String bodyT = getCheckScan("thin", "T", bodyType, "Thin");

        if ("".equals(bodyL) && "".equals(bodyN) && "".equals(bodyT)) {
            System.out.format("Body type %s do not exist!", bodyType);
        }

//            if(bodyType.equalsIgnoreCase("largest") || bodyType.equalsIgnoreCase("L")){
//                bodyType = "Largest";
//            } else if(bodyType.equalsIgnoreCase(CONST.NORMAL) || bodyType.equalsIgnoreCase("N")){
//                bodyType = "Normal";
//            } else if(bodyType.equalsIgnoreCase("thin") || bodyType.equalsIgnoreCase("T")){
//                bodyType = "Thin";
//            } else {
//                System.out.format("Body type %s do not exist!", bodyType);
//                break bodyType;
//            }


        System.out.println("Enter your gender (male or female): ");
        String gender = scan.nextLine();
        String bodyMale = getCheckScan("Male", "M", gender, "Male");
        if ("Male".equals(bodyMale)) {
            System.out.println("Your ideal weight by Brok formula = " + FormulaBrok.weightBrok(height, 'M'));
            System.out.println("Your ideal weight by Table of Egor and Levitsky = " + tableOfEgorLevitsky.weightEgorLevitsky(height, age, 'M'));
            System.out.println("Result of index mass of the body is: Your weight is " + CountKatlyOrIndexMassOfTheBody.weightIMB(weight, height, age, 'M'));
            System.out.println("Result of index Katly: " + IndexKatly.weightKatly(weight, height, age, bodyType, 'M'));

            System.out.println("Would wou like to count your average ideal weight and see result? Enter yes or no: ");
            command = scan.nextLine();
            String bodyYes = getCheckScan("yes", "y", command, "Yes");
            if ("Yes".equals(bodyYes)) {
                System.out.println("Your average ideal weight = " + (FormulaBrok.weightBrok(height, 'M') + tableOfEgorLevitsky.weightEgorLevitsky(height, age, 'M')) / 2);
                System.out.println(IndexKatly.weightKatly(weight, height, age, bodyType, 'M') + " " + CountKatlyOrIndexMassOfTheBody.weightIMB(weight, height, age, 'M'));
            }

            String bodyNot = getUserIfEnterNo(command);

            getCommandDoNotExist(command, bodyYes, bodyNot);

        }
        String bodyFemale = getCheckScan("female", "f", gender, "Female");
        if ("Female".equals(bodyFemale)) {
            System.out.println("Your ideal weight by Brok formula = " + FormulaBrok.weightBrok(height, 'W'));
            System.out.println("Your ideal weight by Lowrance formula = " + DreamOLowrance.weightLowrance(height));
            // System.out.println("Your ideal weight by Table of Egor and Levitsky = " + tableOfEgorLevitsky.weightEgorLevitsky(height, age, 'W'));
            System.out.println("Result of index mass of the body is: Your weight is " + CountKatlyOrIndexMassOfTheBody.weightIMB(weight, height, age, 'W'));
            System.out.println("Result of index Katly: " + IndexKatly.weightKatly(weight, height, age, bodyType, 'W'));

            System.out.println("Would wou like to count your average ideal weight and see result? Enter yes or no: ");
            command = scan.nextLine();
            String bodyYes = getCheckScan("yes", "y", command, "Yes");
            if ("Yes".equals(bodyYes)) {
                System.out.println("Your average ideal weight = " + (FormulaBrok.weightBrok(height, 'W') + tableOfEgorLevitsky.weightEgorLevitsky(height, age, 'W')) / 2);
                result = DreamOLowrance.weightLowrance(height).substring(0, 4);
                lowrance = Integer.parseInt(result);
                System.out.println("With Lowrance: ");
                System.out.println("Your average ideal weight = " + (FormulaBrok.weightBrok(height, 'W') + lowrance) / 2);  //+ tableOfEgorLevitsky.weightEgorLevitsky(height, age, 'W'))
                System.out.println(IndexKatly.weightKatly(weight, height, age, bodyType, 'W') + " " + CountKatlyOrIndexMassOfTheBody.weightIMB(weight, height, age, 'W'));
            }

            String bodyNot = getUserIfEnterNo(command);
            getCommandDoNotExist(command, bodyYes, bodyNot);
        }

        if ("".equals(bodyFemale) && "".equals(bodyMale)) {
            System.out.println("Gender " + gender + " do not exist!");
        }

    }

    private static String getUserIfEnterNo(String command) {
        String bodyNot = getCheckScan("no", "n", command, "NO");
        if ("NO".equals(bodyNot)) {
            System.out.println("GoodBuy, and remember your ideal weight is what you think is it");
        }
        return bodyNot;
    }


    private static void getCommandDoNotExist(String command, String bodyYes, String bodyNot) {
        if ("".equals(bodyYes) && "".equals(bodyNot)) {
            System.out.println("Command " + command + " do not exist!");
        }
    }


    public static String getCheckScan(String maxString, String minString, String nameEquals, String bodyType) {
        String name = "";
        if (nameEquals.equalsIgnoreCase(maxString) || nameEquals.equalsIgnoreCase(minString)) {
            name = bodyType;
        }
        return name;
    }

}

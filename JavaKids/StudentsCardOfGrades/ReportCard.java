package Others.JavaKids.StudentsCardOfGrades;

/**
 * Created by Splayd on 28.11.2016.
 */
public class ReportCard {
    public static void main(String[] args) {
        char yourGrade = ConvertGrades(72);
        switch (yourGrade){
            case 'A':
                System.out.println("Great!");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Well");
                break;
            case 'D':
                System.out.println("Bad");
                break;
        }

    }

    public static char ConvertGrades(int testResult) {
        char grade;
        if (testResult >= 90){
            grade = 'A';
        } else if (testResult >=80 && testResult <90){
            grade = 'B';
        } else if (testResult >=70 && testResult <80){
            grade   = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }
}

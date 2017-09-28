package Others.JavaKids.StudentsCardOfGrades;

/**
 * Created by Splayd on 28.11.2016.
 */
public class StudentGrades {
    public static void main(String[] args) {
        ReportCard reportCard = new ReportCard();
        char yourGrade= reportCard.ConvertGrades(99);
        System.out.println("Your grade = " + yourGrade );
    }
}

package Others.IdealWeight;

/**
 * Created by Splayd on 04.12.2016.
 */
public class InvalidIntException extends Exception {
    private final int age;

    public InvalidIntException(final int age) {
        super("Invalid age entered: " + age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

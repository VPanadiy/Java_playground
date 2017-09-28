package Patterns.Commander;

/**
 * Created by Vitaliy on 27.03.2017.
 */
public class Exit implements Command {
    @Override
    public void execute() {
        System.out.println("Goodbye!");
    }
}

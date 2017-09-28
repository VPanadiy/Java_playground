package Patterns.Commander;

/**
 * Created by Vitaliy on 27.03.2017.
 */
public class Echo implements Command {
    String input;

    public Echo(String input) {
        this.input = input;
    }

    @Override
    public void execute() {
        System.out.println(input);
    }
}

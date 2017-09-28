package Patterns.Commander;

/**
 * Created by Vitaliy on 27.03.2017.
 */
public class Application {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Error");
        } else {
            switch (args[0]) {
                case "echo": {
                    if (args.length > 2 || args[1].equals("")) {
                        System.out.println("Error");
                    } else {
                        new Echo(args[1]).execute();
                    }
                    break;
                }
                case "date": {
                    if (args.length > 2 || !args[1].equals("now")) {
                        System.out.println("Error");
                    } else {
                        new DateNow().execute();
                    }
                    break;
                }
                case "help": {
                    if (args.length != 1) {
                        System.out.println("Error");
                    } else {
                        new Help().execute();
                    }
                    break;
                }
                case "exit": {
                    if (args.length != 1) {
                        System.out.println("Error");
                    } else {
                        new Exit().execute();
                    }
                    break;
                }
                default: {
                    System.out.println("Error");
                }
            }
        }
    }
}

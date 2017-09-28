package Others.IdealWeight;

import Others.IdealWeight.InvalidIntException;

public class ValidateIntArgumentException extends Exception{
    public static void ValidateAge(final int age) throws InvalidIntException {
        if (age < 0) {
            throw new InvalidIntException(age);
        }
    }
}

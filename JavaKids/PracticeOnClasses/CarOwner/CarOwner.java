package Others.JavaKids.PracticeOnClasses.CarOwner;

/**
 * Created by Vitaliy on 28.11.2016.
 */
public class CarOwner {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
        System.out.println("Я проехал " + myCar.drive(45) + " км!");

    }
}

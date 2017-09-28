package Others.JavaKids.PracticeOnClasses.FishMaster;

/**
 * Created by Splayd on 28.11.2016.
 */
public class Fish {
    public int currentDepth;

    public Fish(int currentDepth) {
        this.currentDepth = currentDepth;
    }

    public void setCurrentDepth(int currentDepth) {
        this.currentDepth = currentDepth;
    }

    public int getCurrentDepth() {
        return currentDepth;
    }

    public int dive(int howDeep){
        if (getCurrentDepth() > 100){
            System.out.println("Я не могу так  глубоко нырять!");
            currentDepth = currentDepth - howDeep;
            System.out.println("Я на глубине " + howDeep + " метров!");
        } else {
            System.out.println("Ныряю на глубину " + howDeep + " метров!");
            currentDepth = currentDepth+howDeep;
            System.out.println("Я на глубине " + howDeep + " метров!");
        }
        return currentDepth;
    }
}

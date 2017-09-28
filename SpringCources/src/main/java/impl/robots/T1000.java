package impl.robots;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import start.MyBeanLifeProcessor;

/**
 * Created by Splayd on 25.03.2017.
 */
public class T1000 implements Robot, InitializingBean, DisposableBean {

    private Hand hand;
    private Leg leg;
    private Head head;

    private String color;
    private int year;
    private boolean soundEnable;

    public T1000() {
    }

    public T1000(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public T1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnable) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public T1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public void action(){
        head.calc();
        leg.go();
        hand.catchSomething();
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Can play sound? " + soundEnable);
    }

    public void dance() {
        System.out.println("T1000 is dancing!!!");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    public void destroyObject(){
        System.out.println("Destroy");
    }

    public void initObject(){
        System.out.println("Init");
    }


    public void destroy() throws Exception {
        System.out.println(this + " method destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this + "method init()");
    }
}

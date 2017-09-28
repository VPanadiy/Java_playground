package start;

import impl.robots.T1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Splayd on 19.03.2017.
 */
public class RobotManager {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("all-application-context.xml");
        T1000 t1000 = (T1000) applicationContext.getBean("t1000Constructor");
        System.out.println(t1000.getHand());
        t1000 = (T1000) applicationContext.getBean("t1000Constructor");
        System.out.println(t1000.getHand());
        t1000.dance();
        t1000.action();
    }
}

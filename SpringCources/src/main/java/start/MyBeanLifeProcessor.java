package start;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Splayd on 25.03.2017.
 */
public class MyBeanLifeProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object object, String name) throws BeansException {

        return object;
    }

    public Object postProcessBeforeInitialization(Object object, String name) throws BeansException {
        System.out.println(object + " - postProcessBeforeInitialization()");
        return object;
    }
}

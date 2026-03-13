package post;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("post_pre.xml"));
//        Vehicle vehicle = (Vehicle) beanFactory.getBean("v_id");
        ApplicationContext context = new ClassPathXmlApplicationContext("post_pre.xml");
        Vehicle v1 = (Vehicle) context.getBean("v_id");
        System.out.println();


        ((AbstractApplicationContext) context).close();

    }
}

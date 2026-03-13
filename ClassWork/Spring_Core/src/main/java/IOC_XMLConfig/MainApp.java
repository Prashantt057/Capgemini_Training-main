package IOC_XMLConfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
        BeanFactory beanFactory1 = new XmlBeanFactory(new ClassPathResource("beans_Configuration.xml"));
        Sukhoi30MKI jet1 = (Sukhoi30MKI) beanFactory1.getBean("j1");
        System.out.println(jet1);

        BeanFactory beanFactory2 = new XmlBeanFactory(new ClassPathResource("beans_Configuration.xml"));
        Sukhoi30MKI jet2 = (Sukhoi30MKI) beanFactory2.getBean("j2");
        // we can use this when we have only one bean in our cofiguration file.
        System.out.println(jet2);
    }
}

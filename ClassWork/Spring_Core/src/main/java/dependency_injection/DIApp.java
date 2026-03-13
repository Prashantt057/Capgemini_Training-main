package dependency_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DIApp {
    public static void main(String[] args) {
//        BeanFactory beanFactory2 = new XmlBeanFactory(new ClassPathResource("list_Dependency.xml"));
//        Aadhar aadhar = (Aadhar) beanFactory2.getBean("a1");
        BeanFactory beanFactory1 = new XmlBeanFactory(new ClassPathResource("List_DI.xml"));
        Person1 person = (Person1) beanFactory1.getBean("P1");
        System.out.println(person);



    }
}

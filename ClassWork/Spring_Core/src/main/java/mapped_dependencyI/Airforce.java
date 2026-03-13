package mapped_dependencyI;

import IOC_XMLConfig.Sukhoi30MKI;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Airforce {
    public static void main(String[] args) {
        BeanFactory beanFactory1 = new XmlBeanFactory(new ClassPathResource("map_kit.xml"));
        kit kt = (kit) beanFactory1.getBean("kit_id");
        System.out.println(kt);
    }
}

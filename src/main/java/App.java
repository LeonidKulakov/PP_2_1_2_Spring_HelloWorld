import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        var bean = (HelloWorld) applicationContext.getBean("helloworld");
        var bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1 == bean);
        System.out.println(bean.getMessage());

        var bean2 = (Cat) applicationContext.getBean("cat");
        var bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean2 == bean3);
    }
}
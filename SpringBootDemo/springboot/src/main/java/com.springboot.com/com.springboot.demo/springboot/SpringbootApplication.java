import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootApplication.class, args);
        SpringComponent component = applicationContext.getBean(SpringComponent.class);
        System.out.println("Hello!");
    }

}
 
@Component
class SpringComponent {
    // Class implementation goes here
}

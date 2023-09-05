import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hakim.*"})
@EntityScan(basePackages = {"com.hakim.*"})
@EnableJpaRepositories(basePackages = {"com.hakim.*"})
public class MultiModuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiModuleApplication.class);
    }
}

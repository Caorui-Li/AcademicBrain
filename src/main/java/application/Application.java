package application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import model.User;
import org.springframework.context.annotation.Bean;
import repository.UserRepository;

@SpringBootApplication(scanBasePackages = {"application", "repository", "model"})
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "model")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner(UserRepository userRepository) {
        return args -> {
            User user = new User();
            user.setUserId("u001");
            user.setNickname("Alice");

            userRepository.save(user);
        };
    }
}
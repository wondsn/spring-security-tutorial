package hello.wondsn.springsecuritytutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringSecurityTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTutorialApplication.class, args);
	}

}

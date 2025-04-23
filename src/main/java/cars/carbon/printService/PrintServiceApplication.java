package cars.carbon.printService;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintServiceApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();
		// Setar manualmente no sistema para o Spring Boot conseguir acessar
		/*System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));*/


		SpringApplication.run(PrintServiceApplication.class, args);
	}
}

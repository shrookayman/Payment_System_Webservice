package payment_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = { "refunds", "users", "security", "payment"})
public class PaymentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentSystemApplication.class, args);
	}

}
package PG.PasswordGen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class PasswordGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordGenApplication.class, args);
		System.out.println();
	}

}

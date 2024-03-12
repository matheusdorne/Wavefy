package com.example.wavefy.wavefy;

import com.example.wavefy.wavefy.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WavefyApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WavefyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibeMenu();

	}
}

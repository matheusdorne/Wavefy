package com.example.wavefy.wavefy;

import com.example.wavefy.wavefy.principal.Principal;
import com.example.wavefy.wavefy.repository.ArtistaRepository;
import com.example.wavefy.wavefy.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WavefyApplication  implements CommandLineRunner {

	@Autowired
	private MusicaRepository musicaRepository;
	@Autowired
	private ArtistaRepository artistaRepository;

	public static void main(String[] args) {
		SpringApplication.run(WavefyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal(musicaRepository, artistaRepository);
		principal.exibeMenu();

	}
}

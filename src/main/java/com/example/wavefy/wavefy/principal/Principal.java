package com.example.wavefy.wavefy.principal;

import com.example.wavefy.wavefy.model.Artista;
import com.example.wavefy.wavefy.model.Musica;
import com.example.wavefy.wavefy.repository.ArtistaRepository;
import com.example.wavefy.wavefy.repository.MusicaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private MusicaRepository musicaRepository;

    private ArtistaRepository artistaRepository;

    private List<Artista> artistas = new ArrayList<>();

    public Principal(MusicaRepository musicaRepository, ArtistaRepository artistaRepository) {
        this.musicaRepository = musicaRepository;
        this.artistaRepository = artistaRepository;
    }


    public void exibeMenu() {
        var opcao = -1;

        while (opcao != 0) {
            var menu = """ 
                    Bem vindo ao Wavefy! 
                    1 - Cadastrar músicas
                    2 - Cadastrar artistas 
                    3 - Listar músicas 
                    4 - Listar músicas por artista 
                    5 - Pesquisar dado sobre um artista 
                            
                            
                    (0 - Sair) 
                            
                    Escolha sua opção: 
                       """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1 -> cadastrarMusicas();
                case 2 -> cadastrarArtistas();
                case 3 -> listarMusicas();
                case 4 -> listarMusicasPorArtista();
                case 5 -> pesquisarDadoArtista();
            }
        }
    }
    private  void listarArtistas() {
        artistas = artistaRepository.findAll();
        artistas.forEach(artista -> System.out.println("Nome: " + artista.getNome()));
    }
    private void cadastrarMusicas() {
        listarArtistas();
        System.out.println("Digite o nome do artista: ");
        var nomeArtista = leitura.nextLine();

        Optional<Artista> artistaOptional = artistaRepository.findByNomeContainingIgnoreCase(nomeArtista);

        if (artistaOptional.isPresent()) {
            System.out.println("Digite o nome da música: ");
            var nomeMusica = leitura.nextLine();
            System.out.println("Digite o nome do album:");
            var album = leitura.nextLine();
            System.out.println("Digite o genero: ");
            var genero = leitura.nextLine();
            var artista = artistaOptional.get();

            artista.getMusicas().add(new Musica(nomeMusica, genero, album, artista));

            musicaRepository.save(artista.getMusicas().get(artista.getMusicas().size() - 1));


        }

    }

    private void cadastrarArtistas() {
        System.out.println("Digite o nome do artista: ");
        var nomeArtista = leitura.nextLine();
        System.out.println("Digite o tipo do artista: ");
        var tipoArtista = leitura.nextLine();
        System.out.println("Digite o genero: ");
        var genero = leitura.nextLine();

        Artista artista = new Artista(nomeArtista, tipoArtista, genero);

        artistaRepository.save(artista);



        
    }

    private void listarMusicas() {
        
    }

    private void listarMusicasPorArtista() {
        
    }

    private void pesquisarDadoArtista() {
        
    }
}

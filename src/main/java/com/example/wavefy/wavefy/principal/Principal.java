package com.example.wavefy.wavefy.principal;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);


    public void exibeMenu() {
        var opcao = -1;

        while (opcao != 0) {
            var menu = """ 
                    Bem vindo ao Wavefy! 
                    1 - Buscar músicas
                    2 - Buscar artistas 
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
                case 1 -> buscarMusicas();
                case 2 -> buscarArtistas();
                case 3 -> listarMusicas();
                case 4 -> listarMusicasPorArtista();
                case 5 -> pesquisarDadoArtista();
            }
        }
    }

    private void buscarMusicas() {
    }

    private void buscarArtistas() {
        
    }

    private void listarMusicas() {
        
    }

    private void listarMusicasPorArtista() {
        
    }

    private void pesquisarDadoArtista() {
        
    }
}

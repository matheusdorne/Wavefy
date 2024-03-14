package com.example.wavefy.wavefy.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "musicas")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String album;

    private String genero;

    @ManyToOne
    private Artista artista;



    public Musica(String nome,  String genero, String album, Artista artista) {
        this.nome = nome;
        this.genero = genero;
        this.album = album;
        this.artista = artista;

    }

    public Musica() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

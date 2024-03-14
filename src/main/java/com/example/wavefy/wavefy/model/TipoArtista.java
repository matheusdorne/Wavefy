package com.example.wavefy.wavefy.model;

public enum TipoArtista {

    SOLO, BANDA, DUPLA, TRIO;

    public static TipoArtista fromString(String tipo) {
        for ( TipoArtista t : TipoArtista.values() ) {
            if ( t.toString().equalsIgnoreCase(tipo) ) {
                return t;
            }
        }

      throw new IllegalArgumentException("Nenhuma tipo encontrado para esse Artista");
    }
}

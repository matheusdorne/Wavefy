package com.example.wavefy.wavefy.service;

public interface IConverteDados {

    //<T> T = Significa genêrico
    <T> T obterDados(String json, Class <T> classe);
    // Devera ser passado na chamado do método o tipo de classe no qual ele vai retornar.
}

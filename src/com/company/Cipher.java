package com.company;

public interface Cipher {

    // Deszyfrowanie wiadomości
    String decode(final String message);

    //Szyfrowanie wiadomości
    String encode(final String message);
}

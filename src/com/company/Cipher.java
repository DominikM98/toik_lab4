package com.company;

interface Cipher {
    /** szyfrowanie wiadomosci */
    String encode(final String message);

    /** deszyfrowanie wiadomosci*/
    String decode(final String message);
}
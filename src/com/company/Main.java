package com.company;

public class Main {

    public static void main(String[] args) {
        Cipher atBashCipher = new AtBashCiper();

        // Encode: Zoz nz plgz
        System.out.println("Encode: " + atBashCipher.encode("Ala ma kota"));

        // Decode: Ala ma kota
        System.out.println("Decode: " + atBashCipher.decode("Zoz nz plgz"));
        System.out.println("d");
    }

}

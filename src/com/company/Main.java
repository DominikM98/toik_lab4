package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cipher atBashCipher = new AtBashCipher();

        //Encode
        System.out.println("Encode: "+atBashCipher.encode("Ala ma kota"));

        //Decode
        System.out.println("Decode: "+atBashCipher.decode("Zoz nz plgz"));
    }
}

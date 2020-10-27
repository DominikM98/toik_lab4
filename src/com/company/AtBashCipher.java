package com.company;

public class AtBashCipher implements Cipher{

    private final char[] plainText = {
            'a','A','b','B','c','C','d','D','e','E','f','F','g','G','h','H','i','I','j','J','k','K','l','L',
            'm','M','n','N','o','O','p','P','q','Q','r','R','s','S','t','T','u','U','v','V','w','W','x','X','y','Y','z','Z',' '
    };

    private final char[] cryptogram = {
            'z','Z','y','Y','x','X','w','W','v','V','u','U','t','T','s','S','r','R','q','Q','p','P','o','O',
            'n','N','m','M','l','L','k','K','j','J','i','I','h','H','g','G','f','F','e','E','d','D','c','C','b','B','a','A',' '
    };

    public String encode(String message){
        StringBuilder objectString = new StringBuilder();                //Nowy obiekt String Builder
        int index = 0;
        for(int i = 0; i < message.length();i++){
            char returnCharacter = message.charAt(i);                    //Zwracanie znaku przy określonym indeksie
            for (int j = 0; j < cryptogram.length;j++){
                if(cryptogram[j] == returnCharacter){
                    index = j;
                }
            }
            objectString.append(plainText[index]);                  //Dołączanie do ciagu
        }
        return objectString.toString();
    }

    public String decode(String message){
        StringBuilder objectString = new StringBuilder();                //Nowy obiekt String Builder
        int index = 0;
        for(int i = 0; i < message.length();i++){
            char returnCharacter = message.charAt(i);                    //Zwracanie znaku przy określonym indeksie
            for (int j = 0; j < plainText.length;j++){
                if(plainText[j] == returnCharacter){
                    index = j;
                }
            }
            objectString.append(cryptogram[index]);                  //Dołączanie do ciagu
        }
        return objectString.toString();
    }
}

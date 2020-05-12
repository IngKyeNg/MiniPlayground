package com.nik;

import java.util.Scanner;

public class InterpretSentence {

    public static void checkForVowelsAndConsonents(String sentence){
        char[] alphabets = sentence.toLowerCase().toCharArray();
        int v = 0;
        int c = 0;

        for(int i = 0; i < alphabets.length ; i++){
            if(alphabets[i] == 'a' || alphabets[i] == 'e' || alphabets[i] == 'i' ||
                    alphabets[i] == 'o' || alphabets[i] == 'u' || alphabets[i] == 'y'){
                v += 1;
            }else if(alphabets[i] >= 'a' && alphabets[i] <= 'z'){
                c += 1;
            }else{
                System.out.println("This charcter [" + alphabets[i] + "] is a special characters");
            }
        }

        System.out.println("The sentence above have \n" +
                "Vowels : " + v + "\n" +
                "Consonants : " + c);
    }

    public static void main(String[] args) {

        System.out.println("Enter some sentences and I will tell you how many vowels and consonants in there.");

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        checkForVowelsAndConsonents(sentence);

    }
}

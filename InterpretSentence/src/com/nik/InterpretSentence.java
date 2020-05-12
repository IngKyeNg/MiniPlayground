package com.nik;

import java.util.Scanner;

public class InterpretSentence {
    public static void main(String[] args) {

        System.out.println("Enter some sentences and I will tell you how many vowels and consonants in there.");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] alphabets = input.toLowerCase().toCharArray();
        int v = 0;
        int c = 0;

        for(int i = 0; i < alphabets.length ; i++){
            if(alphabets[i] == 'a' || alphabets[i] == 'e' || alphabets[i] == 'i' ||
                    alphabets[i] == 'o' || alphabets[i] == 'u' || alphabets[i] == 'y'){
                v += 1;
            } else if(alphabets[i] != ' '){
                c += 1;
            }
        }
        System.out.println("The sentence above have \n" +
                "Vowels : " + v + "\n" +
                "Consonants : " + c);

    }
}

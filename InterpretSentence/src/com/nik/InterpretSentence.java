package com.nik;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InterpretSentence {

    public static void checkForVowelsAndConsonents(String sentence){
        char[] alphabets = sentence.toLowerCase().toCharArray();
        int v = 0;
        int c = 0;
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for(int i = 0; i < alphabets.length ; i++){
            if(alphabets[i] == 'a' || alphabets[i] == 'e' || alphabets[i] == 'i' ||
                    alphabets[i] == 'o' || alphabets[i] == 'u' || alphabets[i] == 'y'){
                v += 1;
            }else if(alphabets[i] >= 'a' && alphabets[i] <= 'z'){
                c += 1;
            }else{
                if(hashMap.containsKey(alphabets[i])){
                    int tmp = hashMap.get(alphabets[i]) + 1;
                    hashMap.put(alphabets[i], tmp);
                }else{
                    hashMap.put(alphabets[i],1);
                }
            }
        }

        System.out.println("The sentence above have \n" +
                "Vowels : " + v + "\n" +
                "Consonants : " + c);
        hashMap.forEach((key, val) -> {
            System.out.println("Special character [" + key + "] has appear " + val + " times.");
        });
    }

    public static void reverseSentence(String sentence){
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println("The reverser of the sentence is : [" + sb.reverse().toString() + "].");
    }

    public static void main(String[] args) {

        System.out.println("Enter some sentences and I will tell you how many vowels and consonants in there.");

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        checkForVowelsAndConsonents(sentence);
        reverseSentence(sentence);
    }
}

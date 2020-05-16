package com.nik;

import java.util.Arrays;
import java.util.Scanner;

public class Candies {

    static long candies (int n, int[] a){
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for(int i=1; i<n; i++){
            if(a[i]>a[i-1]){
                candies[i]+=1;
            }
        }
        for(int j=n-2; j>=0; j--){
            if(a[j]>a[j+1]){
                candies[j] = Math.max(candies[j+1] + 1, candies[j]);
            }
        }

        long sum=0;
        for (int c:candies) {
            sum += c;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Please key in the number of students.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Please key in the rating for student " + i + ".");
            scanner = new Scanner(System.in);
            a[i] = scanner.nextInt();
        }

        scanner.close();

        long totalCandies = candies(n, a);
        System.out.println("The number of candies required is " + totalCandies);
    }
}

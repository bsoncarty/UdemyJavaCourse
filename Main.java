package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(24));
    }


    public static int getLargestPrime(int number) {
        int i;
        int copyOfNumber = number;
        if (number <= 1){
            return -1;
        }
        for (i = 2; i <= copyOfNumber; i++) {
            System.out.println("i = " + i);
            if (copyOfNumber % i == 0) {
                copyOfNumber /= i;
                System.out.println("copyOfNumber = " + copyOfNumber);
                i--;
            }
        }if (i < 2){
            return -1;
        }
        return i;
    }
}

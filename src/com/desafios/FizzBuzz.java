package com.desafios;
/*Você receberá um número onde:
        Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ;
        Se o número for apenas múltiplo de 3 -> "Fizz" ;
        Se o número for apenas múltiplo de 5 -> "Buzz";
        Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; */

import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int multiplo3 = num % 3;
        int multiplo5 = num % 5;

        boolean fizzBuzz = multiplo3 == 0 && multiplo5 == 0;
        boolean fizz = multiplo3 == 0;
        boolean buzz = multiplo5 == 0;

        if (fizzBuzz) {
            System.out.println("FizzBuzz");
        } else if (fizz) {
            System.out.println("Fizz");
        } else if (buzz) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

    }
}

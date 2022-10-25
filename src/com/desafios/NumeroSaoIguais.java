package com.desafios;

import java.util.*;

public class NumeroSaoIguais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        boolean numIguais = num1 == num2;

        String saoIguais = "Sao iguais!";
        String naoSaoIguais = "Nao sao iguais!";

        if(numIguais){
            System.out.println(saoIguais);
        } else {
            System.out.println(naoSaoIguais);
        }
        //TODO: Imprima se os valores numéricos passados são iguais ou não.

    }
}
package com.desafios;

import java.util.Scanner;

public class SomandoMultiplo {
    public static void main(String args[]) {
        // loop de 0 a 100, de 3 em 3.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int N = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i <= N; i+=A) {
            soma += i;
            // sempre vai ser múltiplo
        }
        System.out.println(soma);
    }
}
package com.desafios;

import java.util.*;

public class ChamadaRecursiva {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int numero;
        numero = number.nextInt();
        System.out.println(somatorio(numero));
        //TODO: Imprima o somatório de N (utilize o método "somatorio").
    }
    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
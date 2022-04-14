package Entrada;

import java.util.Scanner;

public class exercicio4{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um numero:");
        n = sc.nextInt();

        if (n >= 0) {
            System.out.println("Seu numero é positivo?");
        } else {
            System.out.println("Seu numero é negativo");
        }
    }
}
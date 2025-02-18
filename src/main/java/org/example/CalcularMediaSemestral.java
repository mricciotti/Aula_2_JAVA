package org.example;

import java.util.Scanner;

public class CalcularMediaSemestral {
    public static void main (String[]args ){
        Scanner scanner = new Scanner(System.in);
        //Obter o valor de PCC&F e GS do usuario
        System.out.print("Digite o valor de PCC&F: ");
        double pccf = scanner.nextDouble();

        System.out.printf("Digite o valor da GS: ");
        double gs= scanner.nextDouble();

        //Calculo de MS1
        double ms1 = (pccf * 0.4) + (gs * 0.6);

        //Exibe o resultado
        System.out.println("O valor de MS1 é de: " + ms1);

        //Fecha o scanner
        scanner.close();
    }
}

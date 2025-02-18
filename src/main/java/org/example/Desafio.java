package org.example;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Criar um objeto Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados: Notas e Trabalho
        System.out.print("Digite a Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do Trabalho: ");
        double trabalho = scanner.nextDouble();

        // Calcular a Média Semestral (MS)
        double ms = (nota1 * 0.4) + (nota2 * 0.4) + (trabalho * 0.2);

        // Exibir a Média Semestral
        System.out.println("A sua Média Semestral (MS) é: " + ms);

        // Verificar se o aluno foi aprovado ou se precisa de exame
        if (ms >= 7) {
            System.out.println("Aluno aprovado com a Média Semestral!");
        } else {
            System.out.println("Você precisa realizar o exame." );
            double me = (10 - ms) / 2;
            // Verificar se a Média do Exame é suficiente para aprovação
            if (me >= 5) {
                System.out.println("Aluno aprovado no exame!");}
            else {
                System.out.println("Aluno reprovado.");}
        }

        // Fechar o scanner
        scanner.close();
    }
}

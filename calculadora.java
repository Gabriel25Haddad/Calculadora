package Calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        System.out.println("Escolha a operação desejada: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                soma();
                break;
            case 2:
                subtracao();
                break;
            case 3:
                multiplicacao();
                break;
            case 4:
                divisao();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();
        
    }

    public static void soma() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        resultado = num1 + num2;
        System.out.println("O resultado da soma é: " + resultado);
        scanner.close();  
    }

    public static void subtracao() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        resultado = num1 - num2;
        System.out.println("O resultado da subtração é: " + resultado);
        scanner.close();  
    }

    public static void multiplicacao() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        resultado = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + resultado);
        scanner.close();  
    }   

    public static void divisao() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        float resultado;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        resultado = (float) num1 / num2;
        System.out.println("O resultado da divisão é: " + resultado);
        scanner.close();
    } 
    
}

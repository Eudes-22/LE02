import java.util.Scanner;

//13. Elabore um algoritmo que receba um número n e retorne um vetor com os n primeiros termos da sequência
//    de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,13, 21}

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de termos da sequência de Fibonacci
        System.out.println("Digite o número de termos da sequência de Fibonacci:");
        int n = scanner.nextInt();

        // Cria um vetor para armazenar os n primeiros termos da sequência de Fibonacci
        int[] fibonacci = new int[n];

        // Calcula a sequência de Fibonacci e armazena no vetor
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        // Exibe os n primeiros termos da sequência de Fibonacci
        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        scanner.close();
    }
}
    





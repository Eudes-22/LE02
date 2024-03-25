import java.util.Scanner;

//2. Escreva um algoritmo que leia em um vetor uma sequência finita de números digitados pelo usuário e, 
//   logo após, mostre o número de cada posição do vetor e seele é positivo, negativo ou zero.

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do vetor
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();

        // Cria o vetor com o tamanho especificado
        int[] vetor = new int[tamanho];

        // Lê os números digitados pelo usuário e armazena no vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o número da posição " + i + ":");
            vetor[i] = scanner.nextInt();
        }

        // Verifica se cada número no vetor é positivo, negativo ou zero e exibe a informação
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é negativo.");
            } else {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é zero.");
            }
        }

        scanner.close();
    }
}


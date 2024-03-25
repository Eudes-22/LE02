import java.util.Scanner;

//4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável de um número
//   n qualquer, depois mostre na tela o índice dos elementos quesão inferiores a n.

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do vetor
        int tamanho = 5;
        int[] vetor = new int[tamanho];

        // Lendo os números digitados pelo usuário e armazenando no vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = scanner.nextInt();
        }

        // Solicitando o número n
        System.out.println("Digite um número n:");
        int n = scanner.nextInt();

        // Exibindo os índices dos elementos que são inferiores a n
        System.out.println("Índices dos elementos que são inferiores a " + n + ":");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] < n) {
                System.out.println("Índice " + i);
            }
        }

        scanner.close();
    }
}
    







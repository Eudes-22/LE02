import java.util.Scanner;

//5. Elabore um programa que leia 5 números do teclado e os armazene em um vetor.Em seguida, leia um 
//   número n qualquer e apresente na tela a quantidade de vezesque o número n aparece no vetor.


public class Ex05 {
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

        // Lendo o número n
        System.out.println("Digite um número n:");
        int n = scanner.nextInt();

        // Contando a quantidade de vezes que o número n aparece no vetor
        int quantidade = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == n) {
                quantidade++;
            }
        }

        // Exibindo a quantidade de vezes que o número n aparece no vetor
        System.out.println("O número " + n + " aparece " + quantidade + " vezes no vetor.");

        scanner.close();
    }
}
    






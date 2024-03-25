import java.util.Scanner;

//12. Elabore um programa que leia um vetor de 12 elementos apresente na tela oproduto dos elementos pares 
//    positivos (desconsiderar o zero). 
//    Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840



public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do vetor
        int tamanho = 12;

        // Criando o vetor
        int[] vetor = new int[tamanho];

        // Lendo os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }

        // Calculando o produto dos elementos pares positivos
        int produto = 1;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) { // Verifica se o elemento é positivo e par
                produto *= vetor[i];
            }
        }

        // Exibindo o produto dos elementos pares positivos
        System.out.println("O produto dos elementos pares positivos é: " + produto);

        scanner.close();
    }
}
    





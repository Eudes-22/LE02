import java.util.Scanner;

//14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione o maior elemento na 
//    última posição do vetor. Nenhum número do vetor pode ser apagado ou duplicado. Apresente o vetor 
//    atualizado na tela.


public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do vetor
        int tamanho = 5;

        // Criando o vetor
        int[] vetor = new int[tamanho];

        // Lendo os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }

        // Encontrando o índice do maior elemento no vetor
        int indiceMaior = 0;
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        // Trocando o maior elemento para a última posição do vetor
        int temp = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[tamanho - 1];
        vetor[tamanho - 1] = temp;

        // Exibindo o vetor atualizado
        System.out.println("Vetor atualizado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
    





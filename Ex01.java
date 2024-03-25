import java.util.Scanner;

//1. Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, calcule 
//   a média e apresente na tela quais valores são menores, iguais ou superiores à média.

public class Ex01 {
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
    
            // Calculando a média
            double media = calcularMedia(vetor);
    
            // Exibindo os valores e sua relação com a média
            System.out.println("Valores e sua relação com a média:");
            for (int i = 0; i < tamanho; i++) {
                if (vetor[i] < media) {
                    System.out.println(vetor[i] + " é menor que a média");
                } else if (vetor[i] > media) {
                    System.out.println(vetor[i] + " é maior que a média");
                } else {
                    System.out.println(vetor[i] + " é igual à média");
                }
            }
    
            scanner.close();
        }
    
        // Método para calcular a média
        public static double calcularMedia(int[] vetor) {
            double soma = 0;
            for (int valor : vetor) {
                soma += valor;
            }
            return soma / vetor.length;
        }
    }

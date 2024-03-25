import java.util.Arrays;
import java.util.Scanner;

//7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se elessão iguais ou não. 
//   Para serem iguais, todos os elementos dos dois vetores devem coincidir.


public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho dos vetores
        int tamanho = 5;

        // Criando os vetores
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];

        // Lendo os elementos do primeiro vetor
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vetor1[i] = scanner.nextInt();
        }

        // Lendo os elementos do segundo vetor
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vetor2[i] = scanner.nextInt();
        }

        // Verificando se os vetores são iguais
        if (Arrays.equals(vetor1, vetor2)) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }

        scanner.close();
    }
}






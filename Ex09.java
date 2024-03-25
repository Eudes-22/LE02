import java.util.Arrays;
import java.util.Scanner;

//9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor Cde acordo com as 
//   seguintes regras:
//   a. Os elementos das posições pares de C são os elementos das posições pares de A;
//   b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;

public class Ex09 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho dos vetores
        int tamanho = 5;

        // Criando os vetores A, B e C
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho];

        // Lendo os elementos do vetor A
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vetorA[i] = scanner.nextInt();
        }

        // Lendo os elementos do vetor B
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vetorB[i] = scanner.nextInt();
        }

        // Preenchendo o vetor C com os elementos pares de A e os elementos ímpares de B
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) { // Posições pares
                vetorC[i] = vetorA[i];
            } else { // Posições ímpares
                vetorC[i] = vetorB[i];
            }
        }

        // Exibindo o vetor C
        System.out.println("Vetor C: " + Arrays.toString(vetorC));

        scanner.close();
    }
}
    






import java.util.Arrays;
import java.util.Scanner;

//10. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copieos elementos de A em B
//    de forma invertida. Ou seja, o primeiro elemento de A é oúltimo elemento de B, o segundo elemento de A é o 
//    penúltimo elemento de B, e assim por diante.


public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho dos vetores
        int tamanho = 5;

        // Criando os vetores A e B
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        // Lendo os elementos do vetor A
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vetorA[i] = scanner.nextInt();
        }

        // Copiando os elementos de A para B de forma invertida
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[tamanho - 1 - i];
        }

        // Exibindo os vetores A e B
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B (cópia invertida de A): " + Arrays.toString(vetorB));

        scanner.close();
    }
}
    




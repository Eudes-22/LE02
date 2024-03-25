import java.util.Arrays;
import java.util.Scanner;

//8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa aconcatenação de A e B, 
//   ou seja, C contém os elementos de A seguidos dos elementos de B.


public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho dos vetores
        int tamanho = 5;

        // Criando os vetores A, B e C
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho * 2]; // Vetor C terá o dobro do tamanho dos vetores A e B

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

        // Copiando os elementos do vetor A para o vetor C
        System.arraycopy(vetorA, 0, vetorC, 0, tamanho);

        // Copiando os elementos do vetor B para o vetor C
        System.arraycopy(vetorB, 0, vetorC, tamanho, tamanho);

        // Exibindo o vetor C (concatenação de A e B)
        System.out.println("Vetor C (concatenação de A e B): " + Arrays.toString(vetorC));

        scanner.close();
    }
}
    






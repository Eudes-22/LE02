import java.util.Scanner;

//11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de tamanho igual
//    a 5. Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +8*9 = 140



public class Ex11 {
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

        // Lendo os elementos do vetor B
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            vetorB[i] = scanner.nextInt();
        }

        // Calculando o produto escalar
        int produtoEscalar = 0;
        for (int i = 0; i < tamanho; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        // Exibindo o produto escalar
        System.out.println("O produto escalar entre os vetores A e B é: " + produtoEscalar);

        scanner.close();
    }
}



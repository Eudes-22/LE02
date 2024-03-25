import java.util.Scanner;

//15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de acordo com a seguinte 
//    regra: com exceção do 1º número, só é permitido armazenarum número se ele for maior que o anterior. 
//    Ex.: se o primeiro valor lido for 5, o próximo valor lido só poderá ser maior que 5.


public class Ex15 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do vetor
        int tamanho = 5;

        // Criando o vetor
        int[] vetor = new int[tamanho];

        // Lendo os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        vetor[0] = scanner.nextInt(); // Armazena o primeiro número diretamente no vetor
        int ultimoNumero = vetor[0]; // Guarda o último número lido

        for (int i = 1; i < tamanho; i++) {
            System.out.println("Digite o próximo número:");
            int numero = scanner.nextInt();
            
            if (numero > ultimoNumero) {
                vetor[i] = numero;
                ultimoNumero = numero;
            } else {
                System.out.println("Número inválido. Digite um número maior que " + ultimoNumero);
                i--; // Decrementa o índice para pedir o número novamente
            }
        }

        // Exibindo o vetor preenchido
        System.out.println("Vetor preenchido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}






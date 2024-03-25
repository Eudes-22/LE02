import java.util.Scanner;

//6. Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor com 5 pesos e calcule 
//   a média ponderada do aluno.Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3peso1 + peso2 
//   + peso3 Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho dos vetores
        int tamanho = 5;

        // Criando os vetores para armazenar as notas e os pesos
        double[] notas = new double[tamanho];
        double[] pesos = new double[tamanho];

        // Lendo as notas do aluno
        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        // Lendo os pesos correspondentes a cada nota
        System.out.println("Digite os 5 pesos correspondentes às notas:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Peso " + (i + 1) + ":");
            pesos[i] = scanner.nextDouble();
        }

        // Calculando a média ponderada
        double somaNotasPonderadas = 0;
        double somaPesos = 0;
        for (int i = 0; i < tamanho; i++) {
            somaNotasPonderadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaNotasPonderadas / somaPesos;

        // Exibindo a média ponderada
        System.out.println("A média ponderada do aluno é: " + mediaPonderada);

        scanner.close();
    }
}






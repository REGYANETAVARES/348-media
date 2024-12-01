package calculamediaatualizado;

import java.util.Scanner;

public class CalculaMediaAtualizado {
    public static void main(String[] args) {
        // Criação do vetor de alunos
        Aluno[] alunos = new Aluno[5];
        Scanner scanner = new Scanner(System.in);

        // Processo de entrada de dados dos alunos
        for (int i = 0; i < 5; i++) {
            alunos[i] = new Aluno();

            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            alunos[i].nome = scanner.nextLine();

            // Entrada da 1ª nota com validação
            alunos[i].nota1 = obterNota(scanner, alunos[i].nome, 1);

            // Entrada da 2ª nota com validação
            alunos[i].nota2 = obterNota(scanner, alunos[i].nome, 2);
        }

        // Exibição dos resultados finais
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nAluno " + (i + 1) + " - " + alunos[i].nome);
            System.out.println("Nota 1: " + alunos[i].nota1 +
                               "\tNota 2: " + alunos[i].nota2 +
                               "\tMédia: " + String.format("%.2f", alunos[i].calcularMedia())); // Formatação para 2 casas decimais
        }

        scanner.close();
    }

    // Método para validar e obter a nota
    public static float obterNota(Scanner scanner, String nomeAluno, int numeroNota) {
        float nota = -1;
        while (nota < 0 || nota > 10) {
            System.out.print("Digite a " + numeroNota + "ª nota de " + nomeAluno + ": ");
            try {
                String entrada = scanner.nextLine().replace(",", ".");
                nota = Float.parseFloat(entrada);
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        }
        return nota;
    }
}

class Aluno {
    // Atributos para armazenar nome e notas
    public String nome;
    public float nota1;
    public float nota2;

    // Método para calcular a média do aluno
    public float calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}

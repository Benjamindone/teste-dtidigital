import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma();

        System.out.println("Quantos alunos deseja cadastrar?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            Aluno aluno = lerAluno(sc);
            turma.adicionarAluno(aluno);

        }

        mostrarResultados(turma);

        sc.close();
    }

    public static Aluno lerAluno(Scanner sc) {

        System.out.println("\nNome do aluno:");
        String nome = sc.nextLine();

        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite a nota da disciplina " + (i + 1) + ":");
            notas[i] = sc.nextDouble();

            while (notas[i] < 0 || notas[i] > 10) {

                System.out.println("Nota inválida! Digite novamente:");
                notas[i] = sc.nextDouble();

            }

        }

        System.out.println("Digite a frequência (%):");
        double freq = sc.nextDouble();

        while (freq < 0 || freq > 100) {

            System.out.println("Frequência inválida! Digite novamente:");
            freq = sc.nextDouble();

        }

        sc.nextLine();

        return new Aluno(nome, notas, freq);
    }

    public static void mostrarResultados(Turma turma) {

        System.out.println("\n--- Resultados dos alunos ---");

        for (Aluno a : turma.alunos) {
            System.out.println(a);
        }

        System.out.println("\n--- Média da turma por disciplina ---");

        double[] medias = turma.mediaPorDisciplina();

        for (double m : medias) {
            System.out.printf("%.4f ", m);
        }

        System.out.println();

        double mediaTurma = turma.mediaDaTurma();

        System.out.println("\n--- Alunos acima da média da turma ---");

        boolean encontrou = false;

        for (Aluno a : turma.alunos) {

            if (a.calcularMedia() > mediaTurma) {
                System.out.println(a.nome);
                encontrou = true;
            }

        }

        if (!encontrou) {
            System.out.println();
        }

        System.out.println("\n--- Alunos com frequência abaixo de 75% ---");

        encontrou = false;

        for (Aluno a : turma.alunos) {

            if (a.frequencia < 75) {
                System.out.println(a.nome);
                encontrou = true;
            }

        }

        if (!encontrou) {
            System.out.println();
        }

    }

}
import java.util.ArrayList;

public class Turma {

    ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double[] mediaPorDisciplina() {

        double[] medias = new double[5];

        for (Aluno a : alunos) {

            for (int i = 0; i < 5; i++) {
                medias[i] += a.notas[i];
            }

        }

        for (int i = 0; i < 5; i++) {
            medias[i] = medias[i] / alunos.size();
        }

        return medias;
    }

    public double mediaDaTurma() {

        double soma = 0;

        for (Aluno a : alunos) {
            soma += a.calcularMedia();
        }

        return soma / alunos.size();
    }

}
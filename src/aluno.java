public class Aluno {

    String nome;
    double[] notas = new double[5];
    double frequencia;

    public Aluno(String nome, double[] notas, double frequencia) {
        this.nome = nome;
        this.notas = notas;
        this.frequencia = frequencia;
    }

    public double calcularMedia() {

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    @Override
    public String toString() {
        return String.format("%s %.4f %.2f%%",
                nome,
                calcularMedia(),
                frequencia);
    }

}
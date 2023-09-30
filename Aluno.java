public class Aluno {

    private String nome;
    private String curso;
    private Avaliacao avaliacao;

    public void Mensagem() {

        System.out.println("Nome: " + nome + "\n" + "Curso: " + curso + "\n" + "Media aritimética: "
                + avaliacao.MediaAritimetica() + "\n" + "Média ponderada: " + avaliacao.MediaPonderada());

    }

}

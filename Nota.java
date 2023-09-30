public class Nota {

    private double nota1;
    private double nota2;
    private int faltas;

    private final double MEDIA = 6.0; // Média criada para resultado

    public void RegistrarFalta() {
        faltas += 1;
    }

    public int GetFaltas() {
        return faltas;
    }

    public void SetNota1(double nota) {
        this.nota1 = nota;
    }

    public void SetNota2(double nota) {
        this.nota2 = nota;
    }

    public double GetNota1() {
        return nota1;
    }

    public double GetNota2() {
        return nota2;
    }

    public void Resultado() {

        double notaParcial = (nota1 + nota2) / 2;

        String resultado;

        if (nota1 < 3 || nota2 < 3) { // Regra criada para reprovação

            resultado = "REPROVADO";

        } else if (faltas > 7) {

            resultado = "REPROVADO POR FALTAS";

        } else if (notaParcial < MEDIA) {

            resultado = "RECUPERAÇÃO";
        } else {
            resultado = "APROVADO";
        }

        System.out.println("Nota 1: " + nota1 + "\n" + "Nota 2: " + nota2 + "\n" + "Nota Parcial: " + notaParcial + "\n"
                + "Resultado: " + resultado);

        if (resultado == "RECUPERAÇÃO") {
            // Regra criada: avaliacao vale 60% da nova nota
            System.out.println("Nota mínima da avaliacao para aprovação:" + (MEDIA - (0.4 * notaParcial)) / 0.6);
        }

    }
}

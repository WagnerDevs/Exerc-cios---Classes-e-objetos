public class Avaliacao {

    private float nota1;
    private float nota2;
    private float nota3;

    public float MediaAritimetica() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public float MediaPonderada() {
        return ((nota1 * 2) + (nota2 * 3) + (nota3 * 4)) / 9;
    }

}
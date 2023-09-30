public class Conta {

    private int numero;
    private String titular;
    private double saldo;
    private double limite;

    public boolean Sacar(double valor) {

        if ((saldo - valor) >= limite) {
            saldo -= valor;

            return true;
        }

        return false;

    }

    public boolean Depositar(double valor) {

        saldo += valor;

        return true;
    }

    public void Info() {
        System.out.println("Titular: " + titular + "\n" + "Número da conta: " + numero + "\n" + "Limite: " + limite
                + "\n" + "Saldo: " + saldo);
    }
}

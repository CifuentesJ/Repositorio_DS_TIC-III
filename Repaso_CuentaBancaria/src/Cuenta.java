public class Cuenta {
    private String numero, tipo = "";
    private double saldoActual = 0, saldoMinimo = 0, valorInicial = 0;

    public Cuenta(String numero, String tipo, double valorInicial) {
        this.numero = numero;
        if(tipo.equalsIgnoreCase("ahorro") || tipo.equalsIgnoreCase("credito")) {
            this.tipo = tipo;
            this.valorInicial = valorInicial;
            this.saldoActual = valorInicial;
            this.saldoMinimo = valorInicial * 0.1;
        }
    }


    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getValorInicial() {
        return valorInicial;
    }
    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
}
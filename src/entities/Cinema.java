package entities;

public class Cinema {
    private int numeroFileiras;
    private int cadeirasEmCadaFileira;
    private double valorIngresso;

    public Cinema(int numeroFileiras, int assentosEmCadaFileira) {
        this.numeroFileiras = numeroFileiras;
        this.cadeirasEmCadaFileira = assentosEmCadaFileira;
    }

    public int getNumeroFileiras() {
        return numeroFileiras;
    }

    public void setNumeroFileiras(int numeroFileiras) {
        this.numeroFileiras = numeroFileiras;
    }

    public int getCadeirasEmCadaFileira() {
        return cadeirasEmCadaFileira;
    }

    public void setCadeirasEmCadaFileira(int assentosEmCadaFileira) {
        this.cadeirasEmCadaFileira = assentosEmCadaFileira;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String cadeirasCinema() {
        if (this.cadeirasEmCadaFileira * this.numeroFileiras < 60) {
            this.valorIngresso = (this.cadeirasEmCadaFileira * this.numeroFileiras) * 10.0;
        }
        return "Resultado Total: R$" + this.valorIngresso;
    }
}

package entities;

public class Cinema {
    private int numeroFileiras;
    private int cadeirasPorFileira;
    private double valorIngresso;

    public Cinema(int numeroFileiras, int cadeirasPorFileira) {
        this.numeroFileiras = numeroFileiras;
        this.cadeirasPorFileira = cadeirasPorFileira;
    }

    public int getNumeroFileiras() {
        return numeroFileiras;
    }

    public void setNumeroFileiras(int numeroFileiras) {
        this.numeroFileiras = numeroFileiras;
    }

    public int getCadeirasPorFileira() {
        return cadeirasPorFileira;
    }

    public void setCadeirasPorFileira(int cadeirasPorFileira) {
        this.cadeirasPorFileira = cadeirasPorFileira;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String precoIngressosDoCinema() {
        int calculoLugares = this.cadeirasPorFileira * this.numeroFileiras;

        if (calculoLugares <= 60) {
            this.valorIngresso = calculoLugares * 10.0;
        } else if (this.numeroFileiras > 4 ) {
            int metadeFrente = this.numeroFileiras / 2;
            int metadePosterior = this.numeroFileiras - metadeFrente;

            this.valorIngresso = (double)(((metadeFrente * this.cadeirasPorFileira * 10) + (metadePosterior * cadeirasPorFileira * 8)));

        }
        return "Resultado Total: R$" + this.valorIngresso;
    }
}

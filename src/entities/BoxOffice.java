package entities;

public class BoxOffice {
    private int numeroFileiras;
    private int cadeirasPorFileira;
    private double valorIngresso;

    public BoxOffice(int numeroFileiras, int cadeirasPorFileira) {
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

    public void PrecoIngressoCinema() {
        int calculoLugares = this.cadeirasPorFileira * this.numeroFileiras;

        if (calculoLugares <= 60) {
            System.out.println("Ingresso: R$10");
        } else if (this.numeroFileiras > 4) {
            int metadeFrente = this.numeroFileiras / 2;
            int metadePosterior = this.numeroFileiras - metadeFrente;
            System.out.println("Ingressso: R$8");
        }

    }

}

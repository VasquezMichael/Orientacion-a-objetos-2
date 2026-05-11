package Patrones_de_diseño.productos_financieros;

public class CompraBonoAltoRiesgo extends ProductoFinanciero{

    private int parking;
    private double variacionMaxima = 0.70;

    public CompraBonoAltoRiesgo(int parking) {
        this.parking = parking;
    }

    @Override
    public double retornoInversion(double montoInicial) {
        return montoInicial + (montoInicial * this.variacionMaxima);
    }

}

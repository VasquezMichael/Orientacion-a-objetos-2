package Patrones_de_diseño.productos_financieros;

public class CompraBonoBajoRiesgo extends ProductoFinanciero{
    private int parking;
    private double variacionMaxima = 0.10;

    public CompraBonoBajoRiesgo(int parking) {
        this.parking = parking;
    }

    @Override
    public double retornoInversion(double montoInicial) {
        return montoInicial + (montoInicial * this.variacionMaxima);
    }
}

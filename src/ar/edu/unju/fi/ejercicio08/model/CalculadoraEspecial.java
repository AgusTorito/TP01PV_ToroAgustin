package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
	private int n;

    public CalculadoraEspecial() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double calcularSumatoria() {
        double sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k * (k + 1.0) / 2;
        }
        return sum;
    }

    public double calcularProductoria() {
        double product = 1;
        for (int k = 1; k <= n; k++) {
            product *= k * (k + 4.0);
        }
        return product;
    }
}

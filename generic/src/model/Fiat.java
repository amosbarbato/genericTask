package model;

public class Fiat extends Carro {
    public Fiat(String modelo, String marca, String cor, String potencia) {
        super(modelo, marca, cor, potencia);
    }

    @Override
    public String toString() {
        return "Cronos{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", potencia='" + potencia + '\'' +
                '}';
    }
}

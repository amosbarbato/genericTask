package model;

public class Jeep extends Carro {
    public Jeep(String modelo, String marca, String cor, String potencia) {
        super(modelo, marca, cor, potencia);
    }

    @Override
    public String toString() {
        return "model.Jeep{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", potencia='" + potencia + '\'' +
                '}';
    }
}

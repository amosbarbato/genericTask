package model;

public class Honda extends Carro {
    public Honda(String modelo, String marca, String cor, String potencia) {
        super(modelo, marca, cor, potencia);
    }

    @Override
    public String toString() {
        return "Civic{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", potencia='" + potencia + '\'' +
                '}';
    }
}

package model;

public abstract class Carro {
    String modelo;
    String marca;
    String cor;
    String potencia;

    public Carro(String modelo, String marca, String cor, String potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}

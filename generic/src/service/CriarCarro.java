package service;

import model.Carro;

public class CriarCarro {
    public static Carro criaCarro (String modelo, String marca, String cor, String potencia) {
        return new Carro (
                modelo,
                marca,
                potencia,
                cor
        ) {

        };
    }

}

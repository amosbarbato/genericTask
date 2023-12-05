import model.Fiat;
import model.Honda;
import model.Jeep;

import java.util.List;

public class App {
    public static void main(String[] args) {
        var civic = new Honda("Civic", "Honda", "Preto", "150HP");
        var cronos = new Fiat("Cronos", "Fiat", "Vermelho", "120HP");
        var renegade = new Jeep("Renegade", "Jeep", "Branco", "100HP");

        var carros = List.of(civic,cronos,renegade);
        carros.forEach(System.out::println);
    }
}

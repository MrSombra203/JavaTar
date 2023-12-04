import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Naranja");

        String segundaFruta = frutas.get(1);
        System.out.println(segundaFruta); // Imprime Platano;
        System.out.println(frutas.get(0));
    }
}
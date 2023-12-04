import java.util.ArrayList;
import java.util.Collection;

public class Colecciones {
    public static void main(String[] args) {
        Collection<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        String segundoNombre = ((ArrayList<String>) nombres).get(1);
        System.out.println(segundoNombre); // Imprime [Juan, María, Pedro]
    }
}


import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        int segundoNumero = numeros.get(1);
        System.out.println(segundoNumero); // Imprime 20
        System.out.println();
        System.out.println(numeros.get(2));
    }
}
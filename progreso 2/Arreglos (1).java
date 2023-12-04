import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length-1;

        productos[0] = "Kingstone pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generarión";
        productos[6] = "Bicicleta Oxford";

        //Arrays.sort(productos);
        System.out.println("----- Usando for sin ordenacion------");
        for (int i=0; i<= total; i++) {
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println("\n----- Usando for con ordenacion------");
        for (int i=0; i<= total; i++) {
            System.out.println("para el indice " + i + " : " + productos[i]);
        }


        System.out.println("\n----- Usando for con ordenacion------");
        for (int i = total -1; i >= 0; i--) {
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        System.out.println("\n----- Usando for con ordenacion------");
        for (int i = 6; i >= 0; i--) {
            System.out.println("para el indice " + i + " : " + productos[i]);
        }
    }
}

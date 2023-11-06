import java.util.Scanner;

public class ScreenIO {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal: ");

        int numeroDecimal= 0;

        try {
            numeroDecimal = scanner.nextInt();
        }

        catch (Exception e) {
            System.out.println("Numero ingresado incorrecto, ingrese numero decimal");
            //Vamos a hacer una recusividad con el main (volverle a llamar)
            main(args);
            System.exit(0);
        }

        //Transformacion del numero decimal a una cadena de caracteres
        String resulDecimal = "el numero decimal de " + numeroDecimal + " = " + Integer.toString(numeroDecimal);


        //Transformacion del numero decimal a binario
        String resulBinario = "el numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);


        //Transformacion del numero decimal a Octal
        String resulOctal = "el numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);


        //Transformacion del numero decimal a Hexadecimal
        String resulHexa = "el numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resulDecimal +"\n" ;
        mensaje += resulBinario + "\n";
        mensaje += resulOctal + "\n";
        mensaje += resulHexa + "\n";

        System.out.println(mensaje);

    }
}

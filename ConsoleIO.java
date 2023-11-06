
    import javax.swing.*;

    //Lectura y escritura de datos con consola
    public class ConsoleIO {
        public static void main(String[] args) {
            // la lecrua de un numero por consola
            String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero decimal: ");
            int numeroDecimal = 0;
            try {
                numeroDecimal = Integer.parseInt(numeroStr);
            }// catch (NumberFormatException e){
            catch (Exception e) {
                JOptionPane.showInputDialog(null, "Numero ingresado incorrecto, ingrese numero decimal");
                //recusividad
                main(args);
                System.exit(0);
            }

            //Transformacion del numero decimal a una cadena de caracteres
            String resulDecimal = "el numero decimal de " + numeroDecimal + " = " + Integer.toString(numeroDecimal);
            System.out.println(resulDecimal);

            //Transformacion del numero decimal a binario
            String resulBinario = "el numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            System.out.println(resulBinario);

            //Transformacion del numero decimal a Octal
            String resulOctal = "el numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            System.out.println(resulOctal);

            //Transformacion del numero decimal a Hexadecimal
            String resulHexa = "el numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            System.out.println(resulHexa);


            String mensaje = resulDecimal +"\n" ;
            mensaje += resulBinario + "\n";
            mensaje += resulOctal + "\n";
            mensaje += resulHexa + "\n";

            //desplege de contenido
            JOptionPane.showInputDialog(null, mensaje);

        }

    }



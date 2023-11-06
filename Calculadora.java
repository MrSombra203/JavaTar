import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {
        Float n1=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        Float n2=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero: "));

        float suma = n1 + n2;
        float resta = n1 -n2;
        float mult = n1*n2;
        float div = n1/n2;

        String resultSum = "La suma es de: " + suma;
        System.out.println(resultSum);

        String resultRest = "La suma es de: " + resta;
        System.out.println(resultRest);

        String resultMult = "La suma es de: " + mult;
        System.out.println(resultMult);

        String resultDiv = "La suma es de: " + div;
        System.out.println(resultDiv);

        String mensaje = resultSum + "\n";
        mensaje += resultRest + "\n";
        mensaje += resultMult + "\n";
        mensaje += resultDiv;

        JOptionPane.showInputDialog(null, mensaje);


    }

}

/*
Este Codigo fue creado por: Juan David Godoy
Codigo: 20192184043
 */
package prueballantas;
import javax.swing.JOptionPane;
public class Prueballantas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float primerPrecio = 100;
        float segundoPrecio = 75;
        float tercerPrecio = 50;
        int llantas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas llantas va a comprar?"));
        if (llantas < 5) {
            System.out.println("La cantidad de cada llanta con descuento es de" + primerPrecio + "USD");
            primerPrecio *= llantas;
            System.out.println("Usted pagara " + primerPrecio);
        } else if (llantas >= 5 && llantas <= 10) {
            System.out.println("La cantidad de cada llanta con descuento es de" + segundoPrecio + "USD");
            segundoPrecio *= llantas;
            System.out.println("Usted pagara " + segundoPrecio);
        } else {
            System.out.println("La cantidad de cada llanta con descuento es de" + tercerPrecio + "USD");
            tercerPrecio *= llantas;
            System.out.println("Usted pagara " + tercerPrecio);
        }
    }

}

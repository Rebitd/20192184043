/*
Este Codigo fue creado por: Juan David Godoy
Codigo: 20192184043
 */
package descuesto;
import java.util.Scanner;
public class Descuesto {

    public static void main(String[] args) {
        // TODO code application logic here
     Scanner teclado = new Scanner(System.in);
     int producto=0, valorporcentaje=0 ;
     System.out.println("Por favor no ingrese ni Puntos(.) ni Comas (,)");
     System.out.println("ingrese el valor del producto:");
     producto=teclado.nextInt();
     valorporcentaje=(producto*15)/100 ;
     producto=producto-valorporcentaje;
     System.out.println("El valor de su producto es de:"+producto);
    }
    
}

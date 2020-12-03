/*
Este Codigo fue creado por: Juan David Godoy
Codigo: 20192184043
 */
package manzanas;
import javax.swing.JOptionPane;
public class Manzanas {

    public static void main(String[] args) {
    float CantMan = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos kilos de manzanas va a llevar?"));
    if (CantMan>=0 && CantMan<=2){
       System.out.println("Usted va a pagar"+CantMan+"Kilos de manzanas");
       System.out.println("Usted no tendra descuento"); 
       }
       else if (CantMan>=2.01 && CantMan<=5){
       System.out.println("Usted va a pagar"+CantMan+"Kilos de manzana");
       System.out.println("Usted Tendra un descuento del 10%");
        }
       else if (CantMan>=5.01 && CantMan<=10){
        System.out.println("Usted va a pagar"+CantMan+"kilos de manzana");
        System.out.println("Usted Tendra un descuento del 15%");    
    }
        else {
        System.out.println("Usted va a pagar"+CantMan+"Kilos de manzana");
        System.out.println("Usted Tendra un descuento del 20%");
        }
    }
    
}

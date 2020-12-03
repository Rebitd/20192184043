/*
 1) En una fábrica de computadoras se planea ofrecer a los clientes un descuento
que dependerá del número de computadoras que compre. Si las computadoras son menos
de cinco se les dará un 10% de descuento sobre el total de la compra; si el número
de computadoras es mayor o igual a cinco pero menos de diez se le otorga un 20% de
descuento; y si son 10 o más se les da un 40% de descuento. El precio de cada computadora
es de U$500

Nombre:Juan David Godoy Hernandez
COD: 20192184043
 */
package ventapc;

import java.util.Scanner;
public class Ventapc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    int nc;
    double total, dto, pdto=0;
    System.out.print("Cuantos pc va a comprar:");
    nc=teclado.nextInt();
    if(nc<5){
        pdto=0.1;
    }
    else {
        if (nc<10) {
            pdto=0.2;
        }
        else  {
            pdto=0.4;
        }
    }
    dto=(nc*500)*pdto;
    
    System.out.println("Descuento :" +dto);
    
    total=(nc*500)-dto;
    
    System.out.println("Total: "+total);  
}
/* 
10.	Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
•	Si trabaja 40 horas o menos se le paga $5000 por hora
•	Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un aumento del 20% por cada hora extra.
Nombre:Juan David Godoy Hernandez
COD: 20192184043
*/
package trabajador;

import javax.swing.JOptionPane;


public class Trabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int salarioS, VH=5000 ;
     double aumento=0.2, salarioFI=0 ; 
     int horasT = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas trabajo en la semana?"));
     if (horasT<40){
         salarioS=horasT*VH ;
         System.out.println("Su salario semanal es de"+salarioS);
     }
     else {
         salarioS=horasT*VH ;
         salarioFI=aumento*salarioS ;
         System.out.println("Su salario de esta semana sera:"+salarioS);
     }
    }
    
}

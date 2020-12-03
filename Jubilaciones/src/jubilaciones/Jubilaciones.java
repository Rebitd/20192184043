
/*
8.El Seguro Social requiere clasificar a las personas que se jubilaran en el año
2004. Existen tres tipos de jubilaciones: por edad, por antigüedad joven y por 
antigüedad adulta. Las personas adscritas a la jubilación por edad deben tener 
60 años o más y una antigüedad en su empleo de menos de 25 años.Las personas
adscritas a la jubilación por antigüedad joven deben tener menos de 60 años y 
una antigüedad en su empleo de 25 años o más. Las personas adscritas a la jubilación
por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo de 25
años o más.
Nombre:Juan David Godoy Hernandez
COD:20192184043
*/
package jubilaciones;

import javax.swing.JOptionPane;

/**
 *
 * Juan David Godoy Hernandez -COD: 20192184043
 */
public class Jubilaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Edad, AnosT;
        Edad = Integer.parseInt(JOptionPane.showInputDialog("¿Que edad tiene?"));
        AnosT = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años ha trabajado para la empresa?"));
        if ((Edad >= 60) && (AnosT < 25)) {
            System.out.println("Usted puede jubilarse por edad");
        } else if ((Edad < 60) && (AnosT >= 25)) {
            System.out.println("Usted puede tener jubilacion por antiguedad joven");
        } else if ((Edad >= 60) && (AnosT > 25)) {
            System.out.println("Usted puede tener jubilacion por edad adulta");
        } else {
            System.out.println("Usted aun no se puede jubilar");
        }
    }
}

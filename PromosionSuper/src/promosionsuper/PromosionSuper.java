/*
12.Un supermercado realiza una tómbola con todos los clientes, si son hombres
tienen que sacar de una canasta una bolita la cual tiene un número grabado y si
son mujeres lo mismo pero de otra canasta, los premios se dan bajo la siguiente
tabla:	

	HOMBRES				MUJERES
	# Bolita		Premio		# bolita		Premio
	1		Desodorante		1		Loción
	2		Six-Pack de cerveza	2		Bikini
	3		Camiseta		3		Crema para la cara
	4		Pantaloneta		4		Plancha para el cabello
	5		Sudadera		5		Esmalte de uñas
.
Nombre:Juan David Godoy Hernandez.
COD: 20192184043
 */
package promosionsuper;

import javax.swing.JOptionPane;

public class PromosionSuper {

    public static void main(String[] args) {
        int sexo, Nbolita, opcion;
        sexo = Integer.parseInt(JOptionPane.showInputDialog("¿Eres Mujer (1) u Hombre(0)?"));
        if (sexo == 1) {
            Nbolita = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero saco?"));
            System.out.println("Usted saco el numero:" + Nbolita + "puede elejir cualquier premio de forma descendente");
            System.out.println("1 Locion.");
            System.out.println("2 Bikini.");
            System.out.println("3 Crema para la cara.");
            System.out.println("4 Plancha para el cabello.");
            System.out.println("5 Esmalte de uñas.");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion."));
            switch (opcion) {
                case 1:
                    System.out.println("Felicidades, usted ha reclamado una locion.");
                    break;
                case 2:
                    System.out.println("Felicidades, usted ha reclamado un Bikini");
                    break;
                case 3:
                    System.out.println("Felicidades, usted ha reclamado una Crema para la cara.");
                    break;
                case 4:
                    System.out.println("Felicidades, usted ha reclamado una Plancha para el pelo.");
                    break;
                case 5:
                    System.out.println("Felicidades, usted ha reclamado un Esmalte para uñas.");
                    break;
                default:
                    System.out.println("Numero no permitido");
                    break;

            }

        } else if (sexo == 0) {
            Nbolita = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas bolitas saco?"));
            System.out.println("Usted saco el numero:" + Nbolita + "puede elejir cualquier premio de forma descendente");
            System.out.println("1 Desodorante.");
            System.out.println("2 Six-pack cerveza.");
            System.out.println("3 Camiseta.");
            System.out.println("4 Pantaloneta.");
            System.out.println("5 Sudadera.");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion de forma desencente."));
            switch (opcion) {
                case 1:
                    System.out.println("Felicidades, usted ha reclamado un Desodorante.");
                    break;
                case 2:
                    System.out.println("Felicidades, usted ha reclamado una Six-pack de serveza.");
                    break;
                case 3:
                    System.out.println("Felicidades, usted ha reclamado una Camiseta.");
                    break;
                case 4:
                    System.out.println("Felicidades, usted ha reclamado una Pantaloneta.");
                    break;
                case 5:
                    System.out.println("Felicidades, usted ha reclamado una Sudadera.");
                    break;
                default:
                    System.out.println("Numero no permitido");
                    break;
            }

        } else {
            System.out.println("Numero incorrecto.");
        }
    }

}

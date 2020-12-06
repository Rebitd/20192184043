/*
13.Una empresa automotriz necesita un sistema para seleccionar el tipo de carro
(auto, SUV o camioneta) lo cual debe de aparecer en un menú, y el color
(negro, blanco o rojo) en otro menú. Al final se necesita que despliegue la
selección realizada. Nota. Debe de anidarse una estructura de selección múltiple
dentro de otra.
Nombre:Juan David Godoy Hernandez
COD:20192184043
 */
package carroswitch;

import javax.swing.JOptionPane;

public class CarroSwitch {

    public static void main(String[] args) {
        int opcion = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0;
        System.out.println("Buen dia querido cliente ¿que tipo de carro desea?");
        System.out.println("1. Un automovil");
        System.out.println("2. Una SUV");
        System.out.println("3. Una camioneta");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija un carro"));
        switch (opcion) {
            case 1:
                System.out.println("Buena eleccion, ¿que color quiere su automovil?");
                System.out.println("1. Negro");
                System.out.println("2. Blanco");
                System.out.println("3. Rojo");
                opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Elija un color"));
                switch (opcion2) {
                    case 1:
                        System.out.println("Usted elijio un Automovil color Negro");
                        break;
                    case 2:
                        System.out.println("Usted elijio un Automovil color Blanco");
                        break;
                    case 3:
                        System.out.println("Usted elijio un Automovil color Rojo");
                        break;
                    default:
                        System.out.println("Eleccion incorrecta");
                        break;

                }
                break;
            case 2:
                System.out.println("Buena eleccion, ¿que color quiere su SUV?");
                System.out.println("1. Negro");
                System.out.println("2. Blanco");
                System.out.println("3. Rojo");
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog("Elija un color"));
                switch (opcion3) {
                    case 1:
                        System.out.println("Usted elijio un SUV color Negro");
                        break;
                    case 2:
                        System.out.println("Usted elijio un SUV color Blanco");
                        break;
                    case 3:
                        System.out.println("Usted elijio un SUV color Rojo");
                        break;
                    default:
                        System.out.println("Eleccion incorrecta");
                        break;

                }
            case 3:
                System.out.println("Buena eleccion, ¿que color quiere su Camioneta?");
                System.out.println("1. Negro");
                System.out.println("2. Blanco");
                System.out.println("3. Rojo");
                opcion4 = Integer.parseInt(JOptionPane.showInputDialog("Elija un color"));
                switch (opcion4) {
                    case 1:
                        System.out.println("Usted elijio una Camioneta color Negro");
                        break;
                    case 2:
                        System.out.println("Usted elijio una Camioneta color Blanco");
                        break;
                    case 3:
                        System.out.println("Usted elijio una Camioneta color Rojo");
                        break;
                    default:
                        System.out.println("Eleccion incorrecta");
                        break;
                }
            default:
                        System.out.println("Eleccion incorrecta");
                        break;
        }
    }
}

/*
7.	Una institución educativa estableció un programa para estimular a los alumnos
con buen rendimiento académico y que consiste en lo siguiente:
	Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces
este podrá cursar 55 créditos y se le hará un 25% de descuento.
	Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de
tecnología, entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
	Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este
podrá cursar 50 créditos y no tendrá ningún descuento.
	Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el
alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.
	Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más
y el alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún descuento.
	Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces
podrá cursar 55 créditos y se le hará un 20% de descuento.
	Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá 
cursar 55 créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos
de profesional es de $30.000 por cada cinco créditos y para alumnos de tecnología es de 
$18.000 por cada cinco créditos.

Nombre: Juan David Godoy Hernandez
Codigo: 20192184043
 */
package colegio;

import javax.swing.JOptionPane;

public class Colegio {

    public static void main(String[] args) {
        int Precio = 0, Preciocre = 0, dto, MatF = 0, Creditos = 0;
        int profe = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su profesion? elija 1 si es profesional o 2 si es tecnologia"));
        double prom = Double.parseDouble(JOptionPane.showInputDialog("Digite su promedio"));
        if (profe == 2) {
            if (prom >= 9.5) {
                Creditos = Integer.parseInt(JOptionPane.showInputDialog("Usted puede cursar 55 creditos, elija cuantos creditos va a cursar y tendra un descuento del 25%"));
                Preciocre = Creditos / 5;
                Preciocre = Preciocre * 18000;
                dto = (int) (Preciocre * 0.25);
                dto = Preciocre - dto;
                System.out.println("Usted deberia pagar" + Preciocre + "y con descuento debe pagar" + dto);
            } else if ((prom >= 9) && (prom <= 9.5)) {
                Creditos = Integer.parseInt(JOptionPane.showInputDialog("Usted puede cursar 50 creditos, elija cuantos creditos va a cursar y tendra un descuento del 10%"));
                Preciocre = Creditos / 5;
                Preciocre = Preciocre * 18000;
                dto = (int) (Preciocre * 0.10);
                dto = Preciocre - dto;
                System.out.println("Usted deberia pagar" + Preciocre + "y con descuento debe pagar" + dto);
            } else if ((prom > 7) && (prom < 9)) {
                Creditos = Integer.parseInt(JOptionPane.showInputDialog("Usted puede cursar 50 creditos, elija cuantos creditos va a cursar y no tendra descuento"));
                Preciocre = Creditos / 5;
                Preciocre = Preciocre * 18000;
                System.out.println("Usted deberia pagar" + Preciocre);
            } else if ((prom <= 7) && (MatF >= 3)) {
                Creditos = Integer.parseInt(JOptionPane.showInputDialog("Usted puede cursar 45 creditos, elija cuantos creditos va a cursar y no tendra descuento"));
                Preciocre = Creditos / 5;
                Preciocre = Preciocre * 18000;
                System.out.println("Usted deberia pagar" + Preciocre);
            } else if ((prom < 7) && (MatF > 4)) {
                Creditos = Integer.parseInt(JOptionPane.showInputDialog("Usted puede cursar 40 creditos, elija cuantos creditos va a cursar y no tendra descuento"));
                Preciocre = Creditos / 5;
                Preciocre = Preciocre * 18000;
                System.out.println("Usted deberia pagar" + Preciocre);
            }
        }
        if (profe == 1) {
            if (prom >= 9.5) {
                Creditos = Integer.parseInt(JOptionPane.showInputDialog("Usted puede cursar 55 creditos, elija cuantos creditos va a cursar y tendra un descuento del 20%"));
                Preciocre = Creditos / 5;
                Preciocre = Preciocre * 18000;
                dto = (int) (Preciocre * 0.25);
                dto = Preciocre - dto;
                System.out.println("Usted deberia pagar" + Preciocre + "y con descuento debe pagar" + dto);
            } else {
                Creditos = Integer.parseInt(JOptionPane.showInputDialog("Usted puede cursar 55 creditos, elija cuantos creditos va a cursar y no tendra descuento"));
                Preciocre = Creditos / 5;
                Preciocre = Preciocre * 18000;
                System.out.println("Usted deberia pagar" + Preciocre);
            }
        }
    }

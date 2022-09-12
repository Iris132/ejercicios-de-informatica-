/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package iris_fernanda.periodo1ejercicio2;
import java.util.Scanner;
public class Periodo1ejercicio2 {
    public static void main(String[] args) {
        int plato, cantidad;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("ingreese 1 o 2 segun el plato que desea: ");
        plato = Entrada.nextInt();
        System.out.println("numero de ordenes: ");
        cantidad = Entrada.nextInt();
        double totalInicial = 0, descuento, totalFinal = 0, precioPlato1 = 5, precioPlato2 = 7;
        if (plato == 1){
            if (cantidad >= 1 & cantidad <= 5){
                descuento = 0.05;
                totalInicial = cantidad * precioPlato1;
                totalFinal = totalInicial - (totalInicial * descuento);
            }else if (cantidad >= 6 & cantidad <= 10) {
                totalInicial = cantidad * precioPlato1;
                descuento = 0.07;
                totalFinal = totalInicial - (totalInicial * descuento);
            }else if (cantidad >= 11) {
                totalInicial = cantidad * precioPlato1;
                descuento = 0.09;
                totalFinal = totalInicial - (totalInicial * descuento);
            }else{
                System.out.println("Cantidad equivocada");
            }
        }else if (plato == 2){
            if (cantidad >= 1 & cantidad <= 5){
                totalInicial = cantidad * precioPlato2;
                descuento = 0.06;
                totalFinal = totalInicial - (totalInicial * descuento);
            }else if (cantidad >= 6 & cantidad <= 10) {
                totalInicial = cantidad * precioPlato2;
                descuento = 0.09;
                totalFinal = totalInicial - (totalInicial * descuento);
            }else if (cantidad >= 11) {
                totalInicial = cantidad * precioPlato2;
                descuento = 0.12;
                totalFinal = totalInicial - (totalInicial * descuento);
            }else{
                System.out.println("Cantidad equivocada");
            }    
        }else{
            System.out.println("plato equivicado");
        }
        System.out.println("el menu es: " + plato);
        System.out.println("la cantidad es: " + cantidad);
        System.out.println("el total inicial es: " + totalInicial);
        System.out.println("el total final es: " + totalFinal);
    }
}

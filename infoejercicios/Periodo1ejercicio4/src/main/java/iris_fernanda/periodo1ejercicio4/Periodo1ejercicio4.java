/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package iris_fernanda.periodo1ejercicio4;
import java.util.Scanner;
public class Periodo1ejercicio4 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Ingrese la base: ");
        double base = Entrada.nextDouble();
        System.out.println("Ingrese el exponente: ");
        double exponente = Entrada.nextDouble();
        double resultado = Math.pow(base, exponente);
        System.out.println("el resultado es: " + resultado);
    }
}

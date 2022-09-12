/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package iris_fernanda.periodo1ejercicio3;
import java.util.Scanner;
public class Periodo1ejercicio3 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        int reglas;
        double nota;
        System.out.println("usted cumple las reglas de la universidad: ");
        System.out.println("Ingrese un numero: \n 1. siempre \n 2. aveces \n 3. nunca");
        reglas = Entrada.nextInt();
        System.out.println("que nota obtuvo en el laboratorio: ");
        nota = Entrada.nextDouble();
        if (reglas == 1){
            if (nota >= 8 & nota <= 10){
                nota = 10;
            }else{
                System.out.println("nota invalidad");
            }
        }else if (reglas == 2){
            if (nota < 6) {
                nota = nota + 0.5;
            }else if (nota >= 6 & nota <8){
                nota = nota + 0.7;
            }else{
                System.out.println("nota invalida");
            }
        }else{
            System.out.println("usted debe cumplir las reglas");
        }
        System.out.println("la nueva nota es: " + nota);
    }
}

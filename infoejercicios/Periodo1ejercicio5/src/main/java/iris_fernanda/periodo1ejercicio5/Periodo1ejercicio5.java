/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package iris_fernanda.periodo1ejercicio5;

/**
 *
 * @author edann
 */
public class Periodo1ejercicio5 {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n1=Entrada.nextInt();
        System.out.println("Ingrese un numero: ");
        n2=Entrada.nextInt();
        System.out.println("Ingrese un numero: ");
        n3=Entrada.nextInt();
        if((n1>n2)&&(n2>n3)){ 
            System.out.println("El orden es: " + n1 + n2 + n3);
            }
            else if((n1>n3)&&(n3>n2){
            System.out.println("El orden es: " + n1 + n3 + n2);
            else if((n2>n1)&&(n1>n3){
            }
            System.out.println("El orden es: " + n2 + n1 + n3);
            else if((n2>n3)&&(n3>n1){
            }
            System.out.println("El orden es: " + n2 + n3 + n1);
            else if((n3>n2)&&(n2>n1){
            }
            System.out.println("El orden es: " + n3 + n2 + n1);
            }
        else{
        System.out.println("El orden es: " + n3 + n1 + n2);    
        }
    }
}

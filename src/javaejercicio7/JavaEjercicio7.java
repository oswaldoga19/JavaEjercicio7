/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio7;

import java.util.Scanner;

public class JavaEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese el valor de A:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el valor de B:");
        int b = scanner.nextInt();

        // proceso
        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a == b) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;
import java.util.Scanner;

/**
 *
 * @author rjl01
 */

public class Lopez_Roberto_Tarea2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        while (true) {
            System.out.println("**** MENU ****");
            System.out.println("1. Diagonal");
            System.out.println("2. Piramide");
            System.out.println("3. Palindroma");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = lea.nextInt();
            lea.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una palabra: ");
                    String palabra = lea.nextLine();
                    int longitud = palabra.length();

                    for (int i = 0; i < longitud; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(palabra.charAt(i));
                    }

                    for (int i = longitud - 1; i > 0; i--) {
                        for (int j = 0; j < i - 1; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(palabra.charAt(i - 1));
                    }
                    break;

                case 2:
                    System.out.print("Introduce el numero de filas: ");
                    int filas = lea.nextInt();

                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = i + 1; j <= filas; j++) {
                            System.out.print(j);
                        }

                        for (int j = filas - 1; j > i; j--) {
                            System.out.print(j);
                        }

                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Introduce la cantidad de palabras: ");
                    int cantidad = lea.nextInt();
                    lea.nextLine(); 

                    String palindromos = "";
                    String noPalindromos = "";

                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Introduce la palabra #" + (i + 1) + ": ");
                        String palabraPalindroma = lea.nextLine();

                        boolean esPalindromo = true;
                        int inicio = 0;
                        int fin = palabraPalindroma.length() - 1;

                        while (inicio < fin) {
                            if (palabraPalindroma.charAt(inicio) != palabraPalindroma.charAt(fin)) {
                                esPalindromo = false;
                                break;
                            }
                            inicio++;
                            fin--;
                        }

                        if (esPalindromo) {
                            palindromos += (i + 1) + ". " + palabraPalindroma + "\n";
                        } else {
                            noPalindromos += (i + 1) + ". " + palabraPalindroma + "\n";
                        }
                    }

                    System.out.println("Palabras palindromas:");
                    System.out.println(palindromos);
                    System.out.println("Palabras no palindromas:");
                    System.out.println(noPalindromos);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    lea.close();
                    return;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
            System.out.println(); 
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea3;

import java.util.Scanner;

/**
 *
 * @author rjl01
 */
import java.util.Scanner;

public class Tarea3 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        double AreaMayor = 0;
        int trianguloMayor = 0;
        int opcion;

        System.out.println("**** Menu ****");
        System.out.println(" 1. Triangulos: ");
        System.out.println(" 2. MCM Y MCD: ");
        System.out.println(" 3. Numero perfecto: ");
        System.out.println(" Seleccione una opcion: ");
        opcion = lea.nextInt();

        try {
            if (opcion == 1) {
                int i = 1;

                while (i <= 8) {
                    try {
                        System.out.println("Ingrese la base del triangulo " + i + ": ");
                        double base = lea.nextDouble();
                        System.out.println("Ingrese la altura del triangulo " + i + ": ");
                        double altura = lea.nextDouble();

                        double area = (base * altura) / 2;

                        if (area > AreaMayor) {
                            AreaMayor = area;
                            trianguloMayor = i;
                        }
                        i++;

                    } catch (Exception e) {
                        System.out.println("Por favor ingrese datos válidos.");
                        lea.next();
                    }
                }
                System.out.println("El triángulo con el área mayor es: " + trianguloMayor + " con un área de: " + AreaMayor);

            } else if (opcion == 2) {
                try {
                    System.out.println("Ingrese el primer número: ");
                    int numero1 = lea.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    int numero2 = lea.nextInt();

                    int Valor1 = numero1;
                    int Valor2 = numero2;

                    while (Valor2 != 0) {
                        int temp = Valor2;
                        Valor2 = Valor1 % Valor2;
                        Valor1 = temp;
                    }
                    int MCD = Valor1;

                    int MCM = (numero1 * numero2) / MCD;
                    System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + MCD);
                    System.out.println("El MCM de " + numero1 + " y " + numero2 + " es: " + MCM);

                } catch (Exception e) {
                    System.out.println("Ingrese valores válidos.");
                    lea.next();
                }

            } else if (opcion == 3) {
                try {
                    System.out.println("Ingrese un número: ");
                    int numero = lea.nextInt();
                    int SumaD = 0;

                    for (int divisor = 1; divisor <= numero / 2; divisor++) {
                        if (numero % divisor == 0) {
                            SumaD += divisor;
                        }
                    }

                    if (SumaD == numero) {
                        System.out.println("El número " + numero + " es un número perfecto.");
                    } else {
                        System.out.println("El número " + numero + " no es un número perfecto.");
                    }

                } catch (Exception e) {
                    System.out.println("Ingrese valores numéricos válidos.");
                    lea.next();
                }

            } else {
                System.out.println("Opción no válida.");
            }

        } catch (Exception e) {
        } finally {
            lea.close();
        }
    }
}

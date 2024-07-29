/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASE2;
import java.util.Scanner;
/**
 *
 * @author rjl01
 */
public class Lopez_Roberto_Tarea1 {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        
        /*
        Un operador ternario en java es una de las formas para poder expresar 
        de manera concisa una condicion. 
        */
        
        // uso de valor constante
        
        System.out.print("Ingrese un numero entero: ");
        int numero = lea.nextInt();
        String resultadoConstante = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El numero es: " + resultadoConstante);
        
        //uso con variable 
         System.out.print("Ingrese su edad: ");
        int edad = lea.nextInt();
        String resultadoVariable = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Usted es: " + resultadoVariable);
        
        //uso con las formulas 
         System.out.print("Ingrese la calificacion (0-100): ");
        int calificacion = lea.nextInt();
        String resultadoFormula = (calificacion >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Su resultado es: " + resultadoFormula);
    }
    }

    


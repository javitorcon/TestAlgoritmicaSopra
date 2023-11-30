package Ejercicio1;

import java.util.Scanner;

public class MostrarDescendentesParesOImpares {
    public static void main(String[] args) {
        //Leemos el número entero
        int numero = leerNumero();
        //Comprobamos si es par o impar
        if(numero % 2 ==0 ){//Si es par
            System.out.println(numero + " es un número par. Te muestro los pares descendientes desde "+ numero + " hasta el 0");

            for(int i = numero; i>=0; i= i-2 ){
                System.out.println(i + "");
            }

        }else{//Si es impar
            System.out.println(numero + " es un número impar. Te muestro los impar descendientes desde "+ numero + " hasta el 1");
            
            for(int i = numero; i>=1; i=i-2){
                System.out.println(i + "");
            }

        }

    }
    public static int leerNumero(){ 
        Scanner scanner = new Scanner(System.in);
            while(true){
            //Manejo de excepciones por si el usuario no introduce un valor correcto.
            //El programa acaba cuando se introduce el número correctamente
            try{
                System.out.println("Introduzca un número entero: ");
                return scanner.nextInt();
        }catch (java.util.InputMismatchException e){
                System.out.println("Debe introducir un número entero");
                scanner.nextLine();
        }
    }
    
}
}

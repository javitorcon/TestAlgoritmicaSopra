package Ejercicio3;

import java.util.Scanner;

public class CalculoSalarioTrabajador {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nota: Se han asumido que tanto las horas trabajadas como la tarifa del trabajador podrían ser números no enteros.
        double horasTrabajadas=leerHorasTrabajadas(scanner);
        double tarifa=leerTarifa(scanner);
        scanner.close();
        double salario = calcularSalario(horasTrabajadas, tarifa);
        System.out.println("El salario del trabajador es de " + salario + " euros.");
        
    }
    public static double leerHorasTrabajadas(Scanner scanner){
        System.out.println("Introduce las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        return horasTrabajadas;
     

    }
    public static double leerTarifa(Scanner scanner){
        System.out.println("Introduce la tarifa del trabajador: ");
        double tarifa = scanner.nextDouble();
        return tarifa;

    }
    public static double calcularSalario(double horasTrabajadas, double tarifa ){
        double horasExtras = 0;
        if(horasTrabajadas>40)  {
            horasExtras = horasTrabajadas-40;

        }
        double tarifaIncrementada = tarifa * 1.5;
        double sueldoTotal = (horasTrabajadas * tarifa) + (horasExtras * tarifaIncrementada);
        return sueldoTotal;
    }
}

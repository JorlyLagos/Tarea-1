import java.util.Scanner;

public class OperacionesAritmeticas {

  
    public static void main(String[] args) {
    // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números enteros
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        int num1 = scanner.nextInt();
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        int num2 = scanner.nextInt();

        // Realizar las operaciones aritméticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo); 
        
        
    }
    
}

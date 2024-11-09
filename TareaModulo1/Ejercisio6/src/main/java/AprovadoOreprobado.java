import java.util.Scanner;

public class AprovadoOreprobado {


   
    public static void main(String[] args) {
         Scanner lectura = new Scanner(System.in);
        String Resultado, Nombre;
        int Nota;
        
        
        System.out.print("Escriba el Nombre del estudiante: ");
        Nombre = lectura.nextLine();

        System.out.print("Digite Su Nota: ");
        Nota = lectura.nextInt();

        
        if (Nota >= 70) {
            Resultado = "Esta Aprobado";
        } else {
            Resultado = "Esta Reprobado";
        }

        System.out.println(" Estudiante: " + Nombre + " " + Nota + "% " + Resultado);

        lectura.close();
    }
    }
    



public class DarosdeCompañeros {

 
    public static void main(String[] args) {
   
        String[][] compañeros = {
            {"Frandy", "Ávila", "Ing. Computacion", " Lotelhsa"},
            {"JESUS ", "MONTUFAR", "Ing. Computacion", "fabricación de arnes"},
            {"Jorly", "Lagos", "Ing. Computacion", "oficina"},
            {"Zandry", "Aguilar", "Ing. Computacion", "Hotel"},
            {" ELEAZAR ", " RUIZ", "contaduria financiera", " Odef Financiera"}
        };
        
        // Recorrer e imprimir el arreglo en formato vertical
        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Nombre: " + compañeros[i][0]);
            System.out.println("Apellido: " + compañeros[i][1]);
            System.out.println("Carrera: " + compañeros[i][2]);
            System.out.println("Trabajo: " + compañeros[i][3]);
            System.out.println("----------------------------");
        }
    }
    
}


public class Nombrescompa {


    public static void main(String[] args) {
              String[] Nombres = new String[10];

        Nombres[0] = "WILMER ALEXANDER GARCIA ENAMORADO";
        Nombres[1] = "SOANY IVETH SANDOVAL CRUZ";
        Nombres[2] = "SAMUEL ABDIEL IRIARTE ULLOA";
        Nombres[3] = "JOCELYN IDALIA RODAS BOQUIN";
        Nombres[4] = "ROBERTO PONCE DIAZ DEL VALLE";
        Nombres[5] = "ROBERTH JOEL LAGOS SANCHEZ";
        Nombres[6] = "YEINCON NOE OVIEDO ALVARADO";
        Nombres[7] = "GLENDA YADIRA ORELLANA VALENTIN";
        Nombres[8] = "IRENYA ANNARELLA FORTIN BURLERO";
        Nombres[9] = "KEVIN MARTIN REYES VALLECILLO";

       
        System.out.println("COMPAÑEROS DE CLASE:");
        for (int i = 0; i < Nombres.length; i++) {
            System.out.println((i + 1) + ". " + Nombres[i]);
    }
    }
}

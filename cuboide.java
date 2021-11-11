import java.util.*;

public class cuboide {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        
        int longitud,altura,profundidad,area,volumen;
        
        

        System.out.println("===============================================================================");
        System.out.println("Programa para calcular el area y volumen de un cuboide");
        System.out.println("===============================================================================");

        System.out.print("Longitud: ");
        longitud = sc.nextInt();

        System.out.print("Altura: ");
        altura = sc.nextInt();

        System.out.print("Profundidad: ");
        profundidad = sc.nextInt();

        sc.close();

        
        area = (2 * longitud * altura) + (2 * profundidad * altura) + (2 * longitud * profundidad);
        volumen = longitud * altura * profundidad;

        System.out.println("Area = " + area);
        System.out.println("Volumen = " + volumen);

        System.out.println("===============================================================================");
    }

}

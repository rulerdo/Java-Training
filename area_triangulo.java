import java.util.*;

public class area_triangulo {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        
        float b,h,s,x,y,z;
        double area;
        

        System.out.println("===============================================================================");
        System.out.println("Esta formula calcula el area de un triangulo con la base y altura");
        System.out.println("Formula: Area = ( b * h ) / 2");
        System.out.println("===============================================================================");

        System.out.print("Escribe la base: ");
        b = sc.nextFloat();

        System.out.print("Escribe la altura: ");
        h = sc.nextFloat();

        area = (b * h)/2;

        System.out.println("b: " + b);
        System.out.println("h: " + h);
        System.out.println("Area: ( " + b + " * " + h + " ) / 2 = " + area);

        System.out.println("===============================================================================");
        System.out.println("Esta formula calcula el area de un triangulo con los 3 lados");
        System.out.println("Formula: s = (x + y + z) / 2 ; Area = Raiz de (s * (s-x) * (s - y) * s - z) ");
        System.out.println("===============================================================================");

        System.out.print("Escribe el lado 1: ");
        x = sc.nextFloat();

        System.out.print("Escribe el lado 2: ");
        y = sc.nextFloat();

        System.out.print("Escribe el lado 3: ");
        z = sc.nextFloat();

        sc.close();

        s = (x + y + z) / 2f;

        area = Math.sqrt(s*(s-x)*(s-y)*(s-z));

        System.out.println("Area: " + area);
        System.out.println("===============================================================================");
    }

}

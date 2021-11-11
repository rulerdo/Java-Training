import java.util.*;

public class chicharronera {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        
        int a,b,c;
        double x,x_;
        

        System.out.println("===============================================================================");
        System.out.println("Script para resolver una ecuacion de segundo grado usando la formula general");
        System.out.println("===============================================================================");

        System.out.print("Valor de 'a' (Coeficiente en X^2): ");
        a = sc.nextInt();

        System.out.print("Valor de 'b' (Coeficiente en X^1): ");
        b = sc.nextInt();

        System.out.print("Valor de 'c' (Coeficiente en X^0): ");
        c = sc.nextInt();

        sc.close();

        
        x = ((-b) + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        x_ = ((-b) - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.println("X1 = " + x);
        System.out.println("X2 = " + x_);

        System.out.println("===============================================================================");
    }

}

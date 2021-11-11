import java.util.*;

public class Bienvenida {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Cual es tu nombre? ");
        name = sc.nextLine();
        sc.close();
        System.out.println("Bienvenido " + name);
    } 

}

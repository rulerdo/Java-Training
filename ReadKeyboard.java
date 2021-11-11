import java.util.*;

class ReadKeyboard 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int x,y,z;

        System.out.println("Dame dos numeros: ");

        x=sc.nextInt();

        y=sc.nextInt();

        sc.close();

        z= x + y;

        System.out.println("La suma es: " + z);
    }
}
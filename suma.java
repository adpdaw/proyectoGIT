import java.util.Scanner;
// Programa suma
public class suma
{
    public static void main(String[] args)
    {
        int  n1, n2, resultado;

        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Introduce el primer numero: ");
        n1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        n2 = teclado.nextInt();
        resultado = n1 + n2;javac suma.java

        System.out.println( "La suma de " + n1 + " mas " + n2 +  " es " + resultado + "." );
    }
}
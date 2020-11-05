import java.util.Scanner;

public class Aritmeticas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2;
        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextDouble();
        teclado.nextLine();
        System.out.println(numero1 + " + "+ numero2 + " = "+ (numero1+numero2));
        System.out.println(numero1 + " - "+ numero2 + " = "+ (numero1-numero2));
        System.out.println(numero1 + " x "+ numero2 + " = "+ (numero1*numero2));
        System.out.println(numero1 + " / "+ numero2 + " = "+ (numero1/numero2));
    }
} 


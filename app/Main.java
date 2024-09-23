package app;
import java.util.Scanner;
import util.Fraction;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print( "Veuillez saisir un numerateur : " );
            int a = scanner.nextInt();

            System.out.print( "Veuillez saisir un denominateur : " );
            int b = scanner.nextInt();
            
            Fraction f1 = new Fraction(a, b);
            System.out.printf("La fraction est " + f1 + "\n");

            Fraction f2 = new Fraction(0, 1);
            System.out.printf("La fraction est " + f2 + "\n");

            Fraction f3 = new Fraction();
            System.out.printf("La fraction est " + f3 + "\n");

            System.out.printf("Voici ZERO : " + Fraction.ZERO + " et UN : " + Fraction.UN + "\n");
        }
    }
}
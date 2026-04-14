import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Elige operación: 3 = Multiplicar | 4 = Dividir");
        int opcion = sc.nextInt();

        if (opcion == 3) {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (opcion == 4) {
            if (num2 == 0) {
                System.out.println("Error: no se puede dividir entre 0");
            } else {
                System.out.println("Resultado: " + (num1 / num2));
            }

        System.out.println("Elige operación: 1 = Sumar | 2 = Restar");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (opcion == 2) {
            System.out.println("Resultado: " + (num1 - num2));          
        } else {
            System.out.println("Opción no válida");
        }

        sc.close();
    }
}
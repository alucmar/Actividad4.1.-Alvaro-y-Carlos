import java.util.Scanner;

public class Calculadora {

    public static double operar(double num1, double num2, int opcion) {

        switch (opcion) {

            case 1:
                return num1 + num2;

            case 2:
                return num1 - num2;

            case 3:
                return num1 * num2;

            case 4:
                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir entre 0");
                }
                return num1 / num2;

            default:
                throw new IllegalArgumentException("Opción no válida");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Elige operación:");
        System.out.println("1 = Sumar");
        System.out.println("2 = Restar");
        System.out.println("3 = Multiplicar");
        System.out.println("4 = Dividir");

        int opcion = sc.nextInt();

        try {
            double resultado = operar(num1, num2, opcion);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

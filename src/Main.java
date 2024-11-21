import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Boolean continuar = true;
        System.out.println("Bienvenido a la calculadora");
        System.out.println("---------------------------");

        while (continuar) {
            System.out.println("---------------------------");
            System.out.println("Que operacion desea realizar ");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. raiz cuadrada");
            System.out.println("6. salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    double number1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    double number2 = scanner.nextDouble();

                    System.out.println("El resultado es: " + suma(number1, number2) + "\\n");
                    break;

                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    number1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    number2 = scanner.nextDouble();

                    System.out.println("El resultado es: " + resta(number1, number2));
                    break;

                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    number1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    number2 = scanner.nextDouble();

                    System.out.println("El resultado es: " + multiplicacion(number1, number2));
                    break;

                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    number1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    number2 = scanner.nextDouble();

                    try {
                        System.out.println("El resultado es: " + division(number1, number2));

                    } catch (ArithmeticException e) {
                        System.out.println("Error al intentar hacer la operacion: " + e.getMessage());
                    }

                    break;

                case 5:
                    System.out.println("Ingrese el primer numero: ");
                    number1 = scanner.nextDouble();
                    if (number1 < 0) {
                        System.out.println("Numero no valido para la operacion");
                    } else {
                    System.out.println("La raiz cuadrada de: " + number1 + " es: " + raizCuadrada(number1));
                    }
                    break;

                case 6:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    private static double raizCuadrada(double number1) {

        return Math.sqrt(number1);
    }

    private static double division(double number1, double number2) {
        return number1 / number2;
    }

    private static double multiplicacion(double number1, double number2) {
        return number1 * number2;
    }

    private static double resta(double number1, double number2) {
        return number1 - number2;
    }

    private static double suma(double number1, double number2) {
        return number1 + number2;
    }
}
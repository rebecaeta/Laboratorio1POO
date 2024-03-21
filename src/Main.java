import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1 = 0, num2 = 0;

        do {
            System.out.println("Seleccione una opcion a realizar: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            if (opcion != 5) {
                System.out.println("Ingrese el primer numero ");
                num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero ");
                num2 = scanner.nextInt();
            }

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + Suma(num1, num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + Resta(num1, num2));

                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: " + Multiplicacion(num1, num2));

                    break;
                case 4:
                    System.out.println("El resultado de la division es: " + Division(num1, num2));
                    break;
                case 5:
                    System.out.println("Saliendo del programa.... ");
                    break;
                default:
                    System.out.println("la opcion no existe");
                    break;
            }
        } while (opcion != 5);
    }

        public static double Suma ( double num1, double num2){
            return num1 + num2;
        }

        public static double Resta ( double num1, double num2){
            return num1 - num2;
        }

        public static double Multiplicacion ( double num1, double num2){
            return num1 * num2;
        }

        public static double Division ( double num1, double num2){
            return num1 / num2;
        }

}
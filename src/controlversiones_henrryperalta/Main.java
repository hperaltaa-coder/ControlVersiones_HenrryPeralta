package controlversiones_henrryperalta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Calcular promedio");
            System.out.println("2. Mostrar mensaje");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> calcularPromedio();
                case 2 -> System.out.println("Bienvenido al control de versiones con Git!");
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida");
            }
        } while (opcion != 3);
    }

    private static void calcularPromedio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        double n3 = sc.nextDouble();
        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("El promedio es: " + promedio);
    }
}

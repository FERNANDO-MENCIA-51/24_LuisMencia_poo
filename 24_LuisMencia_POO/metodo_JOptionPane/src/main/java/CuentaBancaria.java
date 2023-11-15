/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se ha depositado $" + cantidad + " en la cuenta de " + titular);
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta de " + titular);
        } else {
            System.out.println("Saldo insuficiente para realizar esta operación");
        }
    }

    // Método para mostrar los datos de la cuenta
    public void mostrarDatos() {
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Saldo actual: $" + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String nombreTitular = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double saldoInicial = scanner.nextDouble();

        // Crear un objeto CuentaBancaria con los datos ingresados
        CuentaBancaria cuenta = new CuentaBancaria(nombreTitular, saldoInicial);

        // Mostrar opciones al usuario
        System.out.println("\n--- Operaciones Bancarias ---");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Mostrar datos de la cuenta");
        System.out.print("Ingrese el número de la operación que desea realizar: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad a depositar: ");
                double cantidadDeposito = scanner.nextDouble();
                cuenta.depositar(cantidadDeposito);
                break;
            case 2:
                System.out.print("Ingrese la cantidad a retirar: ");
                double cantidadRetiro = scanner.nextDouble();
                cuenta.retirar(cantidadRetiro);
                break;
            case 3:
                cuenta.mostrarDatos();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }
}


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

public class Auto {
    private String marca;
    private String modelo;
    private int año;

    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarDatos() {
        System.out.println("Datos del Auto:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la marca del auto:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo del auto:");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese el año del auto:");
        int año = scanner.nextInt();

        Auto miAuto = new Auto(marca, modelo, año);
        miAuto.mostrarDatos();

        scanner.close();
    }
}


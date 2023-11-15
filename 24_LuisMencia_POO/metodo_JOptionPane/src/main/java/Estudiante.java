/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */


import javax.swing.JOptionPane;

public class Estudiante {
    private String nombre;
    private int edad;
    private String libroFavorito;

    // Constructor
    public Estudiante(String nombre, int edad, String libroFavorito) {
        this.nombre = nombre;
        this.edad = edad;
        this.libroFavorito = libroFavorito;
    }

    // Método para mostrar los datos del estudiante usando JOptionPane
    public void mostrarDatos() {
        String mensaje = "Nombre: " + nombre + "\n" +
                         "Edad: " + edad + " años\n" +
                         "Libro Favorito: " + libroFavorito;
        
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // Crear un objeto Estudiante
        Estudiante estudiante = new Estudiante("Juan", 20, "El Principito");

        // Mostrar los datos usando JOptionPane
        estudiante.mostrarDatos();
    }
}


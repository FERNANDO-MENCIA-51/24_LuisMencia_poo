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

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public void mostrarDatos() {
        String mensaje = "Título: " + titulo + "\nAutor: " + autor + "\nAño de publicación: " + añoPublicacion;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Libro", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Libro miLibro = new Libro("El nombre del viento", "Patrick Rothfuss", 2007);
        miLibro.mostrarDatos();
    }
}

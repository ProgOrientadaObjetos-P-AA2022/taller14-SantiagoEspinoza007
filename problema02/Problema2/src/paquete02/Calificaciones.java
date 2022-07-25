/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author EdgarEspinoza
 */
public class Calificaciones {
    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Calificaciones(String n, double c1, double c2, double c3) {
        nombre = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerApellido(String ape){
        apellido = ape;
    }

    public void establecerCalificacion1(double c) {
        calificacion1 = c;
    }

    public void establecerCalificacion2(double c) {
        calificacion2 = c;
    }

    public void establecerCalificacion3(double c) {
        calificacion3 = c;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }       
    
    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String data = String.format("%s %s\n"
                + "  Calificaciones:\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  Promedio: %.2f\n",
                nombre,
                apellido,
                calificacion1,
                calificacion2,
                calificacion3,
                promedio);
        return data;

    }
}

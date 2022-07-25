/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author EdgarEspinoza
 */
public class Trabajador {
    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private double sueldoMP;

    public Trabajador() {
    }
        
    public Trabajador(String dni, String nom, String mail, double s, double sMP){
        cedula = dni;
        nombre = nom;
        correo = mail;
        sueldo = s;
        sueldoMP = sMP;
        
    }

    public void establecerCedula(String dni) {
        cedula = dni;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerCorreo(String mail) {
        correo = mail;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public void establecerSueldoMP(double sMP) {
        sueldoMP = sMP;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double obtenerSueldoMP() {
        return sueldoMP;
    } 

    @Override
    public String toString() {
        String reporte = String.format("Cédula: %s\n"
                + "Nombre: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Sueldo Mes Pasado: %.2f\n",
                obtenerCedula(), obtenerNombre(),obtenerCorreo(),
                obtenerSueldo(),obtenerSueldoMP());
        return reporte;
    }
    
    
    
}

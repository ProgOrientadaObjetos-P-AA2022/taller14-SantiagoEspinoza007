/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.sql.SQLException;
import java.util.Scanner;
import paquete02.Trabajador;
import paquete03.Enlace;

/**
 *
 * @author EdgarEspinoza
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner leer = new Scanner(System.in);
        System.out.println("--------------------------------------------------\n"
                + "\t\tSUELDOS TRABJADORES\n");
        Enlace e = new Enlace();
        int opc = 0;
        while (opc != 3) {
            opc = menu1();
            if (opc == 1) {
                System.out.print("-> Ingrese la cédula: ");
                String dni = leer.nextLine();
                System.out.print("\n-> Ingrese el nombre: ");
                String nom = leer.nextLine();
                System.out.print("\n-> Ingrese el correo electrónico: ");
                String mail = leer.nextLine();
                System.out.print("\n-> Ingrese el sueldo: ");
                double s = leer.nextDouble();
                System.out.print("\n-> Ingrese el sueldo del mes pasado: ");
                double sMP = leer.nextDouble();

                Trabajador t = new Trabajador(dni, nom, mail, s, sMP);
                e.insertarSueldotrabajador(t);
            } else {
                if (opc == 2) {
                    for (int i = 0; i < e.obtenerDataSueldoTrabajdor().size(); 
                            i++) {
                        System.out.printf("%s\n", 
                                e.obtenerDataSueldoTrabajdor().get(i));
                    }
                }
            }
        }
        System.out.println("Programa Cancelado por el usuario");
    }

    public static int menu1() {
        Scanner leer = new Scanner(System.in);
        int opc;
        System.out.println("--------------------------------------------------\n"
                + "-> Ingresar Información [1]\n"
                + "-> Ver Base de Datos    [2]\n"
                + "-> Salir                [3]\n"
                + "--------------------------------------------------\n");
        opc = leer.nextInt();

        return opc;
    }
}

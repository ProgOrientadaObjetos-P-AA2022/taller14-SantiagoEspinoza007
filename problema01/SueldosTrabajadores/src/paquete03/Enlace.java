/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.Trabajador;

/**
 *
 * @author EdgarEspinoza
 */
public class Enlace {
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/Sueldos.base";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarSueldotrabajador(Trabajador trabajador) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Sueldos (cedula,"
                    + "nombres, correo, sueldo, sueldoMP)"
                    + "values ('%s', '%s', '%s', %.2f, %s)", 
                    trabajador.obtenerCedula(), 
                    trabajador.obtenerNombre(),
                    trabajador.obtenerCorreo(),
                    trabajador.obtenerSueldo(),
                    trabajador.obtenerSueldoMP());
            //System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Trabajador> obtenerDataSueldoTrabajdor() {  
        ArrayList<Trabajador> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Sueldos;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Trabajador trabajador = new Trabajador();
                trabajador.establecerCedula(rs.getString("cedula"));
                trabajador.establecerNombre(rs.getString("nombres"));
                trabajador.establecerCorreo(rs.getString("correo"));
                trabajador.establecerSueldo(rs.getDouble("sueldo"));
                trabajador.establecerSueldoMP(rs.getDouble("sueldoMP"));
                lista.add(trabajador);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarSueldos");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
}

package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App {
    //public final static String CADENA_CONEXION = "jdbc:mariadb://localhost:3306/product-manager";
    public final static String CADENA_CONEXION = "jdbc:mariadb://localhost:3306/eoi2";
    public final static String USER = "root";
    public final static String PASS = "";


    public static void ejemplo1() {
        try (Connection conn = DriverManager.getConnection(CADENA_CONEXION, USER, PASS)) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM category");
            while(rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("name");
                System.out.println(id + " - " + nombre);
            }
            } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    

    public static void ejemplo2() {
        try (Connection conn = DriverManager.getConnection(CADENA_CONEXION, USER, PASS)) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM categorias");
            while(rs.next()) {
                int categoria = rs.getInt("categoria");
                String titulo = rs.getString("titulo");
                Double salario = rs.getDouble("salario");
                int trienio = rs.getInt("trienio");
                System.out.println(categoria + " - " + titulo + " - " + salario + " - " + trienio);
            }
            } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }


    public static void main( String[] args ){
        //ejemplo1();
        ejemplo2();
    }
}



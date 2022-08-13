/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosmokehouse;

/**
 *
 * @author jakes
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;



public class FuncionesContaduria {
    
    public void gastos() throws IOException { 
    Scanner scanner = new Scanner(System.in); 
    HashMap<String,String> conjuntoGastos = new HashMap<>(); 
    File gastosFile = new File("gastos.txt");
    FileWriter fw = new FileWriter(gastosFile);
        try (PrintWriter pw = new PrintWriter(fw)) {
            System.out.println("Monto del gasto:");
            String gasto = scanner.nextLine();
            System.out.println("Semana fiscal, ej.CW01:");
            String gastoID = scanner.nextLine();
            
            conjuntoGastos.put(gastoID,gasto);
            
            pw.println(gastoID+", "+gasto);
        }
    
}    
  public void entradas() throws IOException { 
    Scanner scanner = new Scanner(System.in); 
    HashMap<String,String> conjuntoEntradas = new HashMap<>(); 
    File entradasFile = new File("entradas.txt");
    FileWriter fw = new FileWriter(entradasFile);
        try (PrintWriter pw = new PrintWriter(fw)) {
            System.out.println("Monto de la entrada:");
            String entrada = scanner.nextLine();
            System.out.println("Semana fiscal, ej.CW01:");
            String entradaID = scanner.nextLine();
            
            conjuntoEntradas.put(entradaID,entrada);
            
            pw.println(entradaID+", "+entrada);
        }  
    
}
  public void printGastos() throws FileNotFoundException{
        File file = new File("gastos.txt");
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()){
        System.out.println(scanner.nextLine());
        }
    
} 
  public void printEntradas() throws FileNotFoundException{
        File file = new File("entradas.txt");
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()){
        System.out.println(scanner.nextLine());
        }
}
}
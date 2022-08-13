/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosmokehouse;

import java.util.Scanner;

/**
 *
 * @author jakes
 */
public class PresupuestosCarne {
    
    public void pork(){
         Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Numero de platillos: ");
        int platillos = scanner.nextInt(); 
        int bbqPork = 125;
        int totalPorkCook = (int) Math.ceil(bbqPork*platillos/1000);
        int totalPorkRaw = (int) Math.ceil(totalPorkCook*2);
        int totalPorkButts = (int) Math.ceil(totalPorkRaw/6);
        int totalPorkCost = (int) Math.ceil(totalPorkRaw*69);
        
        System.out.println("Platillos: "+platillos); 
        System.out.println("Carne cocida: "+totalPorkCook+"kg"); 
        System.out.println("Carne cruda: "+totalPorkRaw+"kg");
        System.out.println("Paletas: "+totalPorkButts+" piezas");
        System.out.println("Costo total: $"+totalPorkCost);
        
       
        
        
        
    }
    
    public void chicken(){
         Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Numero de platillos: ");
        int platillos = scanner.nextInt();
        int bbqChicken = 2;
        int totalChickenCook = (int) Math.ceil(bbqChicken*platillos);
        int totalChickens = (int) Math.ceil(totalChickenCook/8);
        int totalChickenCost = (int) Math.ceil(totalChickens*100);
        
        System.out.println("Platillos: "+platillos); 
        System.out.println("Piezas de pollo: "+totalChickenCook+" piezas"); 
        System.out.println("Pollos enteros: "+totalChickens);
        System.out.println("Costo total: $"+totalChickenCost);
    }
       
    }   
    
    

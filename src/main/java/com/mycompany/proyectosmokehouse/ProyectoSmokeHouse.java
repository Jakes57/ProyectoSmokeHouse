/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectosmokehouse;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jakes
 */
public class ProyectoSmokeHouse {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PresupuestosCarne myPresupuestosCarne = new PresupuestosCarne(); 
        FuncionesContaduria myFuncionesContaduria = new FuncionesContaduria();
        
         int funcion = 0;
         
         
        do {
        System.out.println("--BIENVENIDO AL SISTEMA DE PRESUPUESTOS Y CONTADURIA DE SMOKE HOUSE--");
        System.out.println("1. Calcular Pulled Pork");
        System.out.println("2. Calcular BBQ Chicken");
        System.out.println("3. Agregar gasto");
        System.out.println("4. Agregar entrada");
        System.out.println("5. Mostrar gastos");
        System.out.println("6. Mostrar entradas");
        System.out.println("7. Salir");
        System.out.println("Por favor digite el numero de la funcion deseada:");
        
         funcion = scanner.nextInt();
        
        switch(funcion){
            case 1 -> myPresupuestosCarne.pork();
            case 2 -> myPresupuestosCarne.chicken();
            case 3 -> myFuncionesContaduria.gastos();
            case 4 -> myFuncionesContaduria.entradas();
            case 5 -> myFuncionesContaduria.printGastos();
            case 6 -> myFuncionesContaduria.printEntradas();
            case 7 -> System.out.println("Tenga un buen dia.");
        }     
        }while (funcion !=7);
    }
}

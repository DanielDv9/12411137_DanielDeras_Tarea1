/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12411137_danielderas_tarea1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario metodo = new Inventario(); 
        Recursividad recursivo = new Recursividad();
        int menu = 0;
            while (menu != 3){
                System.out.println("1) Inventario");
                System.out.println("2) Recursividad");
                System.out.println("3) Salir");
                System.out.print("Ingrese una opcion: ");
                menu = sc.nextInt();
                    switch(menu){
                        case 1:
                            metodo.inventario();
                            break;
                        case 2:
                            recursivo.MetodoRecursvio();
                            
                    }
            }
    }
}

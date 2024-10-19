/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12411137_danielderas_tarea1;

import java.util.Random;
import javax.swing.JOptionPane;

public class Recursividad {
    //Metodo de decimal a binario
    public String dec2bi(int num){
        if (num == 1) {
            return "1";
        }else if (num == 0) {
            return "0";
        }else{
            return dec2bi(num/2) + dec2bi(num%2);
        }
    }
    //Metodo de Maximo Comun Divisor
    public int MCD(int num1, int num2){
        if (num1%num2 == 0) {
            return num2;
        }else{
            return MCD(num2, num1%num2);
        }
    }
    //Metodo fibonacci
    public int fibonacci(int num){
        if (num == 0) {
            return 0;
        }else if (num == 1) {
            return 1;
        }else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
    //Metodo de busqueda binaria 
    public int busquedabi(int[] array, int num_buscar, int inicio,int fin){
        int mitad = (inicio+fin)/2;
        if (array[mitad] == num_buscar) {
            return mitad;
        }if (inicio > fin) {
            return -1;
        }
        if (num_buscar < array[mitad]) {
            return busquedabi(array, num_buscar, inicio, mitad-1);
        }else{
            return busquedabi(array, num_buscar, mitad+1, fin);
        }
    }
    public void MetodoRecursvio(){
        int menu = 0;
        do{
            String resp = JOptionPane.showInputDialog(null, "1) Decimal a binario" + "\n" + "2) Maximo Comun Divisor" + "\n" + "3) Serie Fibonacci" + "\n" + "4) Busqueda Binaria" + "\n" + "5) Salir");
            menu = Integer.parseInt(resp);
                switch (menu){
                    //Decimal a binario
                    case 1:
                        String num_decimal = JOptionPane.showInputDialog(null, "Ingrese un numero decimal");
                        int num = Integer.parseInt(num_decimal);
                        JOptionPane.showMessageDialog(null, "El numero en binario es de: " + dec2bi(num));
                        break;
                    case 2:
                        //MCD
                        String numero1 = JOptionPane.showInputDialog(null, "Ingresse el primer numero ");
                        String numero2 = JOptionPane.showInputDialog(null, "Ingresse el segundo numero ");
                        int num1 = Integer.parseInt(numero1);
                        int num2 = Integer.parseInt(numero2);
                        JOptionPane.showMessageDialog(null, "El Maximo Comun Divissor es de: " + MCD(num1,num2));
                        break;
                    case 3:
                        //Fibonacci
                        String num_fibonacci = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
                        num1 = Integer.parseInt(num_fibonacci);
                        JOptionPane.showMessageDialog(null, "El numero fibonacci es de: " + fibonacci(num1));
                        break;
                    case 4:
                        //Busqueda binaria
                        //El usuario ingresa el tamano del arrayList, en el cual se llena de numeros randoms 
                        String tamano_array = JOptionPane.showInputDialog(null, "Ingrese el tamano del array: ");
                        int tamano = Integer.parseInt(tamano_array);
                        int[] array = new int[tamano];
                        //Llena de numeros randoms
                        Random num_r = new Random();
                        for (int i = 0; i < array.length; i++) {
                            array[i] = num_r.nextInt(1,20);
                        }
                        //Ordena el array
                        for (int i = 0; i < array.length - 1; i++) {
                            for (int j = 0; j < array.length - 1; j++) {
                                if (array[j] > array[j + 1]) {
                                int bandera = array[j];
                                array[j] = array[j + 1];
                                array[j + 1] = bandera;
                                }
                            }
                            
                        }
                        String numero_buscar = JOptionPane.showInputDialog(null, "El array se ha generado con numeros aleatorios" + "\n" + "Ingrese el numero a  buscar: ");
                        int num_buscar = Integer.parseInt(numero_buscar);
                        for (int i = 0; i < array.length-1; i++) {
                            System.out.print("("+array[i]+")");
                            System.out.println("");
                        }
                        if (busquedabi(array,num_buscar, 0, array.length-1) == -1) {
                            JOptionPane.showMessageDialog(null, "El numero que ingreso no esta en el array");
                        }else{
                            JOptionPane.showMessageDialog(null, "El numero " + num_buscar + " se encuentra en la posicion: " + busquedabi(array,num_buscar, 0, array.length-1));
                        }
                        
                        break;
                }
        }while(menu != 5);
    }
}

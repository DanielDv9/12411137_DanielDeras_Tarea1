/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12411137_danielderas_tarea1;

import java.util.ArrayList;
import javax.swing.JOptionPane;




public class Inventario {
    
    //Atributos
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int fecha;
    private int precio;

    public Inventario(String matricula, String marca, String modelo, String color, int fecha, int precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fecha = fecha;
        this.precio = precio;
    }

    public Inventario() {
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" +"Color:" + color + "\n" +"Fecha: " + fecha + "\n"+ "Precio: " + precio;
    }
    
    public void inventario(){
        ArrayList<Inventario> carros = new ArrayList();
        int menu = 0;
        do{    
        String resp = JOptionPane.showInputDialog("1) Agregar " + "\n" + "2) Listar" + "\n" + "3) Modificar " + "\n" + 
        "4) Eliminar " + "\n" + "5) Vehiculo mas antiguo" + "\n" + "6) Vehiculo de color rojo " + "\n" + "7) Diferencia de fecha entres dos vehiculos " + "\n" + "8) Salir");
        menu = Integer.parseInt(resp);
        //CRUD
            switch (menu){
                case 1:
                    //Agregar
                    //verifica si es menor que 50
                    if (carros.size() < 50){
                    String matricula  = JOptionPane.showInputDialog("Ingrese la matricula del vehiculo");
                    String marca  = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
                    String modelo  = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo");
                    String color  = JOptionPane.showInputDialog("Ingrese el color del vehiculo");
                    String fecha  = JOptionPane.showInputDialog("Ingrese el año del vehiculo");
                    String precio  = JOptionPane.showInputDialog("Ingrese el precio del vehiculo");
                    Inventario carro = new Inventario(matricula,marca,modelo,color,Integer.parseInt(fecha), Integer.parseInt(precio));
                    carros.add(carro);
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya paso el limite de 50 carros");
                    }
                    break;
                case 2:
                    //Listar
                    JOptionPane.showMessageDialog(null, carros.toString());
                    break;
                case 3:
                    //Modificar
                    if (carros.size()>0) {    
                        String busqueda_matricula  = JOptionPane.showInputDialog("Ingrese la matricula del vehiculo");
                        resp = JOptionPane.showInputDialog("1) Matricula " + "\n" + "2) Marca" + "\n" + "3) Modelo " + "\n" + 
                        "4) Color " + "\n" + "5) Fecha " + "\n" + "6) Precio");
                        int sub_menu = Integer.parseInt(resp);
                            switch(sub_menu){
                                //sub menu de las partes a elegir para modificar
                                case 1:
                                    //Matricula
                                    String matricula_cambiar = JOptionPane.showInputDialog("Ingrese la matricula que desea cambiar");
                                    for (int i = 0; i < carros.size(); i++) {
                                        if (carros.get(i).getMatricula().equalsIgnoreCase(busqueda_matricula)) {
                                            carros.get(i).setMatricula(matricula_cambiar);
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, "Se ha cambiado correctamente");
                                    break;
                                case 2:
                                    //Marca
                                    String marca_cambiar = JOptionPane.showInputDialog("Ingrese la marca que desea cambiar");
                                    for (int i = 0; i < carros.size(); i++) {
                                        if (carros.get(i).getMatricula().equalsIgnoreCase(busqueda_matricula)) {
                                            carros.get(i).setMarca(marca_cambiar);
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, "Se ha cambiado correctamente");
                                    break;
                                case 3:
                                    //Modelo
                                    String modelo_cambiar = JOptionPane.showInputDialog("Ingrese el modelo que desea cambiar");
                                    for (int i = 0; i < carros.size(); i++) {
                                        if (carros.get(i).getMatricula().equalsIgnoreCase(busqueda_matricula)) {
                                            carros.get(i).setModelo(modelo_cambiar);
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, "Se ha cambiado correctamente");
                                    break;
                                case 4:
                                    //Color
                                    String color_cambiar = JOptionPane.showInputDialog("Ingrese el color que desea cambiar");
                                    for (int i = 0; i < carros.size(); i++) {
                                        if (carros.get(i).getMatricula().equalsIgnoreCase(busqueda_matricula)) {
                                            carros.get(i).setColor(color_cambiar);
                                        }
                                    }
                                    break;
                                case 5:
                                    //Fecha
                                    String fecha_cambiar = JOptionPane.showInputDialog("Ingrese el anio que desea cambiar");
                                    for (int i = 0; i < carros.size(); i++) {
                                        if (carros.get(i).getMatricula().equalsIgnoreCase(busqueda_matricula)) {
                                            carros.get(i).setFecha(Integer.parseInt(fecha_cambiar));
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, "Se ha cambiado correctamente");
                                    break;
                                //Precio
                                case 6:
                                    String precio_cambiar = JOptionPane.showInputDialog("Ingrese el precio del vehiculo que desea cambiar");
                                    for (int i = 0; i < carros.size(); i++) {
                                        if (carros.get(i).getMatricula().equalsIgnoreCase(busqueda_matricula)) {
                                            carros.get(i).setPrecio(Integer.parseInt(precio_cambiar));
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, "Se ha cambiado correctamente");
                                    break;
                            }
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay carros registrados");
                    }
                    break;
                case 4:
                    //Eliminar
                    String matricula_borrar  = JOptionPane.showInputDialog("Ingrese la matricula del vehiculo");
                    for (int i = 0; i < carros.size(); i++) {
                        if (carros.get(i).getMatricula().equalsIgnoreCase(matricula_borrar)) {
                            carros.remove(i);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                    break;
                case 5:
                    //Vehiculo mas antiguo
                    int menor = carros.get(0).getFecha();
                    for (int i = 1; i < carros.size(); i++) {
                        if (carros.get(i).getFecha() < menor) {
                            menor = carros.get(i).getFecha();
                        }
                    }
                    for (int i = 0; i < carros.size(); i++) {
                        if (carros.get(i).getFecha() == menor) {
                            JOptionPane.showMessageDialog(null, carros.get(i).toString());
                        }
                    }
                    break;
                case 6:
                    //Vehiculos de color rojo
                    for (int i = 0; i < carros.size(); i++) {
                        if (carros.get(i).getColor().equalsIgnoreCase("rojo")) {
                            JOptionPane.showMessageDialog(null, carros.get(i).toString());
                        }
                    }
                    break;
                case 7:
                    //Diferencia entre dos fechas
                    int fecha1 = 0;
                    int fecha2  = 0;
                    String matricula1 = JOptionPane.showInputDialog(null, "Ingrese la matricula del primer vehiculo");
                    String matricula2 = JOptionPane.showInputDialog(null, "Ingrese la matricula del segundo vehiculo");
                    //Recorre el arraylist para conseguir las fechas de las matriculas dadas
                    for (int i = 0; i < carros.size(); i++) {
                        if (carros.get(i).getMatricula().equalsIgnoreCase(matricula1)) {
                            fecha1 = carros.get(i).getFecha();
                        }else if (carros.get(i).getMatricula().equalsIgnoreCase(matricula2)) {
                            fecha2 = carros.get(i).getFecha();
                        }
                    }
                    int diferencia = fecha1 - fecha2;
                    if (diferencia < 0) {
                        diferencia = diferencia * -1;
                    }
                    String resultado = Integer.toString(diferencia);
                    JOptionPane.showMessageDialog(null,"La diferencia es de: " + resultado + "años");
                    break;
            }
        }while(menu != 8);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.util.Scanner;

/**
 * La clase es para un empleado que cobra por horas trabajadas
 * 
 * Es hija de la clase abstracta {@code Empleado} y calcula su salario multiplicando las Horas trabajadas por el 
 * valor de cada hora.
 *
 * @author rober
 */
public class EmpleadoPorHora extends Empleado {
    
    private double horasTrabajadas;
    private double valorPorHora;
    
    public EmpleadoPorHora(int idEmpleado, String nombre, double horasTrabajadas, double valorPorHora) {
               super (idEmpleado, nombre);
               this.horasTrabajadas = horasTrabajadas;
               this.valorPorHora = valorPorHora;
               
    }
/**
 * La clase {@code EmpleadoPorHora()} calcula su salario multiplicando las horas 
 * trabajadas por el valor de cada hora
 * 
 * @return Salario calculado
 */
    @Override
    public double calcularSalario() {
         return horasTrabajadas * valorPorHora;
                
    }
    
    @Override
    public void mostrarDatos() { 
        super.mostrarDatos();
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por cada hora: " + valorPorHora);
        System.out.println("El salario es de: $" + calcularSalario());
        System.out.println();
    }
    
    @Override
    public void actualizarDatos() {
        Scanner newDato = new Scanner(System.in);

        System.out.printf("Escriba las nuevas horas trabajadas de %s (o presiona ENTER para mantener %f)", getNombre(), getHorasTrabajadas());
        String newHorasTrab = newDato.nextLine().trim();
        if (!newHorasTrab.isEmpty()) {
            this.horasTrabajadas = Double.parseDouble(newHorasTrab);
        }
            System.out.printf("Escriba el nuevo valor por hora (o presione ENTER para mantener $%.2f)", getValorPorHora());
            String newValHoras = newDato.nextLine().trim();
            if (!newValHoras.isEmpty()) {
                this.valorPorHora = Double.parseDouble(newValHoras);
            }
    }
    // getter de los parámetros de valorPorHora y horasTrabajadas
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public double getValorPorHora() {
        return valorPorHora;
    }
    
    //setter de los parámetros de valorPorHora y horasTrabajadas
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
}

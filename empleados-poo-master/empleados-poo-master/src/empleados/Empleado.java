/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *Es la clase abstracta que heredarán todos los empleados (Las subclases)
 * 
 * Contiene los datos comunes de todos los empleados, es decir, los atributos idEmpleado y nombre 
 *  y define el metodo abstracto de  {@code calcularSalario()},  ese metodo es el que cada subclase debe implementar
 * de manera obligatoria, pero cada clase debe hacerlo acorde al tipo de empleado.
 * 
 * Esta clase, al ser abstracta no pede instanciaser en el main directamente.
 * 
 * Esta es la clase base para todas las demas. La clase {@code AdminEmpleados} la usa para guardar todos los 
 * empleados en una misma lista y calcular sus salarios mediante polimorfismo.
 * 
 * @author rober
 */

// 
public abstract class Empleado {
    private int idEmpleado;
    private String nombre;
    
    public Empleado(int idEmpleado, String nombre) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
    }
    
    
/**
 * Es el método abstracto que calcula el salario de cada tipo de trabajador.
 * 
 * Cada subclase debe implementar este metodo de forma diferente, pero todas lleven implementarlo.
 * 
 * @return el salario calculado
 */
    public abstract double calcularSalario();
    public abstract void actualizarDatos();
    
    public void mostrarDatos() {
    System.out.println("========================= ");
    System.out.println(" Los datos de " + nombre + " son  ");
    System.out.println("========================= ");
    System.out.println("ID: " + idEmpleado);
    System.out.println("Nombre: " + nombre);
    System.out.println();

    }
 
    public int getIdEmpleado() {
        return idEmpleado;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
}

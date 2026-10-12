package empleados;

import java.util.Scanner;

/**
 * Representa a un empleado administrativo que recibe un salario mensual fijo.
 * Hereda de la clase abstracta {@code Empleado} y calcula su salario
 * devolviendo directamente el salario mensual.
 *
 */

public class EmpleadoAdministrativo extends Empleado {
    
    private double salarioMensual;

    public EmpleadoAdministrativo (int idEmpleado, String nombre, double salarioMensual){

        super(idEmpleado, nombre);
        this.salarioMensual = salarioMensual;

    }

    public double getSalarioMensual(){
        return salarioMensual;
    }

    public void setSalarioMensual (double salarioMensual){
        this.salarioMensual = salarioMensual;
    }

    @Override 
    public double calcularSalario(){
        return salarioMensual;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Salario mensual: " + salarioMensual);
        System.out.println();
    }
    
    @Override
    public void actualizarDatos() {
        Scanner newDato = new Scanner(System.in);
        System.out.printf("Ingrese el nuevo salario de %s: (o presione ENTER para mantener $%.2f)", getNombre(), getSalarioMensual());
        String newSalario = newDato.nextLine().trim();
    
        if (!newSalario.isEmpty()) {
            this.salarioMensual = Double.parseDouble(newSalario);
        }

    }
}
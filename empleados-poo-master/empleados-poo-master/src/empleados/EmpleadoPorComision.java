package empleados;

import java.util.Scanner;

/**
 * Representa a un empleado que gana un salario base más una comisión
 * calculada sobre sus ventas realizadas. El porcentaje de comisión se maneja
 * como decimal (0.10 equivale a 10%). Hereda de la clase abstracta {@code Empleado}.
 */
public class EmpleadoPorComision extends Empleado {

    private double salarioBase;
    private double ventasRealizadas;
    private double porcentajeComision;

    public EmpleadoPorComision(int idEmpleado, String nombre, double salarioBase,double ventasRealizadas, double porcentajeComision) {
        super(idEmpleado, nombre);
        this.salarioBase = salarioBase;
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(double ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventasRealizadas * porcentajeComision);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Ventas realizadas: " + ventasRealizadas);
        System.out.println("Porcentaje de comisión: " + porcentajeComision);
        System.out.println("Salario total: " + calcularSalario() + "\n");
    }
    
    @Override
public void actualizarDatos() {
    Scanner newDato = new Scanner(System.in);
        
        System.out.printf("Escriba el nuevo salario base (o presione ENTER para mantener $%.2f): ", getSalarioBase());
        String newSalarioBs = newDato.nextLine().trim();
        if (!newSalarioBs.isEmpty()) {
            this.salarioBase = Double.parseDouble(newSalarioBs);
        }
        
        System.out.printf("Escriba las nuevas ventas realizadas (o presione ENTER para mantener $%.2f): ", getVentasRealizadas());
        String newVentasRealiz = newDato.nextLine().trim();
        if (!newVentasRealiz.isEmpty()) {
            this.ventasRealizadas = Double.parseDouble(newVentasRealiz);
        }
        
        System.out.printf("Escriba el nuevo porcentaje de comisión (o presione ENTER para mantener %.2f%%): ", getPorcentajeComision());
        String newPorcnVentas = newDato.nextLine().trim();
        if (!newPorcnVentas.isEmpty()) {
            this.porcentajeComision = Double.parseDouble(newPorcnVentas);
        }
    }
}
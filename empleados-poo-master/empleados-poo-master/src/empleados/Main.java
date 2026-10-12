/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleados;
import java.util.Scanner;

/**
 * Es un menú interactivo que centraliza el control de todas las funciones de {@code AdminEmpleados} para que el usuario 
 * lo use de forma cómoda y elegabte.
 * 
 * 
 * @author rober
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AdminEmpleados admin = new AdminEmpleados();
        Scanner opcsn = new Scanner(System.in);
        int num = 0;
        
        while (num != 5) {
            System.out.println("\n============== 𝗦𝗜𝗦𝗧𝗘𝗠𝗔 𝗗𝗘 𝗡Ó𝗠𝗜𝗡𝗔 ============== ");
            System.out.println("1. Registrar nuevo empleado");
            System.out.println("2. Modificar información de un empleado");
            System.out.println("3. Consultar empleados por tipo");
            System.out.println("4. Generar reporte general de nómina");
            System.out.println("5. Salir del sistema");
            System.out.print("Seleccione una opción: ");
            
            if (opcsn.hasNextInt()) {
                num = opcsn.nextInt();
                opcsn.nextLine();
            } else {
                System.out.println("Escriba un numero valido");
                opcsn.nextLine();
                continue;
            }

            switch (num) {
                case 1:
                    System.out.println("\n[ Ejecutando: Registrar Empleado ]");
                    admin.registrarNuevoEmpleado();
                    break;
                    
                case 2:
                   System.out.print("Ingrese el ID del empleado que desea modificar: ");
                   if (opcsn.hasNextInt()) {
                        int id = opcsn.nextInt();
                        opcsn.nextLine();
                        admin.modificarInformacion(id);
                    } else {
                        System.out.println("Id inválido. Debe ser un número entero.");
                        opcsn.nextLine();
                    }
                    break;
                    
                case 3:
                    admin.consultarPorTipoEmpleado();
                    break;
                    
                case 4:
                    admin.generarReporte();
                    break;
                    
                case 5:
                    System.out.println("\nSaliendo del sistema - presione cualquier tecla");
                    opcsn.nextLine(); 
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente de nuevo del 1 al 5.");
            }
        }
        opcsn.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *Esta clase administra la lista de empleados de todo el sistema
 * 
 * almacena todos los tipos de empleados en un arreglo de tipo {@code Empleado}
 * y ofrece las opciones que pide la guia de trabajo: Registrar empleados, Consultar empleados
 * Calcular remuneraciones. Generar reportes, Modificar información, Consultar información según el tipo de empleado.
 * 
 * 
 *  
 * @author rober
 */
public class AdminEmpleados {
    
private ArrayList<Empleado> empleados;
private String aviso = "- [𝗦𝗶𝘀𝘁𝗲𝗺𝗮 𝗩𝗮𝗰í𝗼] Registra al menos un empleado para habilitar la f@unción de: ";
public AdminEmpleados() {
    empleados = new ArrayList<>();
}    

private Empleado buscarEmpleadoXId(int IdEmpleado) {
     for (Empleado buscandoEmple : empleados) {
          if (buscandoEmple.getIdEmpleado() == IdEmpleado) {
              return buscandoEmple;
                }
        }
    return null;
}

public void registrarEmpleado(Empleado empleado) {
        if (buscarEmpleadoXId(empleado.getIdEmpleado()) == null ) {
                empleados.add(empleado);
                System.out.println("El empleado: " + empleado.getNombre() + " Fue agregado exitosamente");
                return;
        }
                System.out.println("El empleado " + empleado.getNombre() + " Ya fue registrado antes");               
         }

public void consultarEmpleados() {
        if (empleados.size() > 0) {
            System.out.println("\n -⋆⋅☆⋅⋆- 𝗹𝗶𝘀𝘁𝗮 𝗱𝗲 𝘁𝗼𝗱𝗼𝘀 𝗹𝗼𝘀 𝗲𝗺𝗽𝗹𝗲𝗮𝗱𝗼𝘀 𝗿𝗲𝗴𝗶𝘀𝘁𝗿𝗮𝗱𝗼𝘀 -⋆⋅☆⋅⋆- \n");
                for (Empleado listaDeEmples : empleados){
                    listaDeEmples.mostrarDatos();
                } 
            return;
          }
            System.out.println(aviso + "𝗰𝗼𝗻𝘀𝘂𝗹𝘁𝗮𝗿 𝗲𝗺𝗽𝗹𝗲𝗮𝗱𝗼𝘀" );
 }

public void calcularRemuneraciones() {
    double monyTotal = 0;
    
    if (empleados.size() > 0) {
            System.out.println("\n -⋆⋅☆⋅⋆- 𝗘𝗺𝗽𝗹𝗲𝗮𝗱𝗼𝘀 𝘆 𝘀𝘂 𝗿𝗲𝗺𝘂𝗻𝗲𝗿𝗮𝗰𝗶ó𝗻 -⋆⋅☆⋅⋆- \n");
            for (Empleado remuneXEmple : empleados){
                System.out.println("- " + remuneXEmple.getNombre() + " gana: $" + remuneXEmple.calcularSalario() );
                monyTotal += remuneXEmple.calcularSalario();
            } 
                System.out.println("\nTotal de remuneraciones: $" + monyTotal + "\n");
                return;
    }
            System.out.println(aviso + "𝗰𝗮𝗹𝗰𝘂𝗹𝗮𝗿 𝗿𝗲𝗺𝘂𝗻𝗲𝗿𝗮𝗰𝗶𝗼𝗻𝗲𝘀");
}

public void generarReporte(){
    double monyTotal2 = 0;
    int EmpleadoAdministrativo =0;
    int EmpleadoPorHora = 0;
    int EmpleadoPorComision = 0;
    
     if (empleados.size() > 0) {
        System.out.println("\n -⋆⋅☆⋅⋆- R𝗲𝗽𝗼𝗿𝘁𝗲 𝗱𝗲 𝗲𝗺𝗽𝗹𝗲𝗮𝗱𝗼𝘀 -⋆⋅☆⋅⋆- \n");
            for (Empleado reportEmplea2 : empleados){
            System.out.printf("- Empleado: %s | ID: %d | Salario %.2f |\n", reportEmplea2.getNombre(), reportEmplea2.getIdEmpleado(), reportEmplea2.calcularSalario());
            monyTotal2 += reportEmplea2.calcularSalario(); 
               
            String nameClase = reportEmplea2.getClass().getSimpleName();
                switch (nameClase) {
                case "EmpleadoAdministrativo":
                    EmpleadoAdministrativo++;
                    break;
                case "EmpleadoPorHora":
                    EmpleadoPorHora++;
                    break;
                case "EmpleadoPorComision":
                     EmpleadoPorComision++;
                     break;
                }
            }
            
            System.out.println("\n\n         -- 𝗡ó𝗺𝗶𝗻𝗮 --");
            System.out.printf("\nTotal de empleados en el sistema: %d \n", empleados.size());
            System.out.printf("\nEmpleados Administrativos: %d", EmpleadoAdministrativo);            
            System.out.printf("\nEmpleados Por hora: %d", EmpleadoPorHora);            
            System.out.printf("\nEmpleados Por comisión: %d\n",EmpleadoPorComision);            
            System.out.printf("\nPago de todos los empleados en total: $%.2f\n", monyTotal2);  
            return;
     }
        System.out.println(aviso + "𝗴𝗲𝗻𝗲𝗿𝗮𝗿 𝗿𝗲𝗽𝗼𝗿𝘁𝗲");
}

public void modificarInformacion(int IdEmpleado) {
    Empleado emple =buscarEmpleadoXId(IdEmpleado);
    Scanner newDato = new Scanner(System.in);
    
    if (emple != null) {
       System.out.printf("El empleado %s fue encontrado\n", emple.getNombre());
       System.out.printf("Escriba el nuevo nombre (o presione ENTER para mantener %s): ", emple.getNombre());
       String newNombre = newDato.nextLine().trim();
              
     if (!newNombre.isEmpty()) {
         emple.setNombre(newNombre);
     }
        emple.actualizarDatos();
        System.out.print("Los datos fueron correctamente actualizados");
        emple.mostrarDatos();
        return;
    } // Fin del if
        System.out.printf("- [𝗡𝗼 𝘀𝗲 𝗲𝗻𝗰𝗼𝗻𝘁𝗿𝗼 𝘂𝗻 𝗲𝗺𝗽𝗹𝗲𝗮𝗱𝗼 𝗰𝗼𝗻 𝗲𝗹 𝗜𝗗: %d] \n", IdEmpleado);
}


public void consultarPorTipoEmpleado() {
    if (empleados.isEmpty()) {
    System.out.println("No hay empleados registrados en el sistema.");
    return;
    }

    Scanner sc = new Scanner(System.in);
    System.out.println("\n--- Seleccione el tipo de empleado a consultar ---");
    System.out.println("1. Empleado Administrativo");
    System.out.println("2. Empleado Por Hora");
    System.out.println("3. Empleado Por Comisión");
    System.out.print("Elija una opción (1-3): ");
    
    int selec = sc.nextInt();
    String claseBuscada = "";

    switch (selec) {
        case 1:
            claseBuscada = "EmpleadoAdministrativo";
            break;
        case 2:
            claseBuscada = "EmpleadoPorHora";
            break;
        case 3:
            claseBuscada = "EmpleadoPorComision";
            break;
        default:
            System.out.println("Opción inválida.");
            return;
    }

    System.out.println("\n -⋆⋅☆⋅⋆- 𝗘𝗺𝗽𝗹𝗲𝗮𝗱𝗼𝘀 𝗳𝗶𝗹𝘁𝗿𝗮𝗱𝗼𝘀 -⋆⋅☆⋅⋆-\n");
    int contador = 0;

    for (Empleado emp : empleados) {
        String nombreClase = emp.getClass().getSimpleName();
        
        if (nombreClase.equals(claseBuscada)) {
            emp.mostrarDatos();
            contador++;
        }
    }
    
    if (contador == 0) {
        System.out.println("No se encontraron empleados registrados bajo esta categoría.");
    } else {
        System.out.printf("Total de registros encontrados para esta categoría: %d\n", contador);
    }
}

public void registrarNuevoEmpleado() {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\n--- REGISTRO DE NUEVO EMPLEADO ---");
    System.out.print("Ingrese el ID del empleado: ");
int id = sc.nextInt();
sc.nextLine();

//  rechazar el ID si ya existe (última actializacioooooooooooooooooooooooooon) o eso creo.
if (buscarEmpleadoXId(id) != null) {
    System.out.printf("- [Ya existe un empleado con el ID: %d] Registro cancelado.\n", id);
    return;
}

System.out.print("Ingrese el nombre del empleado: ");
String nombre = sc.nextLine().trim();
    
    System.out.println("\nSeleccione el tipo de empleado:");
    System.out.println("1. Administrativo");
    System.out.println("2. Por Hora");
    System.out.println("3. Por Comisión");
    System.out.print("Elija una opción (1-3): ");
    int tipo = sc.nextInt();
    sc.nextLine();
    
    Empleado nuevoEmpleado = null;

    switch (tipo) {
        case 1:
            nuevoEmpleado = new EmpleadoAdministrativo(id, nombre, 0.0);
            break;
        case 2:
            nuevoEmpleado = new EmpleadoPorHora(id, nombre, 0.0, 0.0);
            break;
        case 3:
            nuevoEmpleado = new EmpleadoPorComision(id, nombre, 0.0, 0.0, 0.0);
            break;
        default:
            System.out.println("Opción de tipo inválida. Registro cancelado.");
            return;
    }
    
    nuevoEmpleado.actualizarDatos();
    
    empleados.add(nuevoEmpleado);
    
    System.out.println("\n¡Empleado registrado exitosamente en el sistema!");
}


}

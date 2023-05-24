package paqueteuno;

import java.util.Scanner;
import paquetedos.*;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        // Declaración de variables para poder ingresar datos por teclado
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        
        String nombreCiudad;
        String provincia;
        
        int numEspecialidades;
        
        int numMedicos;
        ConjuntoMedicos medicos[];
        String nomMedico;
        double sueldoMedico;
        String especialidad;
        
        int numEnfermeros;
        ConjuntoEnfermeros enfermeros[];
        String nomEnfermero;
        double sueldoEnfermero;
        String tipo;
        
        String direccion;
        
        // Pedir datos por teclado
        System.out.print("Ingrese el nombre del hospital: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la dirección: ");
        direccion = sc.nextLine();
        System.out.print("Ingrese la ciudad a la que pertenece: ");
        nombreCiudad = sc.nextLine();
        System.out.print("Ingresar la provincia: ");
        provincia = sc.nextLine();
        System.out.print("Ingrese el número de especialidades: ");
        numEspecialidades = sc.nextInt();
        sc.nextLine(); // Limpiar el Buffer
        
        Ciudad ciudad = new Ciudad(nombreCiudad,provincia);
        
        // El número de especialides indica el tamaño para los arreglos de
        // tipo ConjuntoMedicos y  ConjuntoEnfermeros
        // Arreglo ConjuntoMedicos

        System.out.println("-----------------------------------------");
        System.out.print("Ingrese el número de médicos: ");
        numMedicos = sc.nextInt();
        System.out.println("-----------------------------------------");
        sc.nextLine();
        medicos = new ConjuntoMedicos[numMedicos];
        
        for (int i=0; i<medicos.length; i++){
            System.out.print("Ingrese los datos del "+(i+1)+"º medico: \n"
                    + "Nombre -> ");
            nomMedico = sc.nextLine();
            System.out.print("Sueldo -> ");
            sueldoMedico = sc.nextDouble();
            sc.nextLine();
            System.out.print("Especialidad -> ");
            especialidad = sc.nextLine();
            
            // Creación del objeto de tipo ConjuntoMedico
            ConjuntoMedicos med = new ConjuntoMedicos(nomMedico,
                    especialidad,sueldoMedico);
            
            medicos[i] = med;
            System.out.print("-----------------------------------------\n");
        }
        
        // Arreglo ConjuntoEnfermeros
        System.out.print("Ingrese el número de enfermeros: ");
        numEnfermeros = sc.nextInt();
        System.out.print("-----------------------------------------\n");
        sc.nextLine();
        enfermeros = new ConjuntoEnfermeros[numEnfermeros];
        
        for (int i=0; i<enfermeros.length; i++){
            System.out.print("Ingrese los datos del "+(i+1)+"º enfermero: \n"
                    + "Nombre -> ");
            nomEnfermero = sc.nextLine();
            System.out.print("Sueldo -> ");
            sueldoEnfermero = sc.nextDouble();
            sc.nextLine();
            System.out.print("Tipo -> ");
            tipo = sc.nextLine();
            
            // Creación del objeto de tipo ConjuntoEnfermeros
            ConjuntoEnfermeros enf = new ConjuntoEnfermeros(nomEnfermero,
                    tipo,sueldoEnfermero);
            
            enfermeros[i] = enf;
            System.out.print("-----------------------------------------\n");
        }
        
        // Crear objeto de tipo EntidadHospitalaria
        EntidadHospitalaria hospital = new EntidadHospitalaria(nombre,
                ciudad,numEspecialidades,medicos,enfermeros,
                direccion);
        
        // Llamar a la función que calcula el total de sueldos a pagar en un mes
        hospital.calcularSueldoPagar();
        
        // Imprimir los datos con el método toString
        System.out.printf("%s",hospital);
    }
    
}

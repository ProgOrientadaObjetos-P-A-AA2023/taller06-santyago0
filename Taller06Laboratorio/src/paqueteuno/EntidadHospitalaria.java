package paqueteuno;

import paquetedos.*;
/**
 *
 * @author santy
 */
public class EntidadHospitalaria {
    private String nombre;
    private Ciudad ciudad;
    private int numeroEspecialidades;
    private ConjuntoMedicos [] medicos;
    private ConjuntoEnfermeros [] enfermeros;
    private double sueldoPagar;
    private String direccion;
    
    public EntidadHospitalaria(String n, Ciudad c, int nEsp, 
            ConjuntoMedicos[] cMed, ConjuntoEnfermeros[] cEnf, String d){
        nombre = n;
        ciudad = c;
        numeroEspecialidades = nEsp;
        medicos = cMed;
        enfermeros = cEnf;
        direccion = d;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerCiudad(Ciudad x){
        ciudad = x;
    }
    
    public void establecerNumeroEspecialidades(int x){
        numeroEspecialidades = x;
    }
    
    public void establecerMedicos(ConjuntoMedicos[] x){
        medicos = x;
    }
    
    public void establecerEnfermeros(ConjuntoEnfermeros[] x){
        enfermeros = x;
    }
    
    public void calcularSueldoPagar(){
        double sueldoMedicos = 0;
        double sueldoEnfermeros = 0;
        for (int i=0; i<medicos.length; i++){
            sueldoMedicos += medicos[i].obtenerSueldo();
        }
        for (int i=0; i<enfermeros.length; i++){
            sueldoEnfermeros += enfermeros[i].obtenerSueldo();
        }
        sueldoPagar = sueldoMedicos + sueldoEnfermeros;
    }
    
    public void establecerDireccion(String x){
        direccion = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerNumeroEspecialidades(){
        return numeroEspecialidades;
    }
    
    public ConjuntoMedicos[] obtenerMedicos(){
        return medicos;
    }
    
    public ConjuntoEnfermeros[] obtenerEnfermeros(){
        return enfermeros;
    }
    
    public double obtenerSueldoPagar(){
        return sueldoPagar;
    }
    
    public String obtenerDireccion(){
        return direccion;
    }
    
    @Override
    public String toString(){
        String cadena = "\n=================================================\n";
        cadena = String.format("%sHOSPITAL %S\nDirección: %s\nCiudad: %s\n"
                + "Provincia: %s\nNúmero de Especialidades: %d\nListado de "
                + "médicos\n\n",cadena,nombre,direccion,
                ciudad.obtenerNombre(),ciudad.obtenerProvincia(),
                numeroEspecialidades);
        for (int i=0; i<medicos.length; i++){
            cadena = String.format("%s- %s - sueldo: $%.2f - %s\n",
                    cadena,medicos[i].obtenerNombre(),
                    medicos[i].obtenerSueldo(),
                    medicos[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\nListado enfermeros(as)\n",cadena);
        for (int i=0; i<enfermeros.length; i++){
            cadena = String.format("%s- %s - sueldo: $%.2f - %s\n",
                    cadena,enfermeros[i].obtenerNombre(),
                    enfermeros[i].obtenerSueldo(),
                    enfermeros[i].obtenerTipo());
        }
        cadena = String.format("%s\nTotal de suledos a pagar por mes: $%.2f"
                + "\n",cadena,sueldoPagar);
        return cadena;
    }
    
}

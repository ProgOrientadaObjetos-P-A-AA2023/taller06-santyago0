package paquetedos;

/**
 *
 * @author santy
 */
public class Ciudad {
    private String nombre;
    private String provincia;
    
    public Ciudad(String n, String p){
        nombre = n;
        provincia = p;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerProvincia(String x){
        provincia = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerProvincia(){
        return provincia;
    }
    
}

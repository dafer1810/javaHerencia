
package Herencia;


public class Cliente extends Persona {
    
    private String categoria; 

    public Cliente(String categoria, String nombre, String apellido, int codigo) {
        super(nombre, apellido, codigo);
        this.categoria = categoria;
    }
    public String mostrarDatos (){
        return getNombre()+ "apellido \n" + getApellido()+ "Documento\n"+ getCodigo()+ "Categoria" +categoria; 
    }
    
    }

    


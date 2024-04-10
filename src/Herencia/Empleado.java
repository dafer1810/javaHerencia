
package Herencia;

public class Empleado extends Persona {
    private double sueldo; 

    public Empleado(String nombre, String apellido, int codigo) {
        super(nombre, apellido, codigo);
    }

    public String mostrarEmpleado(){
     
    return getNombre() + "apellido \n" + getApellido()+ "Documento\n"+ getCodigo()+ "Sueldo" + sueldo; 

    }
   
    }


    
    
    


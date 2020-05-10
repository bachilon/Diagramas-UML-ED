package Personas;

public class Director{
	String nombre;
	String apellidos;
	int edad;
	int numDespacho;
	
	public Director (String nombre, String apellidos, int numDespacho, int edad) {
		this.nombre = nombre;
		this.numDespacho = numDespacho;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setnumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
    public void registrarCentro(){
        System.out.println("Registrando...");
    }
    public void organizarExcursiones(){
        System.out.println("Organizando excursiones ...");
    }    
}
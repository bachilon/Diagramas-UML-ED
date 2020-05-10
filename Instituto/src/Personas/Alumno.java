package Personas;

public class Alumno extends Persona {
	String nombre;
	String apellidos;
	int edad;
	
	public Alumno () {}
	public Alumno (String nombre, int edad, String apellidos) {
		this.nombre = nombre;
		this.edad = edad;
		this.apellidos = apellidos;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setDireccion(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public void atenderEnClase() {
		System.out.println("Atendiendo");
	
	}
	public void participarEnClase() {
		System.out.println("Participando");
	}
}

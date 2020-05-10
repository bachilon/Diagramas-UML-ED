package Instituto;

public class Instituto {

	String nombre;
	int numAulas;
	String direccion;
	
	public Instituto () {}
	public Instituto (String nombre, int numAulas, String direccion) {
		this.nombre = nombre;
		this.numAulas = numAulas;
		this.direccion = direccion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNumAulas(int numAulas) {
		this.numAulas = numAulas;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}
	public int getNumAulas() {
		return this.numAulas;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public void contratarProfesor() {
		System.out.println("Contratando");
	
	}
	public void matricularAlumnos() {
		System.out.println("Matriculando");
	}
}
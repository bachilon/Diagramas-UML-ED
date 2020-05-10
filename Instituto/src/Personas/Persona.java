package Personas;

		public class Persona {
	    String nombre;
	    String apellidos;
	    String dni;

	    public Persona () {}
		public Persona (String nombre, String apellidos, String fechaNacimiento, String dni) {
			this.nombre = nombre;
			this.apellidos = apellidos;
	        this.dni = dni;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
	    }
	    public void setDni(String dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return this.nombre;
		}
		public String getApellidos() {
			return this.apellidos;
	    }
	    public String getDni() {
			return this.dni;
	    }
	    
	    public void estarEnCentro() {
	        System.out.println("Estoy en el centro");
	    }
	    public void trabajarEstudiar() {
	        System.out.println("Trabajando o estudiando");
	    }
}
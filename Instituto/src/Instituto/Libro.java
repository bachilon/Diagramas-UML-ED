package Instituto;

public class Libro {

		String nombre;
		String asignatura;
		int editorial;

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public void setEditorial(int editorial) {
			this.editorial = editorial;
	    }

	    public String get() {
	        return this.nombre;
	    }
	    public int getEditorial(){
	        return this.editorial;
	    }   
	    public void prestarLibro(){
	        System.out.println("Prestado");
	    }
	    public void leerLibro(){
	        System.out.println("Leido");
	    }
	}
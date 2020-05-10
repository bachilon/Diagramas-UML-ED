package Personas;

	public class Trabajador extends Persona {
		String nombre;
		String apellidos;
		int salario;
	    
	    public Trabajador (String nombre, String apellidos, int salario){
	        this.salario = salario;
	    }
	    
	    public void setSalario(int salario) {
			this.salario = salario;
	    }    
	    public int getSalario(){
	        return this.salario;
	    }

	    public int cobrar(Trabajador trabajador) {
	        return trabajador.getSalario();
	    }
	    public void despedir() {
	        System.out.println("Despedido");
	    }
	    public void contratar(){
	        System.out.println("Contratado");
	    }
	}
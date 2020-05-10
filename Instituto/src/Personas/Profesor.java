package Personas;

import Instituto.Asignatura;

public class Profesor {

		String nombre;
		String apellidos;
		int edad;
		int horario;
		
		public Profesor () {}
		public Profesor (String nombre, String apellidos, int horario, int edad) {
			this.nombre = nombre;
			this.horario = horario;
			this.apellidos = apellidos;
			this.edad = edad;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setnumHorario(int horario) {
			this.horario = horario;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
	    public void corregirExamen(){
	        System.out.println("Examen corregido");
	        
	    }
	    public void aprobarClase(Asignatura asignatura){
	        System.out.println("Aprobando clase...");
	    }
	}
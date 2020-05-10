package Instituto;

public class Recreo {

	String actividad;
	int  capacidad;
	int  numAlumnos;
	
	public Recreo () {}
	public Recreo (String actividad,int capacidad, int numAlumnos) {
		this.actividad = actividad;
		this.capacidad = capacidad;
		this.numAlumnos = numAlumnos;
		
	}
	
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public void setnumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	
    public void suspenderExamen(){
        System.out.println("Examen suspenso...");
        
    }
    public void aprobarExamen(Asignatura asignatura){
        System.out.println("Examen aprobado");
    }
}



package Instituto;

public class Nota {

	int numAprobados;
	int  numSuspensos;
	int  numNoPresentados;
	
	public Nota () {}
	public Nota (int numAprobados,int numSuspensos, int numNoPresentados) {
		this.numAprobados = numAprobados;
		this.numSuspensos = numSuspensos;
		this.numNoPresentados = numNoPresentados;
		
	}
	
	public void setnumAprobados(int numAprobados) {
		this.numAprobados = numAprobados;
	}
	public void setnumSuspensos(int numSuspensos) {
		this.numSuspensos = numSuspensos;
	}
	public void setnumNoPresentados(int numNoPresentados) {
		this.numNoPresentados = numNoPresentados;
	}
	
    public void suspenderExamen(){
        System.out.println("Examen suspenso...");
        
    }
    public void aprobarExamen(Asignatura asignatura){
        System.out.println("Examen aprobado");
    }
}

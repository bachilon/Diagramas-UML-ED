package Instituto;

public class Asignatura {

	String nombre;
    int codigo;
    int duracion;

    public Asignatura(){}
    public Asignatura(String nombre, int curso, String[] temas){
        this.nombre = nombre;
        this.codigo = codigo;
        this.duracion = duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getCodigo() {
        return this.getCodigo();
    }
    public int getDuracion() {
        return this.duracion;
    }

    public void cursar(Asignatura asignatura){
        System.out.println("Cursando...");
    }
}


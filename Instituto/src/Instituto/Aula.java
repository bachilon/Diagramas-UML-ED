package Instituto;

public class Aula {
    int numero;
    char letra;
    int tipo;

    public Aula(){}
    public Aula(int numero, int tipo, char letra){
        this.numero = numero;
        this.tipo = tipo;
        this.letra = letra;
    }

    public void setNumero (int numero){
        this.numero = numero;
    }
    public void setPlanta(int tipo){
        this.tipo = tipo;
    }
    public void setLetra(char letra){
        this.letra = letra;
    }

    public int getNumero (){
        return this.numero;
    }
    public int getTipo(){
        return this.tipo;
    }
    public char getLetra(){
        return this.letra;
    }
    public void cerrarClase(){
        System.out.println("Cerrada");
    }
    public void abrirClase(){
        System.out.println("Abierta");
    }
}

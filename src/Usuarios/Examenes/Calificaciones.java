package Usuarios.Examenes;

public class Calificaciones implements java.io.Serializable{
    private String nombreAlu;
    private String tituExa;
    private int calificación;
    private int numeroBoleta;


    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }
    
    public String getNombreAlu() {
        return nombreAlu;
    }

    public void setNombreAlu(String nombreAlu) {
        this.nombreAlu = nombreAlu;
    }

    public String getTituExa() {
        return tituExa;
    }

    public void setTituExa(String tituExa) {
        this.tituExa = tituExa;
    }

    public int getCalificación() {
        return calificación;
    }

    public void setCalificación(int calificación) {
        this.calificación = calificación;
    }
}

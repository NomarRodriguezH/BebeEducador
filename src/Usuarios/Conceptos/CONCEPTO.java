
package Usuarios.Conceptos;

import java.io.Serializable;

public class CONCEPTO implements Serializable{
   String Concepto;
   String Tema;
   String Definicion;
   
   public CONCEPTO(String Concepto, String Tema, String Definicion){
       this.Concepto=Concepto;
       this.Tema=Tema;
       this.Definicion=Definicion;
       
   }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public String getDefinicion() {
        return Definicion;
    }

    public void setDefinicion(String Definicion) {
        this.Definicion = Definicion;
    }
   
   
   
}

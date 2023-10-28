
package Usuarios.Conceptos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializadoConceptos {
    ArrayList<ConceptoDatos> Conceptos=new ArrayList<ConceptoDatos>();
   private ObjectOutputStream oos;
   private FileOutputStream fos;
   private ObjectInputStream ois;
   private FileInputStream fis;
   
   public ConceptoDatos TraerConcepto(String Concepto){
      Conceptos=regresarConceptos();
      int pos=0;
      pos=posicion(Concepto);
      Object obj=null;
      
      if(pos>=0){
      obj=Conceptos.get(pos);
          System.out.println("terminaste");
      }else
          obj=null;
      
      return (ConceptoDatos) obj;
      
   }
   
   public void eliminar(String Concepto){
   
   Conceptos=regresarConceptos();
      int pos=0;
      pos=posicion(Concepto);
      Object obj=null;
      
      if(pos>=0){
      Conceptos.remove(pos);
          System.out.println("se elimino");
          try{
       fos = new FileOutputStream("Conceptos.info");
       oos= new ObjectOutputStream(fos);
       oos.writeObject(Conceptos);
       System.out.println("archivo hecho");
       oos.close();
       fos.close();
   
       }catch(FileNotFoundException e){
           e.printStackTrace();
       }catch(IOException e){
           e.printStackTrace();
       }
          
      }else
          obj=null;
   }
   
   public int posicion(String Concepto){
       Conceptos=regresarConceptos();
       int pos=0;
       boolean existe=false;
       int tamaño=Conceptos.size();
       
       for(int i = 0; i < tamaño; i++){
           if(Concepto.equals(Conceptos.get(i).getConcepto())){
           pos=i;
           existe=true;
           break;
           }
           if(existe==false){
           pos=-1;
           }
          
       }
        return pos;
   }
   public void modificar(String Concepto,String Tema,String Definicion){
        Conceptos=regresarConceptos();
        ConceptoDatos obj=TraerConcepto(Concepto);
        int posicion=posicion(Concepto);
        obj.setDefinicion(Definicion);
        obj.setTema(Tema);
        Conceptos.remove(posicion);
        System.out.println("se cambio el concepto");
        Conceptos.add(posicion,obj);
        System.out.println("se aññadio");
        
        try{
       fos = new FileOutputStream("Conceptos.info");
       oos= new ObjectOutputStream(fos);
       oos.writeObject(Conceptos);
       System.out.println("archivo hecho");
       oos.close();
       fos.close();
   
       }catch(FileNotFoundException e){
           e.printStackTrace();
       }catch(IOException e){
           e.printStackTrace();
       }
        
   }
   
   public ArrayList regresarConceptos(){
       try {
            fis=new FileInputStream("Conceptos.info");
            ois=new ObjectInputStream(fis);
            Conceptos=(ArrayList<ConceptoDatos>)ois.readObject();
           
            System.out.println("Archivo extraido");
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            
        } catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
       
        return Conceptos;
       
       
   }
   
   public void GuardaConcepto(ConceptoDatos obj) {
       
   Conceptos=regresarConceptos();
   Conceptos.add( obj);
   System.out.println(Conceptos.size());
   
   try{
       fos = new FileOutputStream("Conceptos.info");
       oos= new ObjectOutputStream(fos);
       oos.writeObject(Conceptos);
       System.out.println("archivo hecho");
       oos.close();
       fos.close();
   
       }catch(FileNotFoundException e){
           e.printStackTrace();
       }catch(IOException e){
           e.printStackTrace();
       }
   
   }
}
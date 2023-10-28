package Usuarios.LoginRegistro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoLAlumnos {
    ArrayList <DatosAlumno> listaRecuperada = new ArrayList<DatosAlumno>();

    public ArrayList<DatosAlumno> leer(){
        try{
            FileInputStream fis = new FileInputStream("datos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listaRecuperada = (ArrayList<DatosAlumno>) ois.readObject();
            fis.close();
            ois.close();
        }
        catch (Exception ex){
            System.out.println("El archivo se crea");
        }
        return listaRecuperada;
    }


    public void serializar(ArrayList<DatosAlumno> listaGuardar){
        try{
            FileOutputStream out = new FileOutputStream("datos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(listaGuardar);
            out.close();
            oos.close();
        }
        catch(Exception ex){
            System.out.println("Error");
        }
    }
}

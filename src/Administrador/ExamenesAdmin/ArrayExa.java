package Administrador.ExamenesAdmin;
//import Usuarios.Examenes.ArrayCalificaciones;
import Usuarios.Examenes.Calificaciones;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;

public class ArrayExa extends JFrame implements java.io.Serializable{
    ArrayList<Examen> exa = new ArrayList<Examen>();
    ArrayList<Calificaciones> califis =new ArrayList<Calificaciones>();

    public void abrir(){
        try{
            FileInputStream file = new FileInputStream("Examenes.dat");
            ObjectInputStream entrada = new ObjectInputStream(file);
            exa = (ArrayList<Examen>) entrada.readObject();
            file.close();
            entrada.close();
        }
        catch(Exception e){
            System.out.println("El archivo se crea");
        }
    }

    public void actualizar(){
        try{
            FileOutputStream fos = new FileOutputStream("Examenes.dat");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(exa);
            fos.close();
            out.close();
        }
        catch(IOException e){
            System.out.println("Error al final");
        }
    }

    public void GuardarExa(Examen objExamen){
        exa.add(objExamen);
        System.out.println(exa.size());
    }

    public int traePosicion(String titulo){
        int pos = 0;
        boolean existe = false;
        int tamano = exa.size();
        for (int i = 0; i < tamano; i++) {

            if (titulo.equals(exa.get(i).getTitulo())){
                pos = i;
                existe = true;
                break;
            }
        }
        if (existe == false){

            pos = -1;
        }
        return pos;
    }
    public Examen traerObjeto(String titulo){
        int pos = 0;
        Examen objExamen = new Examen();
        pos = traePosicion(titulo);

        if(pos >= 0){
            objExamen = exa.get(pos);
            System.out.println("titulo" + exa.get(pos).getTitulo());
        }
        else
            objExamen = null;

        return objExamen;
    }

    public int tamaño(){
        int tamaño;
        tamaño = exa.size();
        return tamaño;
    }
    public void cambiar(int pos, Examen obj){
        exa.set(pos, obj);
    }
    public void eliminar(int pos){
        exa.remove(pos);
    }
    public JTable getActualTable(){
        String rows[][] = new String[exa.size()][2];
        for(int i = 0; i < exa.size(); i++){
            //rows[i][0] = String.valueOf(i);
            rows[i][0] = exa.get(i).getTitulo();
        }
        Object [] cols ={"Titulo"};
        JTable table = new JTable(rows,cols);
        return table;
    }

 }


 


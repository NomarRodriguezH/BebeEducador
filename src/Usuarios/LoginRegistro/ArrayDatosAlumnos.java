package Usuarios.LoginRegistro;
import Administrador.CudW.DA;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
public class ArrayDatosAlumnos implements Serializable {

    ArrayList<DatosAlumno> ADatos = new ArrayList<DatosAlumno>();
    private ArchivoLAlumnos objArchivo = new ArchivoLAlumnos();
    ArrayList<DatosAlumno> Datos = new ArrayList<>();
    public ArrayDatosAlumnos() {
        ADatos = objArchivo.leer();
    }

    public void newdato(DatosAlumno objDatos) {
        ADatos.add(objDatos);
        System.out.println(ADatos.size());
    }

    public int position(int numBo) {
        int pos = 0;
        boolean existe = false;
        int tamano = ADatos.size();
        for (int i = 0; i < tamano; i++) {

            if (numBo == ADatos.get(i).getBoleta()) {
                pos = i;
                existe = true;
                break;
            }
        }

        if (existe == false) {

            pos = -1;
        }
        return pos;
    }

    public DatosAlumno llamarObj(int numBo) {
        int pos = 0;
        DatosAlumno objDato = new DatosAlumno();
        pos = position(numBo);
        if (pos >= 0) {
            objDato = ADatos.get(pos);
            System.out.println("nombre " + objDato.getNombre());
            System.out.println("Correo" + objDato.getCorreo());
            System.out.println("boleta" + objDato.getBoleta());
            System.out.println("Password" + objDato.getPassword());
            System.out.println("Grupo:" + objDato.getGrupo());
            System.out.println("Sexo:" + objDato.getSexo());
        } else
            objDato = null;

        return objDato;
    }

    public void cambiar(int pos, DatosAlumno objDato) {
        ADatos.set(pos, objDato);
        System.out.println("nombre " + ADatos.get(pos).getNombre());
        System.out.println("Correo" + ADatos.get(pos).getCorreo());
        System.out.println("boleta" + ADatos.get(pos).getBoleta());
        System.out.println("Password" + ADatos.get(pos).getPassword());
        System.out.println("Grupo:" + ADatos.get(pos).getGrupo());
        System.out.println("Sexo:" + ADatos.get(pos).getSexo());
    }

    public void guardar() {
        objArchivo.serializar(ADatos);
    }

    public JTable getActualTable() {
        String rows[][] = new String[ADatos.size()][5];
        for (int i = 0; i < ADatos.size(); i++) {
            rows[i][0] = ADatos.get(i).getNombre();
            rows[i][1] = ADatos.get(i).getSexo();
            rows[i][2] = ADatos.get(i).getCorreo();
            rows[i][3] = ADatos.get(i).getGrupo();
            rows[i][4] = String.valueOf(ADatos.get(i).getBoleta());
        }
        Object[] cols = {"Nombre", "Sexo", "Correo", "Grupo", "Boleta"};
        JTable table = new JTable(rows, cols);
        return table;
    }
    public void EliminarUsu(int i){
        ADatos.remove(i);
    }

    public ArrayList llamarcli(){

        try {
            FileInputStream fis=new FileInputStream("datos.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Datos= (ArrayList<DatosAlumno>) ois.readObject();

            System.out.println("...");
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return Datos;
    }
    public static boolean validarNumeros(String datos){
        return datos.matches("[0-9]*");
    }

}




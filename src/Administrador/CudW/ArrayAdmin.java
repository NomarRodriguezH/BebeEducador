package Administrador.CudW;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class ArrayAdmin {
    ArrayList<DA> clientes=new ArrayList<DA>();
    ArrayList<DA> clienT = new ArrayList<DA>();

    public void abrir(){
        try{
            FileInputStream file = new FileInputStream("admins.dat");
            ObjectInputStream entrada = new ObjectInputStream(file);
            clienT = (ArrayList<DA>) entrada.readObject();
            file.close();
            entrada.close();
        }
        catch(Exception e) {
            System.out.println("El archivo se crea");
        }
    }

    public void actualizar(){
        try{
            FileOutputStream fos = new FileOutputStream("admins.dat");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(clienT);
            fos.close();
            out.close();
        }
        catch(IOException e){
            System.out.println("Error al final");
        }
    }


    public void agregar(DA objCliente){
        clienT.add(objCliente);
        System.out.println(clienT.size());
    }

    public void eliminar(DA objCliente ){
        clienT.remove(objCliente);
    }


    public int traePosicion(int cedula) {
        int pos = 0;
        boolean existe = false;
        for (int i = 0; i < clienT.size(); i++) {
            if (cedula==clienT.get(i).getCedula()) {
                pos = i;
                existe = true;
                break;
            }
        }
        if (existe == false)
            pos = -1;
        return pos;
    }

    public DA traeObjeto(int Cedula){
        int pos =0;
        DA objCliente = new DA();
        pos = traePosicion(Cedula);
        if(pos >= 0){
            objCliente = clienT.get(pos);
        }
        else{
            objCliente=null;
        }
        return objCliente;
    }


    public int tamaño(){
        int tamaño;
        tamaño = clienT.size();
        return tamaño;
    }

    public void cambiar(int pos, DA objDato){
        if(pos >= 0) {
            clienT.set(pos, objDato);
            System.out.println("Nombre " + clienT.get(pos).getNombre());
            System.out.println("Beneficiario " + clienT.get(pos).getCorreo());
            System.out.println("fechaNaci " + clienT.get(pos).getCedula());
        }
    }

    public JTable getActualTable() {
        ArrayList<DA> clienT = new ArrayList<DA>();

        String rows[][] = new String[clienT.size()][3];
        for (int i = 0; i < clienT.size(); i++) {
            rows[i][0] = clienT.get(i).getNombre();
            rows[i][1] = clienT.get(i).getCorreo();
            rows[i][2] = String.valueOf(clienT.get(i).getCedula());
        }
        Object[] cols = {"Admins"};
        JTable table = new JTable(rows, cols);
        return table;
    }

    public ArrayList llamarcli(){

        try {
            FileInputStream fis=new FileInputStream("admins.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);
            clientes=(ArrayList<DA>)ois.readObject();

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
        return clientes;

    }
        public static boolean validarNumeros(String datos){
            return datos.matches("[0-9]*");
        }

}
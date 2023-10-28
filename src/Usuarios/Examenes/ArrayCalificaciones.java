
package Usuarios.Examenes;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class ArrayCalificaciones extends JFrame implements java.io.Serializable {
    ArrayList<Calificaciones> cal = new ArrayList<>();


    public ArrayList abrir() {
        try {
            FileInputStream file = new FileInputStream("Calificaciones.dat");
            ObjectInputStream entrada = new ObjectInputStream(file);
            cal = (ArrayList<Calificaciones>) entrada.readObject();
            file.close();
            entrada.close();
        } catch (Exception e) {
            System.out.println("El archivo se crea");
        }
        return cal;
    }

    public void actualizar() {
        try {
            FileOutputStream fos = new FileOutputStream("Calificaciones.dat");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(cal);
            fos.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Error al final");
        }
    }

    public void AgregarCal(Calificaciones objCal) {
        Calificaciones ob = new Calificaciones();
        ob = objCal;
        cal.add(ob);
    }
// No pudimos hacer funcionar este modulo para validar que el usuario no responda varias veces el mismo examen
   /* public boolean ValiCal(Calificaciones objCal) {
        Calificaciones ob = new Calificaciones();
        ob = objCal;
        boolean guardar;
        guardar = false;
        if(guardar == false) {
            for (int i = 0; i < cal.size(); i++) {
                if (ob.getNumeroBoleta() == cal.get(i).getNumeroBoleta()) {
                    if (ob.getTituExa().equals(cal.get(i).getTituExa())) {
                        guardar = false;
                    } else {
                        guardar = true;
                    }
                } else {
                    guardar = true;
                }
            }
        }
        System.out.println(guardar);

        return guardar;
    }

    */
}
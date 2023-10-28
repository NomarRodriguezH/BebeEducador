package Administrador;
import Administrador.CudW.*;
import Usuarios.Conceptos.ConceptosAdmi;
import Usuarios.LoginRegistro.ArrayDatosAlumnos;
import Administrador.ExamenesAdmin.GesExam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuAdmin extends JFrame {
    private ArrayDatosAlumnos alum = new ArrayDatosAlumnos();
    JLabel fondo, titulo;
    JButton volver, salir, minimizar, btnEdiatrAdmin, btnRegistrarAdmin,
            btnEliminar, conceptos, btnConsultaDatos, btnExamenes;

    public MenuAdmin(){
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true);
        accionesVentana();
        componentes();
        setVisible(true);
    }

    public void accionesVentana(){
        salir = new JButton();
        salir.setBounds(1025, 10, 50, 50);
        ImageIcon iconsito = new ImageIcon("src/Usuarios/imagenesUser/tacheSF.png");
        salir.setIcon(new ImageIcon(iconsito.getImage().getScaledInstance(salir.getWidth(), salir.getHeight(), Image.SCALE_SMOOTH )));
        salir.setContentAreaFilled(false);
        salir.setBorder(null);
        salir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(salir);
        salir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                System.exit(0);
            }
        });

        minimizar = new JButton();
        minimizar.setBounds(932, 10, 50, 50);
        ImageIcon min = new ImageIcon("src/Usuarios/imagenesUser/mini1.png");
        minimizar.setIcon(new ImageIcon(min.getImage().getScaledInstance(minimizar.getWidth(), minimizar.getHeight(), Image.SCALE_SMOOTH )));
        minimizar.setContentAreaFilled(false);
        minimizar.setBorder(null);
        minimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(minimizar);
        minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                setExtendedState(1);
            }
        });

        volver = new JButton();
        volver.setBounds(837, 10, 50, 50);
        ImageIcon vol = new ImageIcon("src/Usuarios/imagenesUser/fV.png");
        volver.setIcon(new ImageIcon(vol.getImage().getScaledInstance(volver.getWidth(), volver.getHeight(), Image.SCALE_SMOOTH )));
        volver.setContentAreaFilled(false);
        volver.setBorder(null);
        volver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(volver);
        volver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                new GrafiLoginAdm();
            }

        });
    }


    public void componentes(){
        titulo= new JLabel("Selecciona una opción ");
        titulo.setBounds(260, 60, 600, 70);
        titulo.setFont(new Font("arial black", Font.PLAIN , 40));
        add(titulo);

        btnEdiatrAdmin = new JButton();
        btnEdiatrAdmin.setBounds(25, 150, 330, 220);
        ImageIcon glass = new ImageIcon("src/Administrador/imagenesAdm/EditAdminFF.png");
        btnEdiatrAdmin.setIcon(new ImageIcon(glass.getImage().getScaledInstance(btnEdiatrAdmin.getWidth(), btnEdiatrAdmin.getHeight(), Image.SCALE_SMOOTH)));
        btnEdiatrAdmin.setOpaque(false);
        add(btnEdiatrAdmin);
        btnEdiatrAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
              dispose();
              new EditarElegir();
            }
        });

        btnRegistrarAdmin = new JButton();
        btnRegistrarAdmin.setBounds(380, 150, 330, 220);
        ImageIcon glass2 = new ImageIcon("src/Administrador/imagenesAdm/RegAdminFF.png");
        btnRegistrarAdmin.setIcon(new ImageIcon(glass2.getImage().getScaledInstance(btnRegistrarAdmin.getWidth(), btnRegistrarAdmin.getHeight(), Image.SCALE_SMOOTH)));
        add(btnRegistrarAdmin);
        btnRegistrarAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                new RegistrarAdmin();
            }
        });

        btnEliminar = new JButton();
        btnEliminar.setBounds(745, 150, 330, 220);
        ImageIcon glass3 = new ImageIcon("src/Administrador/imagenesAdm/EliminarFF.png");
        btnEliminar.setIcon(new ImageIcon(glass3.getImage().getScaledInstance(btnEliminar.getWidth(), btnEliminar.getHeight(), Image.SCALE_SMOOTH)));
        btnEliminar.setOpaque(false);
        add(btnEliminar);
        btnEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int seleccion = JOptionPane.showOptionDialog( null,"Seleccione una opcion",
                        "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,null,
                        new Object[] { "Eliminar Admin", "Eliminar User" },"ELiminar User");
                if (seleccion == 0){
                    dispose();
                    new EliminarAdmin();
                }
                if (seleccion==1){
                    dispose();
                    new EliminarUsu();
                }
            }
        });

        conceptos = new JButton();
        conceptos.setBounds(25, 405, 330, 220);
        ImageIcon glass4 = new ImageIcon("src/Administrador/imagenesAdm/GesAdmin.png");
        conceptos.setIcon(new ImageIcon(glass4.getImage().getScaledInstance(conceptos.getWidth(), conceptos.getHeight(), Image.SCALE_SMOOTH)));
        conceptos.setOpaque(false);
        add(conceptos);
        conceptos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                ConceptosAdmi iniciar=new ConceptosAdmi();
                iniciar.setVisible(true);
            }
        });

        btnConsultaDatos = new JButton();
        btnConsultaDatos.setBounds(380, 405, 330, 220);
        ImageIcon glass5 = new ImageIcon("src/Administrador/imagenesAdm/ConsultarFF.png");
        btnConsultaDatos.setIcon(new ImageIcon(glass5.getImage().getScaledInstance(btnConsultaDatos.getWidth(), btnConsultaDatos.getHeight(), Image.SCALE_SMOOTH)));
        btnConsultaDatos.setOpaque(false);
        add(btnConsultaDatos);
        btnConsultaDatos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
               new BuscarElegir();
                // int numBo;
                //numBo = Integer.parseInt((JOptionPane.showInputDialog(null, new JScrollPane(alum.getActualTable()), "Ingrese el numero de boleta del alumno: ", JOptionPane.INFORMATION_MESSAGE)));
                //DatosAlumno obj = new DatosAlumno();
                //obj = alum.llamarObj(numBo);
            }
        });

        btnExamenes = new JButton();
        btnExamenes.setBounds(750, 405, 330, 220);
        ImageIcon glass6 = new ImageIcon("src/Administrador/imagenesAdm/ExamenesFF.png");
        btnExamenes.setIcon(new ImageIcon(glass6.getImage().getScaledInstance(btnExamenes.getWidth(), btnExamenes.getHeight(), Image.SCALE_SMOOTH)));
        add(btnExamenes);
        btnExamenes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                new GesExam();
            }
        });

        fondo = new JLabel();
        setSize(1100, 650);
        add(fondo);
        ImageIcon icon2 = new ImageIcon("src/Administrador/imagenesAdm/fondoazul.jpg");
        Image recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        fondo.setIcon(newIcon);
    }
}

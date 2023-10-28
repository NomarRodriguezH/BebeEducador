package Administrador.ExamenesAdmin;
import Administrador.MenuAdmin;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class GesExam extends JFrame {
    private JButton jbAgreExam;
    private JButton jbConsulExam;
    private JButton jbModiExam;
    private JButton jbEliExam;
    private JLabel jlGesexam;
    JLabel fondo;
    JButton salir, minimizar, volver;

    public GesExam(){
        setLayout(null);
        setSize(1100,650);
        setLocationRelativeTo(null);
        setUndecorated(true);
        accionesVentana();
        iniciarComponentes();
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
                new MenuAdmin();
            }
        });
    }

    public void iniciarComponentes(){
        ArrayExa exa = new ArrayExa();
        jlGesexam = new JLabel("Gestionar examenes");
        jlGesexam.setBounds(460, 5, 485, 220);
        jlGesexam.setFont(new Font("arial black", Font.PLAIN , 20));
        add(jlGesexam);

        jbAgreExam = new  JButton("Ver calificaciónes");
        jbAgreExam.setBounds(45,135,485, 239);
        ImageIcon calis = new ImageIcon("src/Administrador/imagenesAdm/verCalis.png");
        jbAgreExam.setIcon(new ImageIcon(calis.getImage().getScaledInstance(jbAgreExam.getWidth(), jbAgreExam.getHeight(), Image.SCALE_SMOOTH)));
        jbAgreExam.setOpaque(false);
        add(jbAgreExam);
        jbAgreExam.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                new DesplegadoE();
            }
        });

        jbConsulExam = new  JButton("Agregar Examen");
        jbConsulExam.setBounds(575,135,485, 239);
        ImageIcon busc = new ImageIcon("src/Administrador/imagenesAdm/NewExamen.png");
        jbConsulExam.setIcon(new ImageIcon(busc.getImage().getScaledInstance(jbConsulExam.getWidth(), jbConsulExam.getHeight(), Image.SCALE_SMOOTH)));
        jbConsulExam.setOpaque(false);
        add(jbConsulExam);
        jbConsulExam.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
               new AgregarExam();
            }
        });

        jbModiExam = new  JButton("Modificar Examen");
        jbModiExam.setBounds(45,400,485, 239);
        ImageIcon change = new ImageIcon("src/Administrador/imagenesAdm/ModiExam.png");
        jbModiExam.setIcon(new ImageIcon(change.getImage().getScaledInstance(jbModiExam.getWidth(), jbModiExam.getHeight(), Image.SCALE_SMOOTH)));
        jbModiExam.setOpaque(false);
        add(jbModiExam);
        jbModiExam.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {

                exa.abrir();
                String titulo;
                titulo =(JOptionPane.showInputDialog(null, new JScrollPane(exa.getActualTable()), "Ingrese el titulo del examen que quiere cambiar: ", JOptionPane.INFORMATION_MESSAGE));
                Examen obj = new Examen();
                obj = exa.traerObjeto(titulo);
                if(obj!=null){
                    dispose();
                    ModificarExam modi = new ModificarExam(titulo);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Examen no encontrado");
                }
            }
        });


        jbEliExam = new  JButton("Eliminar Examen");
        //jbEliExam.setBackground(new Color(0, 0, 0));
        jbEliExam.setBounds(575,400,485, 240);
        ImageIcon fueraa = new ImageIcon("src/Administrador/imagenesAdm/EliExamen.png");
        jbEliExam.setIcon(new ImageIcon(fueraa.getImage().getScaledInstance(jbEliExam.getWidth(), jbEliExam.getHeight(), Image.SCALE_SMOOTH)));
        add(jbEliExam);
        jbEliExam.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                exa.abrir();
                String titulo;
                titulo =(JOptionPane.showInputDialog(null, new JScrollPane(exa.getActualTable()), "Ingrese el titulo del examen que quiere eliminar: ", JOptionPane.INFORMATION_MESSAGE));
                Examen obj = new Examen();
                obj = exa.traerObjeto(titulo);
                if(obj!=null){
                    dispose();
                    EliminarExam eli = new EliminarExam(titulo);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Examen no encontrado");
                }
            }
        });
        fondo= new JLabel();
        fondo.setSize(1100, 650);
        add(fondo);
        ImageIcon icon2 = new ImageIcon("src/Usuarios/imagenesUser/fondoazul.jpg");
        Image recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        fondo.setIcon(newIcon);
    }

    public static void main(String[] args) {
        new GesExam();
    }

}


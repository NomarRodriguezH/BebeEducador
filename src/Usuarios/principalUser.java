package Usuarios;
import Usuarios.Examenes.ResponderExa;
import Administrador.ExamenesAdmin.ArrayExa;
import Administrador.ExamenesAdmin.Examen;
//import Usuarios.Usuarios.Ahorcado.run.AOR;
import Usuarios.Ahorcado.AOR;
import Usuarios.Conceptos.*;
import Usuarios.Linea.Boceto.LineaTiempo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class principalUser extends JFrame {
    JLabel fondo, lblGlass, titulo;
    private JLabel num;
    private ArrayExa examen;
    JButton btnExamenes, btnLinea, btnConceptos, btcAhorcado, salir, minimizar;

    public principalUser(int numBo) {
        setLayout(null);
        setSize(1100, 650);
        setUndecorated(true);
        setResizable(false);
        accionesVentana(1);
        setLocationRelativeTo(null);
        componentes(numBo);
        setVisible(true);
    }

    public principalUser(String text) {
    }

    public void accionesVentana(int numBo){
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
    }

    public void componentes(int numBo) {
        num = new JLabel(String.valueOf(numBo));

        btnExamenes = new JButton();
        btnExamenes.setBounds(35, 135, 480, 227);
        ImageIcon glass2 = new ImageIcon("src/Usuarios/imagenesUser/Examenes.png");
        btnExamenes.setIcon(new ImageIcon(glass2.getImage().getScaledInstance(btnExamenes.getWidth(), btnExamenes.getHeight(), Image.SCALE_SMOOTH)));
        btnExamenes.setOpaque(false);
        add(btnExamenes);

        btnExamenes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                examen = new ArrayExa();
                examen.abrir();
                String titulo;
                int numBo = Integer.parseInt(num.getText());
               titulo = (JOptionPane.showInputDialog(null, new JScrollPane(examen.getActualTable()), "Ingrese el titulo del examen que quiere cambiar: ", JOptionPane.INFORMATION_MESSAGE));
                Examen obj = new Examen();
                obj = examen.traerObjeto(titulo);
                if (obj != null) {
                    dispose();
                new ResponderExa(titulo, numBo);
                }
            }
        });

        btnConceptos = new JButton();
        btnConceptos.setBounds(587, 135, 480, 227);
        ImageIcon concep = new ImageIcon("src/Usuarios/imagenesUser/Conceptos.png");
        btnConceptos.setIcon(new ImageIcon(concep.getImage().getScaledInstance(btnConceptos.getWidth(), btnConceptos.getHeight(), Image.SCALE_SMOOTH)));
        btnConceptos.setOpaque(false);
        add(btnConceptos);

        btnConceptos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose(    );
                ConceptosUsuario iniciar=new ConceptosUsuario(Integer.parseInt(num.getText()));
                iniciar.setVisible(true);
            }
        });


        btnLinea = new JButton();
        btnLinea.setBounds(35, 392, 480, 227);
        ImageIcon linea = new ImageIcon("src/Usuarios/imagenesUser/Linea.png");
        btnLinea.setIcon(new ImageIcon(linea.getImage().getScaledInstance(btnLinea.getWidth(), btnLinea.getHeight(), Image.SCALE_SMOOTH)));
        btnLinea.setOpaque(false);
        add(btnLinea);

        btnLinea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                new LineaTiempo(Integer.parseInt(num.getText()));
            }
        });


        btcAhorcado = new JButton();
        btcAhorcado.setBounds(587, 392, 480, 227);
        ImageIcon ahor = new ImageIcon("src/Usuarios/imagenesUser/AHOR.png");
        btcAhorcado.setIcon(new ImageIcon(ahor.getImage().getScaledInstance(btcAhorcado.getWidth(), btcAhorcado.getHeight(), Image.SCALE_SMOOTH)));
        btcAhorcado.setOpaque(false);
        add(btcAhorcado);
        btcAhorcado.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                new AOR(Integer.parseInt(num.getText()));
            }
        });


        ImageIcon glass = new ImageIcon("src/Usuarios/imagenesUser/glassbien.png");
        lblGlass = new JLabel();
        lblGlass.setBounds(200, 180, 600, 550);
        lblGlass.setIcon(new ImageIcon(glass.getImage().getScaledInstance(lblGlass.getWidth(), lblGlass.getHeight(), Image.SCALE_SMOOTH)));
        lblGlass.setOpaque(false);
        lblGlass.setVisible(false);
        add(lblGlass);

        titulo= new JLabel("Selecciona una opción ");
        titulo.setBounds(260, 60, 600, 70);
        titulo.setFont(new Font("arial black", Font.PLAIN , 40));
        add(titulo);

        fondo = new JLabel();
        fondo.setSize(1100, 650);
        ImageIcon icon2 = new ImageIcon("src/Usuarios/imagenesUser/fondoazul.jpg");
        Image recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        add(fondo);
        fondo.setIcon(newIcon);
    }
}



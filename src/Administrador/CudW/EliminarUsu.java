package Administrador.CudW;

import Administrador.MenuAdmin;
import Usuarios.LoginRegistro.ArrayDatosAlumnos;
import Usuarios.LoginRegistro.DatosAlumno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EliminarUsu extends JFrame implements ActionListener {
    private JLabel fondo, lblGlass;
    private JButton minimizar, salir, volver;
    JButton btnComprobar;
    JLabel lblnumBo;
    JTextField txtnumBo;
    private ArrayDatosAlumnos ad;
    private JButton btnUser, btnAdmin;
    private DatosAlumno datos;

    public EliminarUsu() {
        ad = new ArrayDatosAlumnos();
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
        ImageIcon iconsito = new ImageIcon("src/Usuarios/imagenesUser/BtnSalirF.png");
        salir.setIcon(new ImageIcon(iconsito.getImage().getScaledInstance(salir.getWidth(), salir.getHeight(),
                Image.SCALE_SMOOTH )));
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
        minimizar.setIcon(new ImageIcon(min.getImage().getScaledInstance(minimizar.getWidth(),
                minimizar.getHeight(), Image.SCALE_SMOOTH )));
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

    public void componentes() {
        btnUser = new JButton("");
        lblnumBo = new JLabel("Ingresa la boleta del alumno a eliminar:");
        lblnumBo.setBounds(41, 340, 340, 45);
        lblnumBo.setFont(new Font("arial black", Font.PLAIN , 10));
        add(lblnumBo);
        txtnumBo = new JTextField();
        txtnumBo.setBounds(380, 340, 227, 45);
        add(txtnumBo);
        btnComprobar = new JButton("Comprobar");
        btnComprobar.setBounds(700, 340, 100, 45);
        add(btnComprobar);
        btnComprobar.addActionListener(this);

        ImageIcon glass = new ImageIcon("src/imagenes/glassbien.png");
        lblGlass = new JLabel();
        lblGlass.setBounds(200, 180, 600, 550);
        lblGlass.setIcon(new ImageIcon(glass.getImage().getScaledInstance(lblGlass.getWidth(), lblGlass.getHeight(), Image.SCALE_SMOOTH)));
        lblGlass.setOpaque(false);
        add(lblGlass);

        fondo = new JLabel();
        setSize(1100, 650);
        add(fondo);
        ImageIcon icon2 = new ImageIcon("src/Administrador/imagenesAdm/fondoazul.jpg");
        var recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        fondo.setIcon(newIcon);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnComprobar)) {
            int pos = 0;
            datos = new DatosAlumno();
            int cedu = Integer.parseInt(txtnumBo.getText());
            pos = ad.position(Integer.parseInt(txtnumBo.getText()));
            datos = ad.llamarObj(cedu);
            if (datos != null) {

                int i = JOptionPane.showConfirmDialog(null,
                        "¿Quieres eiminar a " + datos.getNombre() + " ?", "Usuario Encontrado", JOptionPane.YES_NO_OPTION);

                if (i == JOptionPane.YES_OPTION) {
                    ad.EliminarUsu(pos);
                    ad.guardar();
                    JOptionPane.showMessageDialog(null, "Se borro");


                } else if (i == JOptionPane.NO_OPTION) {
                    JOptionPane.showConfirmDialog(this, "Operacion cancelada");
                }
            } else
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    }
}





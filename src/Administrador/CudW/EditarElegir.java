package Administrador.CudW;

import Administrador.MenuAdmin;
import Usuarios.LoginRegistro.ArrayDatosAlumnos;
import Usuarios.principalUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditarElegir extends JFrame{
    JButton salir, minimizar, volver, btnAdmin, btnUser;
    JLabel fondo;

    public EditarElegir(){
        setLayout(null);
        setSize(1100, 650);
        setResizable(false);
        setLocationRelativeTo(null);
        accionesVentana();
        setUndecorated(true);
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
                int numBo;
                new MenuAdmin();
            }
        });
    }

    public void  componentes(){
        btnAdmin = new JButton();
        btnAdmin.setBounds(50, 165, 430, 385);
        ImageIcon glass3 = new ImageIcon("src/Administrador/imagenesAdm/EditAdmin.png");
        btnAdmin.setIcon(new ImageIcon(glass3.getImage().getScaledInstance(btnAdmin.getWidth(),
                btnAdmin.getHeight(), Image.SCALE_SMOOTH)));
        btnAdmin.setOpaque(false);
        add(btnAdmin);
        btnAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                new ModificarAdmin();
            }
        });


        btnUser = new JButton();
        btnUser.setBounds(578, 165, 430, 385);
        ImageIcon g = new ImageIcon("src/Administrador/imagenesAdm/EditUS.png");
        btnUser.setIcon(new ImageIcon(g.getImage().getScaledInstance(btnUser.getWidth(), btnUser.getHeight(),
                Image.SCALE_SMOOTH)));
        btnUser.setOpaque(false);
        add(btnUser);
        btnUser.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                new ModificarUsu();
            }
        });

        fondo= new JLabel();
        fondo.setBounds(0, 0, 1100, 650);
        add(fondo);
        ImageIcon icon2 = new ImageIcon("src/Usuarios/imagenesUser/fondoazul.jpg");
        Image recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        fondo.setIcon(newIcon);
    }
}




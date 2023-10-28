package Administrador.CudW;
import Administrador.MenuAdmin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BuscarElegir extends JFrame {
    JButton salir, volver, minimizar, btnUsers, btnAdmins;
    JLabel fondo;

    public BuscarElegir(){
        setLayout(null);
        setSize(1100, 650);
        accionesVentana();
        setResizable(false);
        setLocationRelativeTo(null);
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
                new MenuAdmin();
            }
        });
    }

    public void componentes(){
        btnAdmins = new JButton();
        btnAdmins.setBounds(50, 165, 430, 385);
        ImageIcon ad = new ImageIcon("src/Administrador/imagenesAdm/BuscarAdmin.png");
        btnAdmins.setIcon(new ImageIcon(ad.getImage().getScaledInstance(btnAdmins.getWidth(),
                btnAdmins.getHeight(), Image.SCALE_SMOOTH)));
        btnAdmins.setOpaque(false);
        add(btnAdmins);
        btnAdmins.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int seleccion = JOptionPane.showOptionDialog( null,"Seleccione una opcion",
                        "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,null,
                        new Object[] { "Dato Particular", "Todos Los Datos" },"Dato Particular");

                if (seleccion == 0){
                    dispose();
                    new BuscarAdmin();
                }
                if (seleccion==1){
                    dispose();
                    new Desplegar();
                }
            }
        });


        btnUsers = new JButton();
        btnUsers.setBounds(578, 165, 430, 385);
        ImageIcon g = new ImageIcon("src/Administrador/imagenesAdm/BuscarUser.png");
        btnUsers.setIcon(new ImageIcon(g.getImage().getScaledInstance(btnUsers.getWidth(), btnUsers.getHeight(),
                Image.SCALE_SMOOTH)));
        btnUsers.setOpaque(false);
        add(btnUsers);
        btnUsers.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int seleccion = JOptionPane.showOptionDialog( null,"Seleccione una opcion",
                        "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,null,
                        new Object[] { "Dato Particular", "Todos Los Datos" },"Dato Particular");
                if (seleccion == 0){
                    dispose();
                    new BuscarUser();
                }
                if (seleccion==1){
                    dispose();
                    new DesplegarUsu();
                }
            }
        });


        fondo= new JLabel();
        fondo.setBounds(0, 0, 1100, 650);
        add(fondo);
        ImageIcon icon2 = new ImageIcon("src/Administrador/imagenesAdm/fondoazul.jpg");
        Image recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        fondo.setIcon(newIcon);
    }
}

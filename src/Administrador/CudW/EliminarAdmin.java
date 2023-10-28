package Administrador.CudW;

import Administrador.MenuAdmin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EliminarAdmin extends JFrame implements ActionListener {
    JButton salir, minimizar, volver;
    private  JLabel fondo;
    private JButton btnBuscar;
    private JLabel lblCedula;
    private JTextField txtCedula;
    private ArrayAdmin adm;


    public EliminarAdmin(){
        adm = new ArrayAdmin();
        adm.abrir();
        setLayout(null);
        setSize(1100, 650);
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


    public void iniciarComponentes () {

        lblCedula = new JLabel("Ingresa la cedula  para eliminar: ");
        lblCedula.setBounds(80, 170,  300,50 );
        lblCedula.setFont(new Font("arial black", Font.PLAIN , 10));
        add(lblCedula);

        txtCedula = new JTextField();
        txtCedula.setBounds(415, 170, 250, 50);
        add(txtCedula);

        btnBuscar= new JButton("Comprobar");
        btnBuscar.setBounds(750, 170, 150,50);
        btnBuscar.addActionListener(this);
        add(btnBuscar);

        fondo= new JLabel();
        fondo.setSize(1100, 650);
        add(fondo);
        ImageIcon icon2 = new ImageIcon("src/Usuarios/imagenesUser/amarillo-con-textura.jpg");
        Image recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        fondo.setIcon(newIcon);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Comprobar")){
            int pos = 0;
            adm.abrir();
            DA cliente = new DA();
            int cedula;
            cedula = Integer.parseInt(txtCedula.getText());
            pos = adm.traePosicion(Integer.parseInt(txtCedula.getText()));
            cliente = adm.traeObjeto(cedula);
            if(cliente != null) {

                int i = JOptionPane.showConfirmDialog(null,
                        "¿Quieres eiminar a "+cliente.getNombre()+" ?", "Admin Encontrado", JOptionPane.YES_NO_OPTION);

                if(i==JOptionPane.YES_OPTION) {
                    adm.eliminar(cliente);
                    adm.actualizar();
                    JOptionPane.showMessageDialog(null,"Se borro");

                }else if (i==JOptionPane.NO_OPTION){
                    JOptionPane.showConfirmDialog(this, "Operacion cancelada");
                }
            }
            else
                JOptionPane.showMessageDialog(null,"Admin no encontrado");
        }
    }

}


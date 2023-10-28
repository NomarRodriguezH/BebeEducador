package Administrador.CudW;

import Administrador.MenuAdmin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BuscarAdmin extends JFrame implements ActionListener {
    private JLabel buscarCedula;
    private JTextField cedu;
    private JButton buscar;
    private ArrayAdmin admin;
    private JLabel lblNombre;
    private JLabel lblCorreo;
    private JLabel lblcedula;
    private JLabel lblMateria;
    private JLabel lblSexo;
    private JLabel fondo;
    JButton salir, minimizar, volver;

    public BuscarAdmin() {
        admin = new ArrayAdmin();
        admin.abrir();
        setLayout(null);
        setSize(1100, 650);
        setUndecorated(true);
        setLocationRelativeTo(null);
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
                //int numBo;
                //numBo = Integer.parseInt(bole.getText());
                new BuscarElegir();
            }
        });
    }

    public void iniciarComponentes() {
        buscarCedula = new JLabel("Ingresa la cedula para buscar:");
        buscarCedula.setBounds(50, 200, 280, 20);
        buscarCedula.setFont(new Font("arial black", Font.PLAIN , 13));
        add(buscarCedula);

        cedu = new JTextField();
        cedu.setBounds(300, 200, 200, 20);
        add(cedu);

        lblNombre = new JLabel();
        lblNombre.setBounds(50, 250, 400, 20);
        add(lblNombre);

        lblCorreo = new JLabel();
        lblCorreo.setBounds(50, 350, 400, 20);
        add(lblCorreo);

        lblcedula = new JLabel();
        lblcedula.setBounds(50, 400, 400, 20);
        add(lblcedula);

        lblMateria = new JLabel();
        lblMateria.setBounds(50, 450, 400, 20);
        add(lblMateria);

        lblSexo = new JLabel();
        lblSexo.setBounds(50, 500, 400, 20);
        add(lblSexo);

        buscar = new JButton("Buscar Admin");
        buscar.setBounds(300, 400, 200, 50);
        add(buscar);
        buscar.addActionListener(this);

        fondo = new JLabel();
        fondo.setSize(1100, 650);
        ImageIcon icon2 = new ImageIcon("src/Administrador/imagenesAdm/fondoazul.jpg");
        var recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        add(fondo);
        fondo.setIcon(newIcon);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(buscar)) {
            admin.abrir();
            lblNombre.setText("");
            lblCorreo.setText("");
            lblcedula.setText("");
            lblMateria.setText("");
            lblSexo.setText("");
            DA cliente = new DA();
            int cedula;
            cedula = Integer.parseInt(cedu.getText());
            cliente = admin.traeObjeto(Integer.parseInt(String.valueOf(cedula)));
            if (cliente != null) {
                JOptionPane.showMessageDialog(null, "Admin encontrado");
                lblNombre.setText("Nombre del admin: " + cliente.getNombre());
                lblCorreo.setText("Correo: " + cliente.getCorreo());
                lblcedula.setText("Cedula: : " +String.valueOf(cliente.getCedula()));
                lblMateria.setText("Materia Impartida: " + cliente.getMateria());
                lblSexo.setText("Sexo: " + cliente.getSexo());
            }
            else {
                JOptionPane.showMessageDialog(null, "Admin no encontrado");
            }
        }

    }
}




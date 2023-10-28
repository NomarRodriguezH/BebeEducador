package Administrador.CudW;
import Usuarios.LoginRegistro.ArrayDatosAlumnos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Usuarios.LoginRegistro.DatosAlumno;

public class BuscarUser extends JFrame implements ActionListener {
    private JLabel buscarUser;
    private JTextField txtxBoleta;
    private JButton buscar;
    private ArrayDatosAlumnos alumnos;
    private JLabel lblNombre;
    private JLabel lblCorreo;
    private JLabel lblBoleta;
    private JLabel lblGrupo;
    private JLabel lblSexo;
    private JLabel fondo;
    JButton salir, minimizar, volver;

    public BuscarUser() {
        alumnos = new ArrayDatosAlumnos();
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
                new BuscarElegir();
            }
        });
    }

    public void iniciarComponentes() {
        buscarUser = new JLabel("Ingresa la boleta para buscar:");
        buscarUser.setBounds(50, 200, 280, 20);
        buscarUser.setFont(new Font("arial black", Font.PLAIN , 10));
        add(buscarUser);

        txtxBoleta = new JTextField();
        txtxBoleta.setBounds(300, 200, 200, 20);
        add(txtxBoleta);

        lblNombre = new JLabel();
        lblNombre.setBounds(50, 250, 400, 20);
        add(lblNombre);

        lblCorreo = new JLabel();
        lblCorreo.setBounds(50, 350, 400, 20);
        add(lblCorreo);

        lblBoleta = new JLabel();
        lblBoleta.setBounds(50, 400, 400, 20);
        add(lblBoleta);

        lblGrupo = new JLabel();
        lblGrupo.setBounds(50, 450, 400, 20);
        add(lblGrupo);

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
            lblNombre.setText("");
            lblCorreo.setText("");
            lblBoleta.setText("");
            lblGrupo.setText("");
            lblSexo.setText("");
            DatosAlumno ALUMNO = new DatosAlumno();
            int numBo;
            numBo = Integer.parseInt(txtxBoleta.getText());
            ALUMNO = alumnos.llamarObj(numBo);
            System.out.println(numBo);
            if (ALUMNO != null) {
                JOptionPane.showMessageDialog(null, "Alumno encontrado");
                lblNombre.setText("Nombre del alumno: " + ALUMNO.getNombre());
                lblCorreo.setText("Correo: " + ALUMNO.getCorreo());
                lblBoleta.setText("Num boleta: : " +String.valueOf(ALUMNO.getBoleta()));
                lblGrupo.setText("Grupo : " + ALUMNO.getGrupo());
                lblSexo.setText("Sexo: " + ALUMNO.getSexo());
            }
            else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }
        }
    }
}




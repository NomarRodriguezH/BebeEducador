package Administrador.CudW;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Administrador.MenuAdmin;
import Usuarios.LoginRegistro.ArrayDatosAlumnos;
import Usuarios.LoginRegistro.DatosAlumno;

public class ModificarUsu extends JFrame implements ActionListener{

    private JLabel lblNombre, lblCorreo, lblBoleta, lblPassword, lblGrupo, mensaje, fondo, nuevodato;
    private JTextField txtGrupo, txtCorreo, txtBoleta, txtPassword;
    private JButton btnmodificar, btnPassword, btnCorreo, btnGrupo, volver;
    private JTextField txtCorreOrigi, txtGrupoOrigi, txtPasswordOrigi;
    private JButton minimizar, salir;
    private JLabel lblNuevoGrupo, lblNuevoCorrreo, lblNuevoPassword;
    private ArrayDatosAlumnos alumno;


    public ModificarUsu() {
        DatosAlumno ALUMNO =  new DatosAlumno();
        alumno = new ArrayDatosAlumnos();
        setLayout(null);
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setUndecorated(true);
        accionesVentana();
        componentes();
        setVisible(true);
    }


    private void componentes() {
        mensaje = new JLabel("Seleciona la opción a modificar");
        mensaje.setBounds(400, 80, 2500, 50);
        mensaje.setFont(new Font("arial black", Font.PLAIN , 13));
        add(mensaje);

        btnCorreo = new JButton("Correo");
        btnCorreo.setBounds(65, 180, 160, 55);
        btnCorreo.addActionListener(this);
        add(btnCorreo);

        btnGrupo = new JButton("Grupo");
        btnGrupo.setBounds(335, 180, 160, 55);
        btnGrupo.addActionListener(this);
        add(btnGrupo);

        btnPassword = new JButton("Contraseña");
        btnPassword.setBounds(603, 180, 160, 55);
        btnPassword.addActionListener(this);
        add(btnPassword);

        lblBoleta = new JLabel("Ingresa el número de boleta");
        lblBoleta.setBounds(65, 290, 190, 45);
        add(lblBoleta);

        txtBoleta = new JTextField();
        txtBoleta.setBounds(335, 290, 280, 45);
        add(txtBoleta);


        lblNombre = new JLabel("Nombre del alumno a modificar");
        lblNombre.setBounds(65, 420, 180, 45);
        lblNombre.setVisible(false);
        add(lblNombre);

        lblCorreo = new JLabel("Correo del alumno:");
        lblCorreo.setBounds(65, 420, 180, 45);
        lblCorreo.setVisible(false);
        add(lblCorreo);

        lblGrupo = new JLabel("Grupo del alumno:");
        lblGrupo.setBounds(65, 420, 180, 45);
        lblGrupo.setVisible(false);
        add(lblGrupo);

        lblPassword = new JLabel("Contraseña del Alumno");
        lblPassword.setBounds(65, 420, 180, 45);
        lblPassword.setVisible(false);
        add(lblPassword);

        nuevodato = new JLabel("Nuevos datos:");
        nuevodato.setBounds(605, 420, 180, 45);
        nuevodato.setVisible(false);
        add(nuevodato);

        lblNuevoCorrreo = new JLabel("Nuevo Correo:");
        lblNuevoCorrreo.setBounds(605, 420, 180, 45);
        lblNuevoCorrreo.setVisible(false);
        add(lblNuevoCorrreo);

        lblNuevoGrupo = new JLabel("Nuevo Grupo:");
        lblNuevoGrupo.setBounds(605, 420, 180, 45);
        lblNuevoGrupo.setVisible(false);
        add(lblNuevoGrupo);

        lblNuevoPassword = new JLabel("Nueva Contraseña:");
        lblNuevoPassword.setBounds(605, 420, 180, 45);
        lblNuevoPassword.setVisible(false);
        add(lblNuevoPassword);


        txtCorreOrigi = new JTextField("");
        txtCorreOrigi.setBounds(330, 420, 120, 45);
        txtCorreOrigi.setEditable(false);
        txtCorreOrigi.setVisible(false);
        add(txtCorreOrigi);

        txtGrupoOrigi = new JTextField("");
        txtGrupoOrigi.setBounds(330, 420, 120, 45);
        txtGrupoOrigi.setEditable(false);
        txtGrupoOrigi.setVisible(false);
        add(txtGrupoOrigi);

        txtPasswordOrigi = new JTextField();
        txtPasswordOrigi.setBounds(330, 420, 120, 45);
        txtPasswordOrigi.setVisible(false);
        add(txtPasswordOrigi);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(860, 420, 160, 45);
        txtCorreo.setVisible(false);
        add(txtCorreo);

        txtGrupo = new JTextField();
        txtGrupo.setBounds(860, 420, 160, 45);
        txtGrupo.setVisible(false);
        add(txtGrupo);

        txtPassword = new JTextField();
        txtPassword.setBounds(860, 420, 160, 45);
        txtPassword.setVisible(false);
        add(txtPassword);

        btnmodificar = new JButton("Modificar");
        btnmodificar.setBounds(465, 555, 160, 60);
        btnmodificar.addActionListener(this);
        add(btnmodificar);

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
                new EditarElegir();
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String tipo = e.getActionCommand();
        DatosAlumno ALUMNO = new DatosAlumno();

        if (tipo.equals("Correo")) {
            txtCorreo.setVisible(true);
            txtCorreOrigi.setVisible(true);
            lblCorreo.setVisible(true);
            lblNuevoCorrreo.setVisible(true);
            lblGrupo.setVisible(false);

            txtGrupo.setVisible(false);
            txtGrupoOrigi.setVisible(false);
            lblPassword.setVisible(false);
            txtPasswordOrigi.setVisible(false);
            txtPassword.setVisible(false);
            lblNuevoPassword.setVisible(false);
            lblNuevoGrupo.setVisible(false);
            lblNuevoGrupo.setVisible(false);


            int boleta = Integer.parseInt(txtBoleta.getText());
            ALUMNO = alumno.llamarObj(boleta);


            if (ALUMNO != null) {
                txtCorreOrigi.setText(ALUMNO.getCorreo());

                btnmodificar.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent evt) {
                        int pos;
                        DatosAlumno ALUMNO = new DatosAlumno();
                        ALUMNO = alumno.llamarObj(Integer.parseInt(txtBoleta.getText()));
                        pos = alumno.position(Integer.parseInt(txtBoleta.getText()));
                        System.out.println("posición " + pos);

                        ALUMNO.setCorreo(txtCorreo.getText());

                        alumno.cambiar(pos, ALUMNO);
                        alumno.guardar();
                        JOptionPane.showMessageDialog(null, "Correo modificado");

                    }
                });

            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }
        }


        if (tipo.equals("Grupo")) {
            txtGrupo.setVisible(true);
            txtGrupoOrigi.setVisible(true);
            lblGrupo.setVisible(true);

            lblNuevoCorrreo.setVisible(false);
            lblNuevoPassword.setVisible(false);
            lblNuevoGrupo.setVisible(true);

            txtPasswordOrigi.setVisible(false);
            txtPassword.setVisible(false);
            lblPassword.setVisible(false);
            txtCorreo.setVisible(false);
            txtCorreOrigi.setVisible(false);
            lblCorreo.setVisible(false);

            int numBo = Integer.parseInt(txtBoleta.getText());
            ALUMNO = alumno.llamarObj(numBo);

            if (ALUMNO != null) {
                txtGrupoOrigi.setText(ALUMNO.getGrupo());
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }


            btnmodificar.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    int pos;
                    DatosAlumno objDatos = new DatosAlumno();
                    objDatos = alumno.llamarObj(Integer.parseInt(txtBoleta.getText()));
                    pos = alumno.position(Integer.parseInt(txtBoleta.getText()));
                    System.out.println("posición " + pos);

                    objDatos.setGrupo(txtGrupo.getText());

                    alumno.cambiar(pos, objDatos);
                    alumno.guardar();
                    JOptionPane.showMessageDialog(null, "Grupo modificado");
                }
            });

        }

        if (tipo.equals("Contraseña")) {
            txtPasswordOrigi.setVisible(true);
            txtPassword.setVisible(true);
            lblPassword.setVisible(true);
            lblGrupo.setVisible(false);
            lblNuevoGrupo.setVisible(false);
            lblNuevoPassword.setVisible(true);
            lblNuevoGrupo.setVisible(false);
            txtGrupoOrigi.setVisible(false);
            txtGrupo.setVisible(false);
            lblCorreo.setVisible(false);
            txtCorreo.setVisible(false);
            txtCorreOrigi.setVisible(false);
            lblNombre.setVisible(false);

            int numBo = Integer.parseInt(txtBoleta.getText());
            ALUMNO = alumno.llamarObj(numBo);

            if (ALUMNO != null) {

                txtPasswordOrigi.setText(ALUMNO.getPassword());
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }


            btnmodificar.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt){
                    int pos;
                    DatosAlumno objDatos = new DatosAlumno();
                    objDatos = alumno.llamarObj(Integer.parseInt(txtBoleta.getText()));
                    pos = alumno.position(Integer.parseInt(txtBoleta.getText()));
                    System.out.println("posición " + pos);

                    objDatos.setPassword(txtPassword.getText());

                    alumno.cambiar(pos, objDatos);
                    alumno.guardar();
                    JOptionPane.showMessageDialog(null, "Fecha de nacimiento modificada");
                }
            });
        }
    }
}

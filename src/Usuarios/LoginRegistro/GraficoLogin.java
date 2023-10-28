package Usuarios.LoginRegistro;
import Administrador.*;
import Administrador.GrafiLoginAdm;
import Usuarios.principalUser;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraficoLogin extends JFrame implements ActionListener {

    private ArrayDatosAlumnos OLDatos;
    private JButton btnIngresar;
    private JButton btnRegistrar;
    private JButton salir;
    private JButton minimizar;
    private JLabel lblUser;
    private JLabel lblPass;
    private JLabel lblLogo;
    private JLabel fondo;
    private JLabel Glass;
    private JLabel pregunta;
    private JLabel des;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton iconKey;

    public GraficoLogin() {
        setLayout(null);
        setSize(1100, 650);
        setResizable(false);
        setLocationRelativeTo(null);
        OLDatos = new ArrayDatosAlumnos();
        accionesVentana();
        setUndecorated(true);
        componentes();
        setVisible(true);
    }

    public void componentes() {
        des= new JLabel();
        ImageIcon me = new ImageIcon("src/Usuarios/imagenesUser/BienBenida.png");
        des.setBounds(220, 120, 720, 140);
        des.setIcon(new ImageIcon(me.getImage().getScaledInstance(des.getWidth(), des.getHeight(), Image.SCALE_SMOOTH)));
        add(des);

        lblLogo= new JLabel();
        lblLogo.setBounds(440, 20,200,110);
        ImageIcon iconobb = new ImageIcon("src/Usuarios/imagenesUser/logobebebien.png");
        lblLogo.setIcon(new ImageIcon(iconobb.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
        lblLogo.setOpaque(false);
        add(lblLogo);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(460, 480, 130, 40);
        btnIngresar.setBorder(BorderFactory.createEtchedBorder(6, Color.black , Color.BLACK));
        btnIngresar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btnIngresar.addActionListener(this);
        add(btnIngresar);

        txtUser = new JTextField();
        txtUser.setBounds(600, 350, 150, 50);
        add(txtUser);

        txtPass = new JPasswordField();
        txtPass.setBounds(600, 425,150, 50);
        add(txtPass);

        lblUser = new JLabel("Boleta:", SwingConstants.CENTER);
        lblUser.setBounds(350, 350, 130, 45);
        lblUser.setFont(new Font("arial black", Font.PLAIN , 15));
        add(lblUser);

        lblPass = new JLabel("Contraseña:", SwingConstants.CENTER);
        lblPass.setBounds(350, 425, 130, 45);
        lblPass.setFont(new Font("arial black", Font.PLAIN , 15));
        add(lblPass);

        pregunta = new JLabel("¿No tienes una cuenta?", SwingConstants.CENTER);
        pregunta.setBounds(300, 595, 200, 45);
        pregunta.setFont(new Font("arial black", Font.PLAIN , 15));
        add(pregunta);

        btnRegistrar= new JButton("Crear cuenta");
        btnRegistrar.setBounds(600, 595, 110, 40);
        btnRegistrar.addActionListener(this);
        btnRegistrar.setBackground(Color.ORANGE);
        btnRegistrar.setOpaque(true);
        add(btnRegistrar);

        ImageIcon glass = new ImageIcon("src/Usuarios/imagenesUser/glassbien.png");
        Glass = new JLabel();
        Glass.setBounds(310, 260, 480, 345);
        Glass.setIcon(new ImageIcon(glass.getImage().getScaledInstance(Glass.getWidth(), Glass.getHeight(), Image.SCALE_SMOOTH)));
        Glass.setOpaque(false);
        add(Glass);

        ImageIcon key = new ImageIcon("src/Usuarios/imagenesUser/Key.png");
        iconKey = new JButton();
        iconKey.setBounds(1050, 605, 40, 40);
        iconKey.setIcon(new ImageIcon(key.getImage().getScaledInstance(iconKey.getWidth(), iconKey.getHeight(), Image.SCALE_SMOOTH)));
        iconKey.setOpaque(true);
        add(iconKey);
        iconKey.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dispose();
                new GrafiLoginAdm();
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


    public void accionesVentana(){
        salir = new JButton();
        salir.setBounds(1025, 10, 50, 50);
        ImageIcon iconsito = new ImageIcon("src/Usuarios/imagenesUser/BtnSalirF.png");
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


    @Override
    public void actionPerformed(ActionEvent e) {
        String btntipo = e.getActionCommand();
        if(btntipo.equals("Ingresar")){
            if(txtUser.getText().isEmpty()|| txtPass.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Algun campo esta vacio");
            }
            else{
                if(OLDatos.validarNumeros(txtUser.getText().trim())) {
                    DatosAlumno objBuscar = new DatosAlumno();
                    int ctaBusca;
                    ctaBusca = Integer.parseInt(txtUser.getText());
                    System.out.println(" ol:  " + ctaBusca);
                    objBuscar = OLDatos.llamarObj(ctaBusca);

                    if (objBuscar != null) {
                        txtUser.setText(String.valueOf(objBuscar.getBoleta()));
                        txtPass.setText(objBuscar.getPassword());
                        dispose();
                        new principalUser(Integer.parseInt(txtUser.getText()));
                    } else {
                        if (objBuscar == null) {
                            JOptionPane.showMessageDialog(this, "El registro" +
                                    " no existe, intenta de nuevo");
                        }
                    }
                }
                else
                    JOptionPane.showMessageDialog(null,"En numero de boleta solo se pueden agregar numeros");
            }
        }
        if(btntipo.equals("Crear cuenta")){
            dispose();
            new GrafiRegistrarU();
        }
    }
}

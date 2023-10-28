package Administrador;
import Administrador.CudW.ArrayAdmin;
import Administrador.CudW.DA;
import Usuarios.LoginRegistro.GraficoLogin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;

public class GrafiLoginAdm extends JFrame implements ActionListener  {
    JLabel fondo, lblIcono, lblCedula, lblPass, title;
    JButton salir, minimizar, btningresar, volver ;
    private JTextField txtxCedula;
    private JPasswordField txtPass;
    private ArrayAdmin OLDatos;

    public GrafiLoginAdm(){
        setLayout(null);
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
                new GraficoLogin();
            }
        });
    }

    public void componentes(){
        lblCedula = new JLabel("Cedula:");
        lblCedula.setBounds(350, 350, 130, 45);
        lblCedula.setFont(new Font("arial black", Font.PLAIN , 15));
        add(lblCedula);
        txtxCedula = new JTextField();
        txtxCedula.setBounds(600, 350, 150, 50);
        add(txtxCedula);

        lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(350, 425, 130, 45);
        lblPass.setFont(new Font("arial black", Font.PLAIN , 15));
        add(lblPass);
        txtPass = new JPasswordField();
        txtPass.setBounds(600, 425,150, 50);
        add(txtPass);

        btningresar = new JButton("Ingresar");
        btningresar.setBounds(460, 480, 130, 40);
        btningresar.addActionListener(this);
        add(btningresar);

        title = new JLabel("Iniciar Sesión Como Administrador");
        title.setBounds(170, 85, 860, 145);
        title.setFont(new Font("arial black", Font.PLAIN , 35));
        add(title);

        ImageIcon glass = new ImageIcon("src/Usuarios/imagenesUser/glassbien.png");
       lblIcono = new JLabel();
       lblIcono.setBounds(310, 260, 480, 345);
       lblIcono.setIcon(new ImageIcon(glass.getImage().getScaledInstance(lblIcono.getWidth(), lblIcono.getHeight(), Image.SCALE_SMOOTH)));
       lblIcono.setOpaque(false);
        add(lblIcono);

        fondo = new JLabel();
        fondo.setBounds(0, 0, 1100, 650);
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
        if(e.getSource().equals(btningresar)){

            OLDatos = new ArrayAdmin();
            int usuario;
            usuario = -1;
            usuario = Integer.parseInt(txtxCedula.getText());
            String contrase = txtPass.getText();

            if (usuario==-1|| contrase.isEmpty()){
                JOptionPane.showMessageDialog(this, "Llena los campos");
            }
            else {
                if(OLDatos.validarNumeros(txtxCedula.getText().trim())) {
                    if (usuario == 1 && contrase.equals("Ento123")) {
                        this.dispose();
                        new MenuAdmin();
                    } else {
                        DA objBuscar = new DA();
                        int ctaBusca;
                        ctaBusca = Integer.parseInt(txtxCedula.getText());
                        System.out.println(" ol:  " + ctaBusca);
                        objBuscar = OLDatos.traeObjeto(ctaBusca);

                        if (objBuscar != null) {
                            txtxCedula.setText(String.valueOf(objBuscar.getCedula()));
                            txtPass.setText(objBuscar.getContrasena());
                            dispose();
                            new MenuAdmin();
                        } else {
                            JOptionPane.showMessageDialog(this, "El registro no existe intentelo de nuevo");
                        }
                    }
                }
                else
                    JOptionPane.showMessageDialog(null,"En cedula solo se pueden agregar numeros");
           }
        }
    }
    public static void main(String[] args) {
        new GrafiLoginAdm();
    }
}


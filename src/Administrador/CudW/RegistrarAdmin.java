package Administrador.CudW;
import Administrador.MenuAdmin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegistrarAdmin extends JFrame implements ActionListener {
    private JLabel fondo, lblGlass, img;
    private  JButton minimizar, salir, volver;

    private JRadioButton RBmujer, RBhombre;
    private ButtonGroup BGsexo;
    private JComboBox<String> jcMateria;
    private ArrayAdmin ad;
    JTextField txtCedula, txtxNombre, txtCorreo;
    JPasswordField txtContraseña;
    JLabel lblnombre, lblCedula, lblCorreo, lblmateria, lblsexo, lblContraseña;
    private JButton btnRegistrar;


    public RegistrarAdmin(){
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true);

        accionesVentana();
        componentes();
        setVisible(true);
    }


    public void  componentes(){

        ImageIcon ra = new ImageIcon("src/Administrador/imagenesAdm/Ra.png");
        img= new JLabel();
        img.setBounds(310, 65, 518, 120);
        img.setIcon(new ImageIcon(ra.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH)));
        add(img);

        BGsexo = new ButtonGroup();
        RBmujer = new JRadioButton();
        RBhombre = new JRadioButton();
        jcMateria = new JComboBox<>();
        BGsexo.add(RBmujer);
        BGsexo.add(RBhombre);

        RBhombre= new JRadioButton("M");
        RBhombre.setBounds(557, 538, 35, 30);
        RBhombre.setFocusPainted(false);
        RBhombre.setBorderPainted(false);
        RBhombre.setContentAreaFilled(false);
        add(RBhombre);

        RBmujer= new JRadioButton("F");
        RBmujer.setBounds(685, 538, 35, 30);
        RBmujer.setFocusPainted(false);
        RBmujer.setBorderPainted(false);
        RBmujer.setContentAreaFilled(false);
        add(RBmujer);

        jcMateria = new JComboBox<>();
        jcMateria.addItem("Selecciona opción");
        jcMateria.addItem("Entorno Socieconomico");
        jcMateria.addItem("Historia I");
        jcMateria.addItem("Historia II");
        jcMateria.setBounds(557,459,215,40);
        add(jcMateria);

        lblnombre= new JLabel("Nombre: ");
        lblnombre.setBounds(340, 205, 215, 40);
        lblnombre.setFont(new Font("arial black", Font.PLAIN , 15));
        add(lblnombre);
        txtxNombre= new JTextField();
        txtxNombre.setBounds(557,205,215,40);
        txtxNombre.setFont(new Font("arial black", Font.PLAIN , 15));
        add(txtxNombre);

        lblCedula= new JLabel("Cedula:");
        lblCedula.setBounds(340, 290, 215, 40);
        lblCedula.setFont(new Font("arial black", Font.PLAIN , 15));
        add(lblCedula);
        txtCedula= new JTextField();
        txtCedula.setBounds(557,290,215,40);
        txtCedula.setFont(new Font("arial black", Font.PLAIN , 15));
        add(txtCedula);

        lblCorreo= new JLabel("Correo electronico:");
        lblCorreo.setBounds(340, 372, 215, 40);
        lblCorreo.setFont(new Font("arial black", Font.PLAIN , 15));
        add(lblCorreo);
        txtCorreo= new JTextField();
        txtCorreo.setBounds(557,372,215,40);
        txtCorreo.setFont(new Font("arial black", Font.PLAIN , 15));
        add(txtCorreo);

        lblmateria = new JLabel("Materia impartida:");
        lblmateria.setFont(new Font("arial black", Font.PLAIN , 15));
        lblmateria.setBounds(340, 459, 215, 40);
        add(lblmateria);

        lblsexo = new JLabel("Sexo:");
        lblsexo.setBounds(340, 538, 215, 40);
        add(lblsexo);

        lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setBounds(340,597,251,40);
        lblContraseña.setFont(new Font("arial black", Font.PLAIN , 15));
        add(lblContraseña);
        txtContraseña = new JPasswordField();
        txtContraseña.setBounds(557,594,215,35);
        add(txtContraseña);

        btnRegistrar = new JButton("Registrar Administrador");
        btnRegistrar.setBounds(810, 600, 200, 40);
        add(btnRegistrar);
        btnRegistrar.addActionListener(this);

        ImageIcon glass = new ImageIcon("src/Administrador/imagenesAdm/glassbien.png");
        lblGlass = new JLabel();
        lblGlass.setBounds(295, 180, 513, 625);
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
        volver.setBounds(834, 10, 50, 50);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnRegistrar)){
            ArrayAdmin ad = new ArrayAdmin();
            ad.abrir();
            int seguir=1;
            while (seguir==1) {

                if(txtxNombre.getText().isEmpty() || txtCorreo.getText().isEmpty() ||
                        txtCedula.getText().isEmpty()|| txtContraseña.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(this, "Algun campo esta vacio");

                }
                else{
                    DA da = new DA();
                    da.setNombre(txtxNombre.getText());
                    da.setCorreo(txtCorreo.getText());
                    if(ad.validarNumeros(txtCedula.getText())) {
                        da.setCedula(Integer.parseInt(txtCedula.getText()));
                    }
                    else
                        JOptionPane.showMessageDialog(null,"En cedula solo se pueden agregar numeros");

                    da.setContrasena(txtContraseña.getText());

                    if (jcMateria.getSelectedIndex() == 1) {
                        da.setMateria("Entorno socioeconomico");
                    }
                    if (jcMateria.getSelectedIndex() == 2) {
                        da.setMateria("Historia I");
                    }
                    if (jcMateria.getSelectedIndex() == 3) {
                        da.setMateria("Historia II");
                    }

                    if (RBmujer.isSelected())
                        da.setSexo("Mujer");
                    if (RBhombre.isSelected())
                        da.setSexo("Hombre");


                    ad.agregar(da);
                    ad.actualizar();

                    int i = JOptionPane.showConfirmDialog(null, "Admin  Agregado, " +
                            "¿Desea agregar otro Admin?", "Agregar otro Admin", JOptionPane.YES_NO_OPTION);

                    if(i==JOptionPane.YES_OPTION)
                    {
                        JOptionPane.showMessageDialog(null, "ok, rellene los nuevos datos");
                        txtxNombre.setText("");
                        txtCedula.setText("");
                        txtCorreo.setText("");
                        txtContraseña.setText("");
                        break;

                    }else if (i==JOptionPane.NO_OPTION){
                        dispose();
                        new MenuAdmin();
                    }
                }
            }
        }
    }
}




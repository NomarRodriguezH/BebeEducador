package Usuarios.LoginRegistro;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GrafiRegistrarU extends JFrame implements ActionListener {
    JButton btnIngresar, volver, minimizar, salir;
    JLabel lblNombre, lblIcono, fondo, lblPass, lblCorreo, lblBoleta, des;
    JTextField txtNombre, txtCorreo, txtBoleta;
    private JComboBox salon;
    private ButtonGroup BgSexo;
    private JRadioButton RbMujer;
    private JRadioButton RbHombre;
    private JLabel lblSexo;
    private JLabel lblGrupo;
    private ArrayDatosAlumnos OLDatos;
    private JPasswordField txtPass;

    public GrafiRegistrarU() {
        setLayout(null);
        OLDatos = new ArrayDatosAlumnos();
        setSize(1100, 650);
        setResizable(false);
        setUndecorated(true);
        setLocationRelativeTo(null);
        accionesVentana();
        Iniciarcomponentes();
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


    public void Iniciarcomponentes() {
        des= new JLabel();
        ImageIcon me = new ImageIcon("src/Usuarios/imagenesUser/regis.png");
        des.setBounds(295, 40, 400, 100);
        des.setIcon(new ImageIcon(me.getImage().getScaledInstance(des.getWidth(), des.getHeight(), Image.SCALE_SMOOTH)));
        add(des);


        Font font = new Font ("arial ", Font.BOLD , 22);

        btnIngresar = new JButton("Registrar");
        btnIngresar.setBounds(450, 590, 120, 55);
        //btnIngresar.setBorder(BorderFactory.createEtchedBorder(6, Color.black , Color.BLACK));
        btnIngresar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btnIngresar.addActionListener(this);
        add(btnIngresar);


        lblNombre = new JLabel("Nombre:", SwingConstants.CENTER);
        lblNombre.setBounds(340, 137, 110, 45);
        lblNombre.setFont(font);
        add(lblNombre);
        txtNombre = new JTextField();
        txtNombre.setBounds(605, 137, 150, 45);
        add(txtNombre);

        lblCorreo = new JLabel("Correo:", SwingConstants.CENTER);
        lblCorreo.setBounds(340, 217, 110, 45);
        lblCorreo.setFont(font);
        add(lblCorreo);
        txtCorreo = new JTextField();
        txtCorreo.setBounds(605, 217, 150, 45);
        add(txtCorreo);

        lblBoleta = new JLabel("Boleta:", SwingConstants.CENTER);
        lblBoleta.setBounds(340, 293, 110, 45);
        lblBoleta.setFont(font);
        add(lblBoleta);
        txtBoleta = new JTextField();
        txtBoleta.setBounds(605, 293, 150, 45);
        add(txtBoleta);

        lblPass = new JLabel("Pass:", SwingConstants.CENTER);
        lblPass.setBounds(340, 371, 110, 45);
        lblPass.setFont(font);
        add(lblPass);
        txtPass = new JPasswordField();
        txtPass.setBounds(605, 371, 150, 45);
        add(txtPass);

        lblSexo = new JLabel("Sexo:", SwingConstants.CENTER);
        lblSexo.setBounds(340, 451, 110, 45);
        lblSexo.setFont(font);
        add(lblSexo);

        RbMujer= new JRadioButton("F");
        RbMujer.setBounds(605, 451, 40, 40);
        RbMujer.setFocusPainted(false);
        RbMujer.setBorderPainted(false);
        RbMujer.setContentAreaFilled(false);
        add(RbMujer);

        RbHombre= new JRadioButton("M");
        RbHombre.setBounds(663, 451, 40, 40);
        RbHombre.setFocusPainted(false);
        RbHombre.setBorderPainted(false);
        RbHombre.setContentAreaFilled(false);
        add(RbHombre);

        lblGrupo = new JLabel("Grupo:", SwingConstants.CENTER);
        lblGrupo.setBounds(340, 521, 110, 45);
        lblGrupo.setFont(font);
        add(lblGrupo);

        salon = new JComboBox();
        salon.addItem("Selecciona opción");
        salon.addItem("3IM1");
        salon.addItem("3IM2");
        salon.addItem("3IM3");
        salon.addItem("3IM4");
        salon.addItem("3IM5");
        salon.addItem("3IM6");
        salon.addItem("3IM7");
        salon.addItem("3IM8");
        salon.addItem("3IM9");
        salon.setBounds(605,521,150,40);
        add(salon);

        BgSexo=new ButtonGroup();
        BgSexo.add(RbHombre);
        BgSexo.add(RbMujer);

        ImageIcon glass = new ImageIcon("src/Usuarios/imagenesUser/glassbien.png");
        lblIcono= new JLabel();
        lblIcono.setBounds(230, 110, 600, 600);
        lblIcono.setIcon(new ImageIcon(glass.getImage().getScaledInstance(lblIcono.getWidth(), lblIcono.getHeight(), Image.SCALE_SMOOTH)));
        lblIcono.setOpaque(false);
        add(lblIcono);

        fondo = new JLabel();
        fondo.setBounds(0, 0, 1100, 650);
        add(fondo);
        ImageIcon icon2 = new ImageIcon("src/Usuarios/imagenesUser/amarilloV2.jpg");
        Image recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        fondo.setIcon(newIcon);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btntipo = e.getActionCommand();

        if(txtNombre.getText().isEmpty() || txtBoleta.getText().isEmpty() ||
                txtCorreo.getText().isEmpty()|| txtPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Algun campo esta vacio");
        }
        else {
            if(btntipo.equals("Registrar")){
                DatosAlumno objDatos = new DatosAlumno();
                objDatos.setNombre(txtNombre.getText());
                objDatos.setCorreo(txtCorreo.getText());
                if(OLDatos.validarNumeros(txtBoleta.getText())) {
                    objDatos.setBoleta(Integer.parseInt((txtBoleta.getText())));
                }
                else
                    JOptionPane.showMessageDialog(null,"En numero de boleta solo se pueden agregar numeros");

                objDatos.setPassword((txtPass.getText()));

                if (salon.getSelectedIndex()==1){
                    objDatos.setGrupo("3IM1");
                }
                if (salon.getSelectedIndex()==2){
                    objDatos.setGrupo("3IM2");
                }
                if (salon.getSelectedIndex()==3){
                    objDatos.setGrupo("3IM3");
                }
                if (salon.getSelectedIndex()==4){
                    objDatos.setGrupo("3IM4");
                }
                if (salon.getSelectedIndex()==5){
                    objDatos.setGrupo("3IM5");
                }
                if (salon.getSelectedIndex()==6){
                    objDatos.setGrupo("3IM6");
                }
                if (salon.getSelectedIndex()==7){
                    objDatos.setGrupo("3IM7");
                }
                if (salon.getSelectedIndex()==8){
                    objDatos.setGrupo("3IM8");
                }
                if (salon.getSelectedIndex()==9){
                    objDatos.setGrupo("3IM9");
                }

                if (RbHombre.isSelected()){
                    objDatos.setSexo("Hombre");}
                else if (RbMujer.isSelected()){
                    objDatos.setSexo("Mujer");
                }

                OLDatos.newdato(objDatos);
                System.out.println(objDatos.getNombre());
                OLDatos.guardar();
                JOptionPane.showMessageDialog(this, "Se agregó el registro");
                txtNombre.setText("");
                txtCorreo.setText("");
                txtBoleta.setText("");
                txtPass.setText("");
                new GraficoLogin();
            }
        }
    }
}

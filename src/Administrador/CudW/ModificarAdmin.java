package Administrador.CudW;
import Administrador.MenuAdmin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ModificarAdmin extends JFrame implements ActionListener {
    JLabel lblNombre, lblCorreo, mensaje, fondo, nuevodato, lblCedula, lblMateria, lblnuevamateria;
    JTextField txtNombre, txtCorreo, txtCedula;
    JButton btnmodificar, btntodos, btnnombre, btnCorreo, btnMateria, volver;
    JTextField txtnombreOriginal, txtCorreoOriginal, txtMateriaOriginal;
    JButton minimizar, salir;
    JLabel lblNuevoNombre, lblNuevoCorreo;
    private JComboBox<String> jcMateria;

    private ArrayAdmin admin;


    public ModificarAdmin() {
        admin = new ArrayAdmin();
        setLayout(null);
        setSize(1100, 650);
        setLocationRelativeTo(null);
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
        salir.setOpaque(true);
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
                new EditarElegir();
            }

        });
    }

    private void componentes() {
        mensaje = new JLabel("Seleciona la opción a modificar");
        mensaje.setBounds(400, 80, 2500, 50);
        mensaje.setFont(new Font("arial black", Font.PLAIN , 14));
        add(mensaje);

        btnnombre = new JButton("Nombre");
        btnnombre.setBounds(65, 180, 160, 55);
        btnnombre.addActionListener(this);
        add(btnnombre);

        btnCorreo = new JButton("Correo");
        btnCorreo.setBounds(335, 180, 160, 55);
        btnCorreo.addActionListener(this);
        add(btnCorreo);

        btnMateria = new JButton("Materia");
        btnMateria.setBounds(603, 180, 160, 55);
        btnMateria.addActionListener(this);
        add(btnMateria);

        btntodos = new JButton("Todos");
        btntodos.setBounds(870, 180, 160, 55);
        btntodos.addActionListener(this);
        add(btntodos);

        lblCedula = new JLabel("Ingresa la cedula para buscar");
        lblCedula.setBounds(65, 290, 190, 45);
        add(lblCedula);

        txtCedula = new JTextField();
        txtCedula.setBounds(335, 290, 280, 45);
        add(txtCedula);


        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(65, 420, 180, 45);
        lblNombre.setVisible(false);
        add(lblNombre);

        lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(65, 420, 180, 45);
        lblCorreo.setVisible(false);
        add(lblCorreo);


        lblMateria = new JLabel("Materia:");
        lblMateria.setBounds(65, 420, 180, 45);
        lblMateria.setVisible(false);
        add(lblMateria);

        //nuevos lbls
        nuevodato = new JLabel("Nuevos datos:");
        nuevodato.setBounds(605, 420, 180, 45);
        nuevodato.setVisible(false);
        add(nuevodato);

        lblNuevoNombre = new JLabel("Nuevo Nombre:");
        lblNuevoNombre.setBounds(605, 420, 180, 45);
        lblNuevoNombre.setVisible(false);
        add(lblNuevoNombre);

        lblNuevoCorreo = new JLabel("Nuevo correo:");
        lblNuevoCorreo.setBounds(605, 420, 180, 45);
        lblNuevoCorreo.setVisible(false);
        add(lblNuevoCorreo);


        //datos originales
        txtnombreOriginal = new JTextField("");
        txtnombreOriginal.setBounds(330, 420, 120, 45);
        txtnombreOriginal.setEditable(false);
        txtnombreOriginal.setVisible(false);
        add(txtnombreOriginal);

        txtCorreoOriginal = new JTextField("");
        txtCorreoOriginal.setBounds(330, 420, 120, 45);
        txtCorreoOriginal.setEditable(false);
        txtCorreoOriginal.setVisible(false);
        add(txtCorreoOriginal);

        txtMateriaOriginal = new JTextField("");
        txtMateriaOriginal.setBounds(330, 420, 120, 45);
        txtMateriaOriginal.setEditable(false);
        txtMateriaOriginal.setVisible(false);
        add(txtMateriaOriginal);

        //para que si
        txtNombre = new JTextField();
        txtNombre.setBounds(860, 420, 160, 45);
        txtNombre.setVisible(false);
        add(txtNombre);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(860, 420, 160, 45);
        txtCorreo.setVisible(false);
        add(txtCorreo);

        jcMateria = new JComboBox<>();
        jcMateria.addItem("Selecciona opción");
        jcMateria.addItem("Entorno Socieconomico");
        jcMateria.addItem("Historia I");
        jcMateria.addItem("Historia II");
        jcMateria.setBounds(744, 600, 100, 45);
        add(jcMateria);
        jcMateria.setVisible(false);

        btnmodificar = new JButton("Modificar");
        btnmodificar.setBounds(465, 555, 160, 60);
        btnmodificar.addActionListener(this);
        add(btnmodificar);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        String tipo = e.getActionCommand();
        DA adm = new DA();
        admin.abrir();

        if (e.getSource().equals(btnnombre)) {
            txtNombre.setVisible(true);
            txtnombreOriginal.setVisible(true);
            lblNombre.setVisible(true);
            lblNuevoNombre.setVisible(true);

            lblCorreo.setVisible(false);
            txtCorreo.setVisible(false);
            txtCorreoOriginal.setVisible(false);
            lblCorreo.setVisible(false);
            txtMateriaOriginal.setVisible(false);
            txtCedula.setVisible(true);
            lblCedula.setVisible(true);
            lblNuevoCorreo.setVisible(false);

            int cedula = Integer.parseInt(txtCedula.getText());
            adm = admin.traeObjeto(cedula);
            txtnombreOriginal.setText(getName());


            if (adm != null) {
                txtnombreOriginal.setText(adm.getNombre());

                btnmodificar.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent evt) {

                        int pos;
                        DA adm = new DA();
                        adm = admin.traeObjeto(Integer.parseInt(txtCedula.getText()));
                        pos = admin.traePosicion(Integer.parseInt(txtCedula.getText()));
                        System.out.println("posición " + pos);

                        adm.setNombre(txtNombre.getText());
                        admin.cambiar(pos, adm);
                        admin.actualizar();
                        JOptionPane.showMessageDialog(null, "Nombre modificado");
                    }
                });

            } else {
                JOptionPane.showMessageDialog(null, "Admin no encontrado");
                txtnombreOriginal.setText("");
            }
        }


        if (e.getSource().equals(btnCorreo)) {
            txtCorreo.setVisible(true);
            txtCorreoOriginal.setVisible(true);
            lblCorreo.setVisible(true);

            lblNuevoNombre.setVisible(false);
            lblNuevoCorreo.setVisible(true);

            txtMateriaOriginal.setVisible(false);
            txtCedula.setVisible(true);
            lblCedula.setVisible(true);
            txtNombre.setVisible(false);
            txtnombreOriginal.setVisible(false);
            lblNombre.setVisible(false);

            admin.abrir();
            int cedula = Integer.parseInt(txtCedula.getText());
            adm = admin.traeObjeto(cedula);

            if (adm != null) {
                txtCorreoOriginal.setText(adm.getCorreo());
                btnmodificar.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent evt) {
                        admin.abrir();
                        int pos;
                        DA objDatos = new DA();
                        objDatos = admin.traeObjeto(Integer.parseInt(txtCedula.getText()));
                        pos = admin.traePosicion(Integer.parseInt(txtCedula.getText()));
                        System.out.println("posición " + pos);

                        objDatos.setCorreo(txtCorreo.getText());

                        admin.cambiar(pos, objDatos);
                        admin.actualizar();
                        JOptionPane.showMessageDialog(null, "Correo  modificado");
                    }
                });
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                txtCorreo.setText("");
            }
        }

        if (e.getSource().equals(btnMateria)) {
            txtCedula.setVisible(true);
            txtCedula.setBounds(335, 290, 280, 45);
            lblCedula.setVisible(true);
            lblCedula.setBounds(65, 290, 190, 45);

            jcMateria.setVisible(true);
            jcMateria.setBounds(860, 420, 160, 45);
            lblMateria.setVisible(true);
            txtMateriaOriginal.setVisible(true);
            lblnuevamateria = new JLabel("Nueva materia");
            lblnuevamateria.setBounds(330, 420, 120, 45);
            add(lblnuevamateria);

            txtCorreo.setVisible(false);
            txtCorreoOriginal.setVisible(false);
            lblCorreo.setVisible(false);

            lblNuevoNombre.setVisible(false);
            lblNuevoCorreo.setVisible(false);

            txtNombre.setVisible(false);
            txtnombreOriginal.setVisible(false);
            lblNombre.setVisible(false);

            int cedula = Integer.parseInt(txtCedula.getText());
            adm = admin.traeObjeto(cedula);


            if (adm != null) {
                txtMateriaOriginal.setText(adm.getMateria());

                btnmodificar.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent evt) {
                        int pos;
                        DA adm = new DA();
                        adm = admin.traeObjeto(Integer.parseInt(txtCedula.getText()));
                        pos = admin.traePosicion(Integer.parseInt(txtCedula.getText()));
                        System.out.println("posición " + pos);

                        if (jcMateria.getSelectedIndex() == 1) {
                            adm.setMateria("Entorno socioeconomico");
                        }
                        if (jcMateria.getSelectedIndex() == 2) {
                            adm.setMateria("Historia I");
                        }
                        if (jcMateria.getSelectedIndex() == 3) {
                            adm.setMateria("Historia II");
                        }

                        admin.cambiar(pos, adm);
                        admin.actualizar();
                        JOptionPane.showMessageDialog(null, "Materia  modificada");
                    }
                });

            } else {
                JOptionPane.showMessageDialog(null, "Admin no encontrado");
                txtMateriaOriginal.setText("");
            }
        }


        if (e.getSource().equals(btntodos)) {
            nuevodato = new JLabel("Nuevos datos");
            nuevodato.setBounds(605, 330, 190, 60);

            lblCedula.setBounds(65, 290, 190, 45);

            txtCedula.setVisible(true);
            txtCedula.setBounds(335, 290, 190, 45);

            btnmodificar.setBounds(840, 550, 160, 80);


            lblNombre.setVisible(true);
            lblNombre.setBounds(65, 360,190, 45);

            txtNombre.setVisible(true);
            txtNombre.setBounds(860, 360,190, 45);
            txtnombreOriginal.setVisible(true);
            txtnombreOriginal.setBounds(325, 360, 290, 45);

            lblNuevoNombre.setVisible(true);
            lblNuevoCorreo.setVisible(true);

            lblCorreo.setVisible(true);
            lblCorreo.setBounds(65, 450, 190, 45);
            txtCorreoOriginal.setVisible(true);
            txtCorreoOriginal.setBounds(325, 450, 190, 45);
            txtCorreo.setVisible(true);
            txtCorreo.setBounds(860, 450, 190, 45);

            lblMateria.setVisible(true);
            lblMateria.setBounds(65, 555, 190, 45);
            txtMateriaOriginal.setVisible(true);
            txtMateriaOriginal.setBounds(325, 555, 190, 45);
            jcMateria.setVisible(true);
            lblMateria.setBounds(860, 555, 190, 45);

            int cedula = Integer.parseInt(txtCedula.getText());
            adm = admin.traeObjeto(cedula);


            if (adm != null) {
                txtnombreOriginal.setText(adm.getNombre());
                txtCorreoOriginal.setText(adm.getCorreo());
                txtMateriaOriginal.setText(adm.getMateria());

                btnmodificar.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent evt) {
                        admin.abrir();
                        int pos;
                        DA objDatos = new DA();
                        objDatos = admin.traeObjeto(Integer.parseInt(txtCedula.getText()));
                        pos = admin.traePosicion(Integer.parseInt(txtCedula.getText()));
                        System.out.println("posición " + pos);

                        objDatos.setNombre(txtNombre.getText());
                        objDatos.setCorreo(txtCorreo.getText());
                        //objDatos.setMateria(jcMateria.getSelectedIndex());

                        if (jcMateria.getSelectedIndex() == 1) {
                           objDatos.setMateria("Entorno socieconomico");
                        }
                        else if (jcMateria.getSelectedIndex() == 2) {
                            objDatos.setMateria("Historia I");
                        }
                        else if (jcMateria.getSelectedIndex() == 3) {
                            objDatos.setMateria("Historia II");
                        }
                        admin.cambiar(pos, objDatos);
                        admin.actualizar();
                        JOptionPane.showMessageDialog(null, "Admin modificado");
                    }
                });

            } else {
                JOptionPane.showMessageDialog(null, "Admin no encontrado");
                txtnombreOriginal.setText("");
                txtMateriaOriginal.setText("");
                txtCorreoOriginal.setText("");
            }
        }
    }

}









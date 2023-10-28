package Administrador.ExamenesAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public class AgregarExam extends JFrame implements ActionListener {

    private JLabel jlTitulo;
    private JLabel jlPregun1;
    private JLabel jlPregun2;
    private JLabel jlPregun3;
    private JLabel jlPregun4;
    private JLabel jlPregun5;
    private JLabel jlPregun6;
    private JLabel jlPregun7;
    private JLabel jlPregun8;
    private JLabel jlPregun9;
    private JLabel jlPregun10;
    private JLabel jlRespuesta1;
    private JLabel jlRespuesta2;
    private JLabel jlRespuesta3;
    private JLabel jlRespuesta4;
    private JLabel jlRespuesta5;
    private JLabel jlRespuesta6;
    private JLabel jlRespuesta7;
    private JLabel jlRespuesta8;
    private JLabel jlRespuesta9;
    private JLabel jlRespuesta10;
    private JLabel jlRespuesta11;
    private JLabel jlRespuesta12;
    private JLabel jlRespuesta13;
    private JLabel jlRespuesta14;
    private JLabel jlRespuesta15;
    private JLabel jlRespuesta16;
    private JLabel jlRespuesta17;
    private JLabel jlRespuesta18;
    private JLabel jlRespuesta19;
    private JLabel jlRespuesta20;
    private JLabel jlRespuesta21;
    private JLabel jlRespuesta22;
    private JLabel jlRespuesta23;
    private JLabel jlRespuesta24;
    private JLabel jlRespuesta25;
    private JLabel jlRespuesta26;
    private JLabel jlRespuesta27;
    private JLabel jlRespuesta28;
    private JLabel jlRespuesta29;
    private JLabel jlRespuesta30;
    private JLabel jlRespuestaCo1;
    private JLabel jlRespuestaCo2;
    private JLabel jlRespuestaCo3;
    private JLabel jlRespuestaCo4;
    private JLabel jlRespuestaCo5;
    private JLabel jlRespuestaCo6;
    private JLabel jlRespuestaCo7;
    private JLabel jlRespuestaCo8;
    private JLabel jlRespuestaCo9;
    private JLabel jlRespuestaCo10;
    private JTextField txtTitulo;
    private JTextField txtPregun1;
    private JTextField txtPregun2;
    private JTextField txtPregun3;
    private JTextField txtPregun4;
    private JTextField txtPregun5;
    private JTextField txtPregun6;
    private JTextField txtPregun7;
    private JTextField txtPregun8;
    private JTextField txtPregun9;
    private JTextField txtPregun10;
    private JTextField txtRespuesta1;
    private JTextField txtRespuesta2;
    private JTextField txtRespuesta3;
    private JTextField txtRespuesta4;
    private JTextField txtRespuesta5;
    private JTextField txtRespuesta6;
    private JTextField txtRespuesta7;
    private JTextField txtRespuesta8;
    private JTextField txtRespuesta9;
    private JTextField txtRespuesta10;
    private JTextField txtRespuesta11;
    private JTextField txtRespuesta12;
    private JTextField txtRespuesta13;
    private JTextField txtRespuesta14;
    private JTextField txtRespuesta15;
    private JTextField txtRespuesta16;
    private JTextField txtRespuesta17;
    private JTextField txtRespuesta18;
    private JTextField txtRespuesta19;
    private JTextField txtRespuesta20;
    private JTextField txtRespuesta21;
    private JTextField txtRespuesta22;
    private JTextField txtRespuesta23;
    private JTextField txtRespuesta24;
    private JTextField txtRespuesta25;
    private JTextField txtRespuesta26;
    private JTextField txtRespuesta27;
    private JTextField txtRespuesta28;
    private JTextField txtRespuesta29;
    private JTextField txtRespuesta30;
    private JTextField txtRespuestaCo1;
    private JTextField txtRespuestaCo2;
    private JTextField txtRespuestaCo3;
    private JTextField txtRespuestaCo4;
    private JTextField txtRespuestaCo5;
    private JTextField txtRespuestaCo6;
    private JTextField txtRespuestaCo7;
    private JTextField txtRespuestaCo8;
    private JTextField txtRespuestaCo9;
    private JTextField txtRespuestaCo10;
    private JButton jbGuardar;
    private JButton jbRegresar;
    private ArrayExa examen;
    JButton salir, minimizar, volver;

    public AgregarExam() {
        examen = new ArrayExa();
        setLayout(null);
        setSize(1100, 850);
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
                new GesExam();
            }
        });
    }

    public void iniciarComponentes() {
        jlTitulo = new JLabel("Titulo:");
        jlTitulo.setBounds(400, 24, 116, 20);
        add(jlTitulo);
        txtTitulo = new JTextField();
        txtTitulo.setBounds(450, 24, 300, 20);
        add(txtTitulo);

        jlPregun1 = new JLabel("Pregunta 1:");
        jlPregun1.setBounds(20, 62, 100, 20);
        add(jlPregun1);
        txtPregun1 = new JTextField();
        txtPregun1.setBounds(100, 62, 500, 20);
        add(txtPregun1);
        jlRespuesta1 = new JLabel("Opción 1");
        jlRespuesta1.setBounds(20, 100, 100, 20);
        add(jlRespuesta1);
        txtRespuesta1 = new JTextField();
        txtRespuesta1.setBounds(80, 100, 150, 20);
        add(txtRespuesta1);
        jlRespuesta2 = new JLabel("Opción 2");
        jlRespuesta2.setBounds(235, 100, 100, 20);
        add(jlRespuesta2);
        txtRespuesta2 = new JTextField();
        txtRespuesta2.setBounds(290, 100, 150, 20);
        add(txtRespuesta2);
        jlRespuesta3 = new JLabel("Opción 3");
        jlRespuesta3.setBounds(440, 100, 100, 20);
        add(jlRespuesta3);
        txtRespuesta3 = new JTextField();
        txtRespuesta3.setBounds(495, 100, 150, 20);
        add(txtRespuesta3);
        jlRespuestaCo1 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo1.setBounds(645, 100, 200, 20);
        add(jlRespuestaCo1);
        txtRespuestaCo1 = new JTextField();
        txtRespuestaCo1.setBounds(810, 100, 150, 20);
        add(txtRespuestaCo1);

        jlPregun2 = new JLabel("Pregunta 2:");
        jlPregun2.setBounds(20, 130, 100, 20);
        add(jlPregun2);
        txtPregun2 = new JTextField();
        txtPregun2.setBounds(100, 130, 500, 20);
        add(txtPregun2);
        jlRespuesta4 = new JLabel("Opción 1");
        jlRespuesta4.setBounds(20, 168, 100, 20);
        add(jlRespuesta4);
        txtRespuesta4 = new JTextField();
        txtRespuesta4.setBounds(80, 168, 150, 20);
        add(txtRespuesta4);
        jlRespuesta5 = new JLabel("Opción 2");
        jlRespuesta5.setBounds(235, 168, 100, 20);
        add(jlRespuesta5);
        txtRespuesta5 = new JTextField();
        txtRespuesta5.setBounds(290, 168, 150, 20);
        add(txtRespuesta5);
        jlRespuesta6 = new JLabel("Opción 3");
        jlRespuesta6.setBounds(440, 168, 100, 20);
        add(jlRespuesta6);
        txtRespuesta6 = new JTextField();
        txtRespuesta6.setBounds(495, 168, 150, 20);
        add(txtRespuesta6);
        jlRespuestaCo2 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo2.setBounds(645, 168, 200, 20);
        add(jlRespuestaCo2);
        txtRespuestaCo2 = new JTextField();
        txtRespuestaCo2.setBounds(810, 168, 150, 20);
        add(txtRespuestaCo2);

        jlPregun3 = new JLabel("Pregunta 3:");
        jlPregun3.setBounds(20, 198, 100, 20);
        add(jlPregun3);
        txtPregun3 = new JTextField();
        txtPregun3.setBounds(100, 198, 500, 20);
        add(txtPregun3);
        jlRespuesta7 = new JLabel("Opción 1");
        jlRespuesta7.setBounds(20, 236, 100, 20);
        add(jlRespuesta7);
        txtRespuesta7 = new JTextField();
        txtRespuesta7.setBounds(80, 236, 150, 20);
        add(txtRespuesta7);
        jlRespuesta8 = new JLabel("Opción 2");
        jlRespuesta8.setBounds(235, 236, 100, 20);
        add(jlRespuesta8);
        txtRespuesta8 = new JTextField();
        txtRespuesta8.setBounds(290, 236, 150, 20);
        add(txtRespuesta8);
        jlRespuesta9 = new JLabel("Opción 3");
        jlRespuesta9.setBounds(440, 236, 100, 20);
        add(jlRespuesta9);
        txtRespuesta9 = new JTextField();
        txtRespuesta9.setBounds(495, 236, 150, 20);
        add(txtRespuesta9);
        jlRespuestaCo3 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo3.setBounds(645, 236, 200, 20);
        add(jlRespuestaCo3);
        txtRespuestaCo3 = new JTextField();
        txtRespuestaCo3.setBounds(810, 236, 150, 20);
        add(txtRespuestaCo3);

        jlPregun4 = new JLabel("Pregunta 4:");
        jlPregun4.setBounds(20, 266, 100, 20);
        add(jlPregun4);
        txtPregun4 = new JTextField();
        txtPregun4.setBounds(100, 266, 500, 20);
        add(txtPregun4);
        jlRespuesta10 = new JLabel("Opción 1");
        jlRespuesta10.setBounds(20, 304, 100, 20);
        add(jlRespuesta10);
        txtRespuesta10 = new JTextField();
        txtRespuesta10.setBounds(80, 304, 150, 20);
        add(txtRespuesta10);
        jlRespuesta11 = new JLabel("Opción 2");
        jlRespuesta11.setBounds(235, 304, 100, 20);
        add(jlRespuesta11);
        txtRespuesta11 = new JTextField();
        txtRespuesta11.setBounds(290, 304, 150, 20);
        add(txtRespuesta11);
        jlRespuesta12 = new JLabel("Opción 3");
        jlRespuesta12.setBounds(440, 304, 100, 20);
        add(jlRespuesta12);
        txtRespuesta12 = new JTextField();
        txtRespuesta12.setBounds(495, 304, 150, 20);
        add(txtRespuesta12);
        jlRespuestaCo4 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo4.setBounds(645, 304, 200, 20);
        add(jlRespuestaCo4);
        txtRespuestaCo4 = new JTextField();
        txtRespuestaCo4.setBounds(810, 304, 150, 20);
        add(txtRespuestaCo4);

        jlPregun5 = new JLabel("Pregunta 5:");
        jlPregun5.setBounds(20, 334, 100, 20);
        add(jlPregun5);
        txtPregun5 = new JTextField();
        txtPregun5.setBounds(100, 334, 500, 20);
        add(txtPregun5);
        jlRespuesta13 = new JLabel("Opción 1");
        jlRespuesta13.setBounds(20, 372, 100, 20);
        add(jlRespuesta13);
        txtRespuesta13 = new JTextField();
        txtRespuesta13.setBounds(80, 372, 150, 20);
        add(txtRespuesta13);
        jlRespuesta14 = new JLabel("Opción 2");
        jlRespuesta14.setBounds(235, 372, 100, 20);
        add(jlRespuesta14);
        txtRespuesta14 = new JTextField();
        txtRespuesta14.setBounds(290, 372, 150, 20);
        add(txtRespuesta14);
        jlRespuesta15 = new JLabel("Opción 3");
        jlRespuesta15.setBounds(440, 372, 100, 20);
        add(jlRespuesta15);
        txtRespuesta15 = new JTextField();
        txtRespuesta15.setBounds(495, 372, 150, 20);
        add(txtRespuesta15);
        jlRespuestaCo5 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo5.setBounds(645, 372, 200, 20);
        add(jlRespuestaCo5);
        txtRespuestaCo5 = new JTextField();
        txtRespuestaCo5.setBounds(810, 372, 150, 20);
        add(txtRespuestaCo5);

        jlPregun6 = new JLabel("Pregunta 6:");
        jlPregun6.setBounds(20, 402, 100, 20);
        add(jlPregun6);
        txtPregun6 = new JTextField();
        txtPregun6.setBounds(100, 402, 500, 20);
        add(txtPregun6);
        jlRespuesta16 = new JLabel("Opción 1");
        jlRespuesta16.setBounds(20, 440, 100, 20);
        add(jlRespuesta16);
        txtRespuesta16 = new JTextField();
        txtRespuesta16.setBounds(80, 440, 150, 20);
        add(txtRespuesta16);
        jlRespuesta17 = new JLabel("Opción 2");
        jlRespuesta17.setBounds(235, 440, 100, 20);
        add(jlRespuesta17);
        txtRespuesta17 = new JTextField();
        txtRespuesta17.setBounds(290, 440, 150, 20);
        add(txtRespuesta17);
        jlRespuesta18 = new JLabel("Opción 3");
        jlRespuesta18.setBounds(440, 440, 100, 20);
        add(jlRespuesta18);
        txtRespuesta18 = new JTextField();
        txtRespuesta18.setBounds(495, 440, 150, 20);
        add(txtRespuesta18);
        jlRespuestaCo6 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo6.setBounds(645, 440, 200, 20);
        add(jlRespuestaCo6);
        txtRespuestaCo6 = new JTextField();
        txtRespuestaCo6.setBounds(810, 440, 150, 20);
        add(txtRespuestaCo6);

        jlPregun7 = new JLabel("Pregunta 7:");
        jlPregun7.setBounds(20, 470, 100, 20);
        add(jlPregun7);
        txtPregun7 = new JTextField();
        txtPregun7.setBounds(100, 470, 500, 20);
        add(txtPregun7);
        jlRespuesta19 = new JLabel("Opción 1");
        jlRespuesta19.setBounds(20, 508, 100, 20);
        add(jlRespuesta19);
        txtRespuesta19 = new JTextField();
        txtRespuesta19.setBounds(80, 508, 150, 20);
        add(txtRespuesta19);
        jlRespuesta20 = new JLabel("Opción 2");
        jlRespuesta20.setBounds(235, 508, 100, 20);
        add(jlRespuesta20);
        txtRespuesta20 = new JTextField();
        txtRespuesta20.setBounds(290, 508, 150, 20);
        add(txtRespuesta20);
        jlRespuesta21 = new JLabel("Opción 3");
        jlRespuesta21.setBounds(440, 508, 100, 20);
        add(jlRespuesta21);
        txtRespuesta21 = new JTextField();
        txtRespuesta21.setBounds(495, 508, 150, 20);
        add(txtRespuesta21);
        jlRespuestaCo7 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo7.setBounds(645, 508, 200, 20);
        add(jlRespuestaCo7);
        txtRespuestaCo7 = new JTextField();
        txtRespuestaCo7.setBounds(810, 508, 150, 20);
        add(txtRespuestaCo7);

        jlPregun8 = new JLabel("Pregunta 8:");
        jlPregun8.setBounds(20, 538, 100, 20);
        add(jlPregun8);
        txtPregun8 = new JTextField();
        txtPregun8.setBounds(100, 538, 500, 20);
        add(txtPregun8);
        jlRespuesta22 = new JLabel("Opción 1");
        jlRespuesta22.setBounds(20, 576, 100, 20);
        add(jlRespuesta22);
        txtRespuesta22 = new JTextField();
        txtRespuesta22.setBounds(80, 576, 150, 20);
        add(txtRespuesta22);
        jlRespuesta23 = new JLabel("Opción 2");
        jlRespuesta23.setBounds(235, 576, 100, 20);
        add(jlRespuesta23);
        txtRespuesta23 = new JTextField();
        txtRespuesta23.setBounds(290, 576, 150, 20);
        add(txtRespuesta23);
        jlRespuesta24 = new JLabel("Opción 3");
        jlRespuesta24.setBounds(440, 576, 100, 20);
        add(jlRespuesta24);
        txtRespuesta24 = new JTextField();
        txtRespuesta24.setBounds(495, 576, 150, 20);
        add(txtRespuesta24);
        jlRespuestaCo8 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo8.setBounds(645, 576, 200, 20);
        add(jlRespuestaCo8);
        txtRespuestaCo8 = new JTextField();
        txtRespuestaCo8.setBounds(810, 576, 150, 20);
        add(txtRespuestaCo8);

        jlPregun9 = new JLabel("Pregunta 9:");
        jlPregun9.setBounds(20, 606, 100, 20);
        add(jlPregun9);
        txtPregun9 = new JTextField();
        txtPregun9.setBounds(100, 606, 500, 20);
        add(txtPregun9);
        jlRespuesta25 = new JLabel("Opción 1");
        jlRespuesta25.setBounds(20, 644, 100, 20);
        add(jlRespuesta25);
        txtRespuesta25 = new JTextField();
        txtRespuesta25.setBounds(80, 644, 150, 20);
        add(txtRespuesta25);
        jlRespuesta26 = new JLabel("Opción 2");
        jlRespuesta26.setBounds(235, 644, 100, 20);
        add(jlRespuesta26);
        txtRespuesta26 = new JTextField();
        txtRespuesta26.setBounds(290, 644, 150, 20);
        add(txtRespuesta26);
        jlRespuesta27 = new JLabel("Opción 3");
        jlRespuesta27.setBounds(440, 644, 100, 20);
        add(jlRespuesta27);
        txtRespuesta27 = new JTextField();
        txtRespuesta27.setBounds(495, 644, 150, 20);
        add(txtRespuesta27);
        jlRespuestaCo9 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo9.setBounds(645, 644, 200, 20);
        add(jlRespuestaCo9);
        txtRespuestaCo9 = new JTextField();
        txtRespuestaCo9.setBounds(810, 644, 150, 20);
        add(txtRespuestaCo9);

        jlPregun10 = new JLabel("Pregunta 10:");
        jlPregun10.setBounds(20, 674, 100, 20);
        add(jlPregun10);
        txtPregun10 = new JTextField();
        txtPregun10.setBounds(100, 674, 500, 20);
        add(txtPregun10);
        jlRespuesta28 = new JLabel("Opción 1");
        jlRespuesta28.setBounds(20, 712, 100, 20);
        add(jlRespuesta28);
        txtRespuesta28 = new JTextField();
        txtRespuesta28.setBounds(80, 712, 150, 20);
        add(txtRespuesta28);
        jlRespuesta29 = new JLabel("Opción 2");
        jlRespuesta29.setBounds(235, 712, 100, 20);
        add(jlRespuesta29);
        txtRespuesta29 = new JTextField();
        txtRespuesta29.setBounds(290, 712, 150, 20);
        add(txtRespuesta29);
        jlRespuesta30 = new JLabel("Opción 3");
        jlRespuesta30.setBounds(440, 712, 100, 20);
        add(jlRespuesta30);
        txtRespuesta30 = new JTextField();
        txtRespuesta30.setBounds(495, 712, 150, 20);
        add(txtRespuesta30);
        jlRespuestaCo10 = new JLabel("Reescribe la opción correcta");
        jlRespuestaCo10.setBounds(645, 712, 200, 20);
        add(jlRespuestaCo10);
        txtRespuestaCo10 = new JTextField();
        txtRespuestaCo10.setBounds(810, 712, 150, 20);
        add(txtRespuestaCo10);

        jbGuardar = new JButton("Guardar Examen");
        jbGuardar.setBounds(900, 550, 200, 50);
        add(jbGuardar);
        jbGuardar.addActionListener(this);

        jbRegresar = new JButton("Regresar");
        jbRegresar.setBounds(30, 750, 200, 50);
        add(jbRegresar);
        jbRegresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Guardar Examen")) {
            Examen exam = new Examen();
            boolean agregar = true;
            examen.abrir();
            if (txtTitulo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setTitulo(txtTitulo.getText());

            if (txtPregun1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta1(txtPregun1.getText());

            if (txtPregun2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta2(txtPregun2.getText());

            if (txtPregun3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta3(txtPregun3.getText());

            if (txtPregun4.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta4(txtPregun4.getText());

            if (txtPregun5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta5(txtPregun5.getText());

            if (txtPregun6.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta6(txtPregun6.getText());

            if (txtPregun7.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta7(txtPregun7.getText());

            if (txtPregun8.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta8(txtPregun8.getText());

            if (txtPregun9.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta9(txtPregun9.getText());

            if (txtPregun10.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setPregunta10(txtPregun10.getText());

            if (txtRespuesta1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta1(txtRespuesta1.getText());

            if (txtRespuesta2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta2(txtRespuesta2.getText());

            if (txtRespuesta3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta3(txtRespuesta3.getText());

            if (txtRespuesta4.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta4(txtRespuesta4.getText());

            if (txtRespuesta5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta5(txtRespuesta5.getText());

            if (txtRespuesta6.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta6(txtRespuesta6.getText());

            if (txtRespuesta7.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta7(txtRespuesta7.getText());

            if (txtRespuesta8.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta8(txtRespuesta8.getText());

            if (txtRespuesta9.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta9(txtRespuesta9.getText());

            if (txtRespuesta10.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta10(txtRespuesta10.getText());

            if (txtRespuesta11.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta11(txtRespuesta11.getText());

            if (txtRespuesta12.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta12(txtRespuesta12.getText());

            if (txtRespuesta13.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta13(txtRespuesta13.getText());

            if (txtRespuesta14.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta14(txtRespuesta14.getText());

            if (txtRespuesta15.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta15(txtRespuesta15.getText());

            if (txtRespuesta16.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta16(txtRespuesta16.getText());

            if (txtRespuesta17.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta17(txtRespuesta17.getText());

            if (txtRespuesta18.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta18(txtRespuesta18.getText());

            if (txtRespuesta19.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta19(txtRespuesta19.getText());

            if (txtRespuesta20.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta20(txtRespuesta20.getText());

            if (txtRespuesta21.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta21(txtRespuesta21.getText());

            if (txtRespuesta22.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta22(txtRespuesta22.getText());

            if (txtRespuesta23.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta23(txtRespuesta23.getText());

            if (txtRespuesta24.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta24(txtRespuesta24.getText());

            if (txtRespuesta25.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta25(txtRespuesta25.getText());

            if (txtRespuesta26.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta26(txtRespuesta26.getText());

            if (txtRespuesta27.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta27(txtRespuesta27.getText());

            if (txtRespuesta28.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta28(txtRespuesta28.getText());

            if (txtRespuesta29.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta29(txtRespuesta29.getText());

            if (txtRespuesta30.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespuesta30(txtRespuesta30.getText());

            if (txtRespuestaCo1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec1(txtRespuestaCo1.getText());

            if (txtRespuestaCo2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec2(txtRespuestaCo2.getText());

            if (txtRespuestaCo3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec3(txtRespuestaCo3.getText());

            if (txtRespuestaCo4.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec4(txtRespuestaCo4.getText());

            if (txtRespuestaCo5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec5(txtRespuestaCo5.getText());

            if (txtRespuestaCo6.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec6(txtRespuestaCo6.getText());

            if (txtRespuestaCo7.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec7(txtRespuestaCo7.getText());

            if (txtRespuestaCo8.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec8(txtRespuestaCo8.getText());

            if (txtRespuestaCo9.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec9(txtRespuestaCo9.getText());

            if (txtRespuestaCo10.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena todos los campos");
                agregar = false;
            } else
                exam.setRespueCorrec10(txtRespuestaCo10.getText());

            if (exam.getRespueCorrec1().equals(exam.getRespuesta1())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec1().equals(exam.getRespuesta2())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec1().equals(exam.getRespuesta3()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

            if (exam.getRespueCorrec2().equals(exam.getRespuesta4())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec2().equals(exam.getRespuesta5())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec2().equals(exam.getRespuesta6()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

            if (exam.getRespueCorrec3().equals(exam.getRespuesta7())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec3().equals(exam.getRespuesta8())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec3().equals(exam.getRespuesta9()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

            if (exam.getRespueCorrec4().equals(exam.getRespuesta10())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec4().equals(exam.getRespuesta11())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec4().equals(exam.getRespuesta12()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

            if (exam.getRespueCorrec5().equals(exam.getRespuesta13())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec5().equals(exam.getRespuesta14())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec5().equals(exam.getRespuesta15()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

            if (exam.getRespueCorrec6().equals(exam.getRespuesta16())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec6().equals(exam.getRespuesta17())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec6().equals(exam.getRespuesta18()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

            if (exam.getRespueCorrec7().equals(exam.getRespuesta19())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec7().equals(exam.getRespuesta20())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec7().equals(exam.getRespuesta21()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

            if (exam.getRespueCorrec8().equals(exam.getRespuesta22())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec8().equals(exam.getRespuesta23())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec8().equals(exam.getRespuesta24()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

            if (exam.getRespueCorrec9().equals(exam.getRespuesta25())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec9().equals(exam.getRespuesta26())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec9().equals(exam.getRespuesta27()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

            if (exam.getRespueCorrec10().equals(exam.getRespuesta28())) {
                agregar = true;
            }
            else {
                if (exam.getRespueCorrec10().equals(exam.getRespuesta29())) {
                    agregar = true;
                } else {
                    if (exam.getRespueCorrec10().equals(exam.getRespuesta30()))
                        agregar = true;
                    else {
                        JOptionPane.showMessageDialog(null, "La respuesta correcta debe coincidir con una opcion");
                        agregar = false;
                    }
                }
            }

                if (agregar == true) {
                    examen.GuardarExa(exam);
                    JOptionPane.showMessageDialog(null, "Examen guardado");
                    System.out.println(exam.getTitulo());
                    examen.actualizar();
                }
            }
            if (e.getActionCommand().equals("Regresar")) {
                dispose();
                new GesExam();
            }
        }
}






package Administrador.ExamenesAdmin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class EliminarExam extends JFrame implements ActionListener{
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
    private JButton jbEliminar;
    private JButton jbRegresar;
    private ArrayExa examen;
    private JLabel jlTitulo2;
    JButton salir,minimizar,volver;

    public EliminarExam(String titulo){
        setLayout(null);
        setSize(1100,850);
        setLocationRelativeTo(null);
        accionesVentana();
        setUndecorated(true);
        iniciarComponentes(titulo);
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

    public void iniciarComponentes(String titulo){
        examen = new ArrayExa();
        examen.abrir();
        Examen exa = new Examen();
        exa=examen.traerObjeto(titulo);
        jlTitulo = new JLabel("Titulo:");
        jlTitulo.setBounds(400, 24, 116, 20);
        add(jlTitulo);
        jlTitulo2 = new JLabel(exa.getTitulo());
        jlTitulo.setBounds(450, 24, 500, 20);
        add(jlTitulo);
        jlPregun1 = new JLabel("Pregunta 1: " +  exa.getPregunta1());
        jlPregun1.setBounds(20, 62, 1000, 20);
        add(jlPregun1);
        jlRespuesta1 = new JLabel("Opción 1: " + exa.getRespuesta1());
        jlRespuesta1.setBounds(20,100,250,20);
        add(jlRespuesta1);
        jlRespuesta2 = new JLabel("Opción 2: " + exa.getRespuesta2());
        jlRespuesta2.setBounds(235,100,250,20);
        add(jlRespuesta2);
        jlRespuesta3 = new JLabel("Opción 3: " + exa.getRespuesta3());
        jlRespuesta3.setBounds(440,100,250,20);
        add(jlRespuesta3);
        jlRespuestaCo1 = new JLabel("Opción correcta: " + exa.getRespueCorrec1());
        jlRespuestaCo1.setBounds(645, 100, 350, 20);
        add(jlRespuestaCo1);
        jlPregun2 = new JLabel("Pregunta 2: " + exa.getPregunta2());
        jlPregun2.setBounds(20, 130, 1000, 20);
        add(jlPregun2);
        jlRespuesta4 = new JLabel("Opción 1: " + exa.getRespuesta4());
        jlRespuesta4.setBounds(20,168,250,20);
        add(jlRespuesta4);
        jlRespuesta5 = new JLabel("Opción 2: " + exa.getRespuesta5());
        jlRespuesta5.setBounds(235,168,250,20);
        add(jlRespuesta5);
        jlRespuesta6 = new JLabel("Opción 3: " + exa.getRespuesta6());
        jlRespuesta6.setBounds(440,168,250,20);
        add(jlRespuesta6);
        jlRespuestaCo2 = new JLabel("Opción correcta: " + exa.getRespueCorrec2());
        jlRespuestaCo2.setBounds(645, 168, 350, 20);
        add(jlRespuestaCo2);
        jlPregun3 = new JLabel("Pregunta 3: " + exa.getPregunta3());
        jlPregun3.setBounds(20, 198, 1000, 20);
        add(jlPregun3);
        jlRespuesta7 = new JLabel("Opción 1: " + exa.getRespuesta7());
        jlRespuesta7.setBounds(20,236,250,20);
        add(jlRespuesta7);
        jlRespuesta8 = new JLabel("Opción 2: " + exa.getRespuesta8());
        jlRespuesta8.setBounds(235,236,250,20);
        add(jlRespuesta8);
        jlRespuesta9 = new JLabel("Opción 3: " + exa.getRespuesta9());
        jlRespuesta9.setBounds(440,236,250,20);
        add(jlRespuesta9);
        jlRespuestaCo3 = new JLabel("Opción correcta: " + exa.getRespueCorrec3());
        jlRespuestaCo3.setBounds(645, 236, 350, 20);
        add(jlRespuestaCo3);
        jlPregun4 = new JLabel("Pregunta 4:");
        jlPregun4.setBounds(20, 266, 1000, 20);
        add(jlPregun4);
        jlRespuesta10 = new JLabel("Opción 1: " + exa.getRespuesta10());
        jlRespuesta10.setBounds(20,304,250,20);
        add(jlRespuesta10);
        jlRespuesta11 = new JLabel("Opción 2: " + exa.getRespuesta11());
        jlRespuesta11.setBounds(235,304,250,20);
        add(jlRespuesta11);
        jlRespuesta12 = new JLabel("Opción 3: " + exa.getRespuesta12());
        jlRespuesta12.setBounds(440,304,250,20);
        add(jlRespuesta12);
        jlRespuestaCo4 = new JLabel("Opción correcta: " + exa.getRespueCorrec4());
        jlRespuestaCo4.setBounds(645, 304, 350, 20);
        add(jlRespuestaCo4);
        jlPregun5 = new JLabel("Pregunta 5: " + exa.getPregunta5());
        jlPregun5.setBounds(20, 334, 1000, 20);
        add(jlPregun5);
        jlRespuesta13 = new JLabel("Opción 1: " + exa.getRespuesta13());
        jlRespuesta13.setBounds(20,372,250,20);
        add(jlRespuesta13);
        jlRespuesta14 = new JLabel("Opción 2: " + exa.getRespuesta14());
        jlRespuesta14.setBounds(235,372,250,20);
        add(jlRespuesta14);
        jlRespuesta15 = new JLabel("Opción 3: " + exa.getRespuesta15());
        jlRespuesta15.setBounds(440,372,250,20);
        add(jlRespuesta15);
        jlRespuestaCo5 = new JLabel("Opción correcta: " + exa.getRespueCorrec5());
        jlRespuestaCo5.setBounds(645, 372, 350, 20);
        add(jlRespuestaCo5);
        jlPregun6 = new JLabel("Pregunta 6: " + exa.getPregunta6());
        jlPregun6.setBounds(20, 402, 1000, 20);
        add(jlPregun6);
        jlRespuesta16 = new JLabel("Opción 1: " + exa.getRespuesta16());
        jlRespuesta16.setBounds(20,440,250,20);
        add(jlRespuesta16);
        jlRespuesta17 = new JLabel("Opción 2: " + exa.getRespuesta17());
        jlRespuesta17.setBounds(235,440,250,20);
        add(jlRespuesta17);
        jlRespuesta18 = new JLabel("Opción 3: " + exa.getRespuesta18());
        jlRespuesta18.setBounds(440,440,250,20);
        add(jlRespuesta18);
        jlRespuestaCo6 = new JLabel("Opción correcta: " + exa.getRespueCorrec6());
        jlRespuestaCo6.setBounds(645, 440, 350, 20);
        add(jlRespuestaCo6);
        jlPregun7 = new JLabel("Pregunta 7: " + exa.getPregunta7());
        jlPregun7.setBounds(20, 470, 1000, 20);
        add(jlPregun7);
        jlRespuesta19 = new JLabel("Opción 1: " + exa.getRespuesta19());
        jlRespuesta19.setBounds(20,508,250,20);
        add(jlRespuesta19);
        jlRespuesta20 = new JLabel("Opción 2: " + exa.getRespuesta20());
        jlRespuesta20.setBounds(235,508,250,20);
        add(jlRespuesta20);
        jlRespuesta21 = new JLabel("Opción 3: " + exa.getRespuesta21());
        jlRespuesta21.setBounds(440,508,250,20);
        add(jlRespuesta21);
        jlRespuestaCo7 = new JLabel("Opción correcta: " + exa.getRespueCorrec7());
        jlRespuestaCo7.setBounds(645, 508, 350, 20);
        add(jlRespuestaCo7);
        jlPregun8 = new JLabel("Pregunta 8: " + exa.getPregunta8());
        jlPregun8.setBounds(20, 538, 1000, 20);
        add(jlPregun8);
        jlRespuesta22 = new JLabel("Opción 1: " + exa.getRespuesta22());
        jlRespuesta22.setBounds(20,576,250,20);
        add(jlRespuesta22);
        jlRespuesta23 = new JLabel("Opción 2: " + exa.getRespuesta23());
        jlRespuesta23.setBounds(235,576,250,20);
        add(jlRespuesta23);
        jlRespuesta24 = new JLabel("Opción 3: " + exa.getRespuesta24());
        jlRespuesta24.setBounds(440,576,250,20);
        add(jlRespuesta24);
        jlRespuestaCo8 = new JLabel("Opción correcta: " + exa.getRespueCorrec8());
        jlRespuestaCo8.setBounds(645, 576, 350, 20);
        add(jlRespuestaCo8);
        jlPregun9 = new JLabel("Pregunta 9: " + exa.getPregunta9());
        jlPregun9.setBounds(20, 606, 1000, 20);
        add(jlPregun9);
        jlRespuesta25 = new JLabel("Opción 1: " + exa.getRespuesta25());
        jlRespuesta25.setBounds(20,644,250,20);
        add(jlRespuesta25);
        jlRespuesta26 = new JLabel("Opción 2: " + exa.getRespuesta26());
        jlRespuesta26.setBounds(235,644,250,20);
        add(jlRespuesta26);
        jlRespuesta27 = new JLabel("Opción 3: " + exa.getRespuesta27());
        jlRespuesta27.setBounds(440,644,250,20);
        add(jlRespuesta27);
        jlRespuestaCo9 = new JLabel("Opción correcta: " + exa.getRespueCorrec9());
        jlRespuestaCo9.setBounds(645, 644, 350, 20);
        add(jlRespuestaCo9);
        jlPregun10 = new JLabel("Pregunta 10: " + exa.getRespueCorrec10());
        jlPregun10.setBounds(20, 674, 1000, 20);
        add(jlPregun10);
        jlRespuesta28 = new JLabel("Opción 1: " + exa.getRespuesta28());
        jlRespuesta28.setBounds(20,712,250,20);
        add(jlRespuesta28);
        jlRespuesta29 = new JLabel("Opción 2: " + exa.getRespuesta29());
        jlRespuesta29.setBounds(235,712,250,20);
        add(jlRespuesta29);
        jlRespuesta30 = new JLabel("Opción 3: " + exa.getRespuesta30());
        jlRespuesta30.setBounds(440,712,250,20);
        add(jlRespuesta30);
        jlRespuestaCo10 = new JLabel("Opción correcta: " + exa.getRespueCorrec10());
        jlRespuestaCo10.setBounds(645, 712, 350, 20);
        add(jlRespuestaCo10);
        jbEliminar = new JButton("Eliminar examen");
        jbEliminar.setBounds(850,750,200,50);
        add(jbEliminar);
        jbEliminar.addActionListener(this);
        jbRegresar = new JButton("Regresar");
        jbRegresar.setBounds(30, 750, 200, 50);
        add(jbRegresar);
        jbRegresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Eliminar examen")){
            examen.abrir();
            int pos;
            int confirmar;
            confirmar = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar este examen?", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            if (confirmar == 0) {
                pos = examen.traePosicion(jlTitulo2.getText());
                JOptionPane.showMessageDialog(null, "Examen eliminado");
                System.out.println(jlTitulo.getText());
                examen.eliminar(pos);
                examen.actualizar();
                dispose();
                GesExam ges = new GesExam();
            }
            if(e.getActionCommand().equals("Regresar")){
                dispose();
                GesExam ges = new GesExam();
            }
        }
    }
}






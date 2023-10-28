
package Usuarios.Examenes;
import Administrador.ExamenesAdmin.Examen;
import Administrador.ExamenesAdmin.ArrayExa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

import Usuarios.LoginRegistro.ArrayDatosAlumnos;
import Usuarios.LoginRegistro.DatosAlumno;
import Usuarios.principalUser;

public class ResponderExa extends JFrame implements ActionListener{
    private JLabel jlTitulo;
    private JLabel jlPregunta1;
    private JLabel jlPregunta2;
    private JLabel jlPregunta3;
    private JLabel jlPregunta4;
    private JLabel jlPregunta5;
    private JLabel jlPregunta6;
    private JLabel jlPregunta7;
    private JLabel jlPregunta8;
    private JLabel jlPregunta9;
    private JLabel jlPregunta10;
    private JLabel noAl;
    private JRadioButton jrRespuesta1;
    private JRadioButton jrRespuesta2;
    private JRadioButton jrRespuesta3;
    private JRadioButton jrRespuesta4;
    private JRadioButton jrRespuesta5;
    private JRadioButton jrRespuesta6;
    private JRadioButton jrRespuesta7;
    private JRadioButton jrRespuesta8;
    private JRadioButton jrRespuesta9;
    private JRadioButton jrRespuesta10;
    private JRadioButton jrRespuesta11;
    private JRadioButton jrRespuesta12;
    private JRadioButton jrRespuesta13;
    private JRadioButton jrRespuesta14;
    private JRadioButton jrRespuesta15;
    private JRadioButton jrRespuesta16;
    private JRadioButton jrRespuesta17;
    private JRadioButton jrRespuesta18;
    private JRadioButton jrRespuesta19;
    private JRadioButton jrRespuesta20;
    private JRadioButton jrRespuesta21;
    private JRadioButton jrRespuesta22;
    private JRadioButton jrRespuesta23;
    private JRadioButton jrRespuesta24;
    private JRadioButton jrRespuesta25;
    private JRadioButton jrRespuesta26;
    private JRadioButton jrRespuesta27;
    private JRadioButton jrRespuesta28;
    private JRadioButton jrRespuesta29;
    private JRadioButton jrRespuesta30;
    private ButtonGroup bgPregunta1;
    private ButtonGroup bgPregunta2;
    private ButtonGroup bgPregunta3;
    private ButtonGroup bgPregunta4;
    private ButtonGroup bgPregunta5;
    private ButtonGroup bgPregunta6;
    private ButtonGroup bgPregunta7;
    private ButtonGroup bgPregunta8;
    private ButtonGroup bgPregunta9;
    private ButtonGroup bgPregunta10;
    private JButton jbCalificar;
    private JButton jbRegresar;
    private int calificacion;
    private ArrayExa examen;
    private ArrayDatosAlumnos alumno;
    private ArrayCalificaciones cal;
    JButton salir, minimizar, volver;

    public ResponderExa (String titulo, int numBo){
        examen = new ArrayExa();
        setLayout(null);
        setSize(1100,850);
        setLocationRelativeTo(null);
        setUndecorated(true);
        iniciarComponentes(titulo, numBo);
        setVisible(true);
        accionesVentana();
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
                new principalUser(1);
            }
        });
    }

    public void iniciarComponentes(String titulo,int numBo){
        examen = new ArrayExa();
        examen.abrir();

        noAl = new JLabel(String.valueOf(numBo));

        Examen exa = new Examen();
        exa=examen.traerObjeto(titulo);
        jlTitulo = new JLabel(exa.getTitulo());
        jlTitulo.setBounds(400, 24, 116, 20);
        add(jlTitulo);

        jlPregunta1 = new JLabel("1° " + exa.getPregunta1());
        jlPregunta1.setBounds(20, 62, 1000, 20);
        add(jlPregunta1);

        jrRespuesta1 = new JRadioButton("A) " + exa.getRespuesta1());
        jrRespuesta1.setBounds(50, 100, 300, 20);
        add(jrRespuesta1);


        jrRespuesta2 = new JRadioButton("B) " + exa.getRespuesta2());
        jrRespuesta2.setBounds(350,100,300,20);
        add(jrRespuesta2);

        jrRespuesta3 = new JRadioButton("C) " + exa.getRespuesta3());
        jrRespuesta3.setBounds(700, 100, 300, 20);
        add(jrRespuesta3);

        bgPregunta1 = new ButtonGroup();
        bgPregunta1.add(jrRespuesta1);
        bgPregunta1.add(jrRespuesta2);
        bgPregunta1.add(jrRespuesta3);

        jlPregunta2 = new JLabel("2° " + exa.getPregunta2());
        jlPregunta2.setBounds(20, 130, 1000, 20);
        add(jlPregunta2);

        jrRespuesta4 = new JRadioButton("A) " + exa.getRespuesta4());
        jrRespuesta4.setBounds(50, 168, 300, 20);
        add(jrRespuesta4);

        jrRespuesta5 = new JRadioButton("B) " + exa.getRespuesta5());
        jrRespuesta5.setBounds(350,168,300,20);
        add(jrRespuesta5);

        jrRespuesta6 = new JRadioButton("C) " + exa.getRespuesta6());
        jrRespuesta6.setBounds(700, 168, 300, 20);
        add(jrRespuesta6);

        bgPregunta2 = new ButtonGroup();
        bgPregunta2.add(jrRespuesta4);
        bgPregunta2.add(jrRespuesta5);
        bgPregunta2.add(jrRespuesta6);

        jlPregunta3 = new JLabel("3° " + exa.getPregunta3());
        jlPregunta3.setBounds(20, 198, 1000, 20);
        add(jlPregunta3);

        jrRespuesta7 = new JRadioButton("A) " + exa.getRespuesta7());
        jrRespuesta7.setBounds(50, 236, 300, 20);
        add(jrRespuesta7);

        jrRespuesta8 = new JRadioButton("B) " + exa.getRespuesta8());
        jrRespuesta8.setBounds(350,236,300,20);
        add(jrRespuesta8);

        jrRespuesta9 = new JRadioButton("C) " + exa.getRespuesta9());
        jrRespuesta9.setBounds(700, 236, 300, 20);
        add(jrRespuesta9);

        bgPregunta3 = new ButtonGroup();
        bgPregunta3.add(jrRespuesta7);
        bgPregunta3.add(jrRespuesta8);
        bgPregunta3.add(jrRespuesta9);

        jlPregunta4 = new JLabel("4° " + exa.getPregunta4());
        jlPregunta4.setBounds(20, 266, 1000, 20);
        add(jlPregunta4);

        jrRespuesta10 = new JRadioButton("A) " + exa.getRespuesta10());
        jrRespuesta10.setBounds(50, 304, 300, 20);
        add(jrRespuesta10);

        jrRespuesta11 = new JRadioButton("B) " + exa.getRespuesta11());
        jrRespuesta11.setBounds(350,304,300,20);
        add(jrRespuesta11);

        jrRespuesta12 = new JRadioButton("C) " + exa.getRespuesta12());
        jrRespuesta12.setBounds(700, 304, 300, 20);
        add(jrRespuesta12);

        bgPregunta4 = new ButtonGroup();
        bgPregunta4.add(jrRespuesta10);
        bgPregunta4.add(jrRespuesta11);
        bgPregunta4.add(jrRespuesta12);

        jlPregunta5 = new JLabel("5° " + exa.getPregunta5());
        jlPregunta5.setBounds(20, 334, 1000, 20);
        add(jlPregunta5);

        jrRespuesta13 = new JRadioButton("A) " + exa.getRespuesta13());
        jrRespuesta13.setBounds(50, 372, 300, 20);
        add(jrRespuesta13);

        jrRespuesta14 = new JRadioButton("B) " + exa.getRespuesta14());
        jrRespuesta14.setBounds(350,372,300,20);
        add(jrRespuesta14);

        jrRespuesta15 = new JRadioButton("C) " + exa.getRespuesta15());
        jrRespuesta15.setBounds(700, 372, 300, 20);
        add(jrRespuesta15);

        bgPregunta5 = new ButtonGroup();
        bgPregunta5.add(jrRespuesta13);
        bgPregunta5.add(jrRespuesta14);
        bgPregunta5.add(jrRespuesta15);

        jlPregunta6 = new JLabel("6° " + exa.getPregunta6());
        jlPregunta6.setBounds(20, 402, 1000, 20);
        add(jlPregunta6);

        jrRespuesta16 = new JRadioButton("A) " + exa.getRespuesta16());
        jrRespuesta16.setBounds(50, 440, 300, 20);
        add(jrRespuesta16);

        jrRespuesta17 = new JRadioButton("B) " + exa.getRespuesta17());
        jrRespuesta17.setBounds(350,440,300,20);
        add(jrRespuesta17);

        jrRespuesta18 = new JRadioButton("C) " + exa.getRespuesta18());
        jrRespuesta18.setBounds(700, 440, 300, 20);
        add(jrRespuesta18);

        bgPregunta6 = new ButtonGroup();
        bgPregunta6.add(jrRespuesta16);
        bgPregunta6.add(jrRespuesta17);
        bgPregunta6.add(jrRespuesta18);

        jlPregunta7 = new JLabel("7° " + exa.getPregunta7());
        jlPregunta7.setBounds(20, 470, 1000, 20);
        add(jlPregunta7);

        jrRespuesta19 = new JRadioButton("A) " + exa.getRespuesta19());
        jrRespuesta19.setBounds(50, 508, 300, 20);
        add(jrRespuesta19);

        jrRespuesta20 = new JRadioButton("B) " + exa.getRespuesta20());
        jrRespuesta20.setBounds(350,508,300,20);
        add(jrRespuesta20);

        jrRespuesta21 = new JRadioButton("C) " + exa.getRespuesta21());
        jrRespuesta21.setBounds(700, 508, 300, 20);
        add(jrRespuesta21);

        bgPregunta7 = new ButtonGroup();
        bgPregunta7.add(jrRespuesta19);
        bgPregunta7.add(jrRespuesta20);
        bgPregunta7.add(jrRespuesta21);

        jlPregunta8 = new JLabel("8° " + exa.getPregunta8());
        jlPregunta8.setBounds(20, 538, 1000, 20);
        add(jlPregunta8);

        jrRespuesta22 = new JRadioButton("A) " + exa.getRespuesta22());
        jrRespuesta22.setBounds(50, 576, 300, 20);
        add(jrRespuesta22);

        jrRespuesta23 = new JRadioButton("B) " + exa.getRespuesta23());
        jrRespuesta23.setBounds(350,576,300,20);
        add(jrRespuesta23);

        jrRespuesta24 = new JRadioButton("C) " + exa.getRespuesta24());
        jrRespuesta24.setBounds(700, 576, 300, 20);
        add(jrRespuesta24);

        bgPregunta8 = new ButtonGroup();
        bgPregunta8.add(jrRespuesta22);
        bgPregunta8.add(jrRespuesta23);
        bgPregunta8.add(jrRespuesta24);

        jlPregunta9 = new JLabel("9° " + exa.getPregunta9());
        jlPregunta9.setBounds(20, 606, 1000, 20);
        add(jlPregunta9);

        jrRespuesta25 = new JRadioButton("A) " + exa.getRespuesta25());
        jrRespuesta25.setBounds(50, 644, 300, 20);
        add(jrRespuesta25);

        jrRespuesta26 = new JRadioButton("B) " + exa.getRespuesta26());
        jrRespuesta26.setBounds(350,644,300,20);
        add(jrRespuesta26);

        jrRespuesta27 = new JRadioButton("C) " + exa.getRespuesta27());
        jrRespuesta27.setBounds(700, 644, 300, 20);
        add(jrRespuesta27);

        bgPregunta9 = new ButtonGroup();
        bgPregunta9.add(jrRespuesta25);
        bgPregunta9.add(jrRespuesta26);
        bgPregunta9.add(jrRespuesta27);

        jlPregunta10 = new JLabel("10° " + exa.getPregunta10());
        jlPregunta10.setBounds(20, 674, 1000, 20);
        add(jlPregunta10);

        jrRespuesta28 = new JRadioButton("A) " + exa.getRespuesta28());
        jrRespuesta28.setBounds(50, 712, 300, 20);
        add(jrRespuesta28);

        jrRespuesta29 = new JRadioButton("B) " + exa.getRespuesta29());
        jrRespuesta29.setBounds(350,712,300,20);
        add(jrRespuesta29);

        jrRespuesta30 = new JRadioButton("C) " + exa.getRespuesta30());
        jrRespuesta30.setBounds(700, 712, 300, 20);
        add(jrRespuesta30);

        bgPregunta10 = new ButtonGroup();
        bgPregunta10.add(jrRespuesta28);
        bgPregunta10.add(jrRespuesta29);
        bgPregunta10.add(jrRespuesta30);

        jbCalificar = new JButton("Calificar");
        jbCalificar.setBounds(900, 550, 200, 50);
        add(jbCalificar);
        jbCalificar.addActionListener(this);

        jbRegresar = new JButton("Regresar");
        jbRegresar.setBounds(30, 750, 200, 50);
        add(jbRegresar);
        jbRegresar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calificacion = 0;
        alumno = new ArrayDatosAlumnos();
        examen = new ArrayExa();
        cal = new ArrayCalificaciones();
        cal.abrir();
        examen.abrir();
        DatosAlumno Alum = new DatosAlumno();
        Alum = alumno.llamarObj(Integer.parseInt(noAl.getText()));
        boolean guardo = false;
        Examen exa = new Examen();
        Calificaciones alum = new Calificaciones();
        exa=examen.traerObjeto(jlTitulo.getText());
        if(e.getActionCommand().equals("Calificar")){
            if(jrRespuesta1.isSelected())
                if(exa.getRespuesta1().equals(exa.getRespueCorrec1()))
                    calificacion = calificacion + 1;
            if(jrRespuesta2.isSelected())
                if(exa.getRespuesta2().equals(exa.getRespueCorrec1()))
                    calificacion = calificacion + 1;
            if(jrRespuesta3.isSelected())
                if(exa.getRespuesta3().equals(exa.getRespueCorrec1()))
                    calificacion = calificacion + 1;
            if(jrRespuesta4.isSelected())
                if(exa.getRespuesta4().equals(exa.getRespueCorrec2()))
                    calificacion = calificacion + 1;
            if(jrRespuesta5.isSelected())
                if(exa.getRespuesta5().equals(exa.getRespueCorrec2()))
                    calificacion = calificacion + 1;
            if(jrRespuesta6.isSelected())
                if(exa.getRespuesta6().equals(exa.getRespueCorrec2()))
                    calificacion = calificacion + 1;
            if(jrRespuesta7.isSelected())
                if(exa.getRespuesta7().equals(exa.getRespueCorrec3()))
                    calificacion = calificacion + 1;
            if(jrRespuesta8.isSelected())
                if(exa.getRespuesta8().equals(exa.getRespueCorrec3()))
                    calificacion = calificacion + 1;
            if(jrRespuesta9.isSelected())
                if(exa.getRespuesta9().equals(exa.getRespueCorrec3()))
                    calificacion = calificacion + 1;
            if(jrRespuesta10.isSelected())
                if(exa.getRespuesta10().equals(exa.getRespueCorrec4()))
                    calificacion = calificacion + 1;
            if(jrRespuesta11.isSelected())
                if(exa.getRespuesta11().equals(exa.getRespueCorrec4()))
                    calificacion = calificacion + 1;
            if(jrRespuesta12.isSelected())
                if(exa.getRespuesta12().equals(exa.getRespueCorrec4()))
                    calificacion = calificacion + 1;
            if(jrRespuesta13.isSelected())
                if(exa.getRespuesta13().equals(exa.getRespueCorrec5()))
                    calificacion = calificacion + 1;
            if(jrRespuesta14.isSelected())
                if(exa.getRespuesta14().equals(exa.getRespueCorrec5()))
                    calificacion = calificacion + 1;
            if(jrRespuesta15.isSelected())
                if(exa.getRespuesta15().equals(exa.getRespueCorrec5()))
                    calificacion = calificacion + 1;
            if(jrRespuesta16.isSelected())
                if(exa.getRespuesta16().equals(exa.getRespueCorrec6()))
                    calificacion = calificacion + 1;
            if(jrRespuesta17.isSelected())
                if(exa.getRespuesta17().equals(exa.getRespueCorrec6()))
                    calificacion = calificacion + 1;
            if(jrRespuesta18.isSelected())
                if(exa.getRespuesta18().equals(exa.getRespueCorrec6()))
                    calificacion = calificacion + 1;
            if(jrRespuesta19.isSelected())
                if(exa.getRespuesta19().equals(exa.getRespueCorrec7()))
                    calificacion = calificacion + 1;
            if(jrRespuesta20.isSelected())
                if(exa.getRespuesta20().equals(exa.getRespueCorrec7()))
                    calificacion = calificacion + 1;
            if(jrRespuesta21.isSelected())
                if(exa.getRespuesta21().equals(exa.getRespueCorrec7()))
                    calificacion = calificacion + 1;
            if(jrRespuesta22.isSelected())
                if(exa.getRespuesta22().equals(exa.getRespueCorrec8()))
                    calificacion = calificacion + 1;
            if(jrRespuesta23.isSelected())
                if(exa.getRespuesta23().equals(exa.getRespueCorrec8()))
                    calificacion = calificacion + 1;
            if(jrRespuesta24.isSelected())
                if(exa.getRespuesta24().equals(exa.getRespueCorrec8()))
                    calificacion = calificacion + 1;
            if(jrRespuesta25.isSelected())
                if(exa.getRespuesta25().equals(exa.getRespueCorrec9()))
                    calificacion = calificacion + 1;
            if(jrRespuesta26.isSelected())
                if(exa.getRespuesta26().equals(exa.getRespueCorrec9()))
                    calificacion = calificacion + 1;
            if(jrRespuesta27.isSelected())
                if(exa.getRespuesta27().equals(exa.getRespueCorrec9()))
                    calificacion = calificacion + 1;
            if(jrRespuesta28.isSelected())
                if(exa.getRespuesta28().equals(exa.getRespueCorrec10()))
                    calificacion = calificacion + 1;
            if(jrRespuesta29.isSelected())
                if(exa.getRespuesta29().equals(exa.getRespueCorrec10()))
                    calificacion = calificacion + 1;
            if(jrRespuesta30.isSelected())
                if(exa.getRespuesta30().equals(exa.getRespueCorrec10()))
                    calificacion = calificacion + 1;
            alum.setNombreAlu(Alum.getNombre());
            alum.setNumeroBoleta(Alum.getBoleta());
            alum.setTituExa(jlTitulo.getText());
            alum.setCalificación(calificacion);
            //guardo = cal.ValiCal(alum);
            cal.AgregarCal(alum);
            //if(guardo == true){
            cal.actualizar();
                JOptionPane.showMessageDialog(null, "Calificación guardada:  " + calificacion);
            //}
            //else
              //  JOptionPane.showMessageDialog(null, "No puedes volver a contestar el examen" );
        }
    }
}






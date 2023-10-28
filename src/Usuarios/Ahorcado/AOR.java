package Usuarios.Ahorcado;
import Administrador.GrafiLoginAdm;
import Usuarios.LoginRegistro.GraficoLogin;
import Usuarios.principalUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AOR extends JFrame implements ActionListener {

    private JButton btnIniciar;
    private JButton btnReiniciar;
    private JLabel bole;
    private JButton salir;
    private JButton minimizar;
    private JButton atras;
    private JTextPane txtpanel[]= new JTextPane[1];
    private JLabel lbl[] = new JLabel[6];
    private JButton boton[] = new JButton[28];
    private ImageIcon imagenes[] = new ImageIcon[6];
    private String palabra[]= new String[7];
    private String restan[];
    private JButton volver;
    public int generar, errores=0, intentos=6, punteo=0;
    JLabel fondo, lblGlass;

    public  AOR (int numBo){
        bole = new JLabel(String.valueOf(numBo));
        setLayout(null);
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setResizable(false);
        accionesVentana();
        setUndecorated(true);
        conjunta();
        inicio();
        eC();
        
        btnIniciar= new JButton("Iniciar");
        btnIniciar.setBounds(30, 40, 75, 40);
        add(btnIniciar);
        btnIniciar.setVisible(false);
        btnIniciar.addActionListener(this);

        btnReiniciar= new JButton("Nueva Palabra");
        btnReiniciar.setBounds(217, 100, 175, 60);
        this.add(btnReiniciar);
        btnReiniciar.addActionListener(this);
        
        salir= new JButton("Puntaje");
        salir.setBounds(690, 505, 150, 40);
        add(salir);
        salir.addActionListener(this);
        fondo();
        setVisible(true);
    }

    public void conjunta(){
        imgs();
        botoness();
        lbls();
        txtpane();
        words();
    }
    public void accionesVentana(int numBo){
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
                int numBo;
                numBo = Integer.parseInt(bole.getText());
                new principalUser(numBo);
            }
        });
    }

    public void botoness(){
        for (int i = 0; i < 28; i++) {
            boton[i]= new JButton();

        }
        boton[1]= new JButton("A"); //bien
        boton[1].setBounds(102, 465, 45, 40);
        add(boton[1]);

        boton[2]= new JButton("B");
        boton[2].setBounds(165, 465, 45, 40);
        add(boton[2]);

        boton[3]= new JButton("C");
        boton[3].setBounds(235, 465, 45, 40);
        add(boton[3]);

        boton[4]= new JButton("D");
        boton[4].setBounds(306, 465, 45, 40);
        add(boton[4]);

        boton[5]= new JButton("E");
        boton[5].setBounds(378, 465, 45, 40);
        add(boton[5]);

        boton[6]= new JButton("F");
        boton[6].setBounds(452, 465, 45, 40);
        add(boton[6]);

        boton[7]= new JButton("G");
        boton[7].setBounds(520, 465, 45, 40);
        add(boton[7]);

        boton[8]= new JButton("H");
        boton[8].setBounds(585, 465, 45, 40);
        add(boton[8]);

        boton[9]= new JButton("I"); // inicia relacion a A
        boton[9].setBounds(37, 530, 45, 40);
        add(boton[9]);

        boton[10]= new JButton("J");
        boton[10].setBounds(102, 530, 45, 40);
        add(boton[10]);

        boton[11]= new JButton("K");
        boton[11].setBounds(165, 530, 45, 40);
        add(boton[11]);

        boton[12]= new JButton("L");
        boton[12].setBounds(235, 530, 45, 40);
        add(boton[12]);

        boton[13]= new JButton("M");
        boton[13].setBounds(306, 530, 45, 40);
        add(boton[13]);

        boton[14]= new JButton("N");
        boton[14].setBounds(378, 530, 45, 40);
        add(boton[14]);

        boton[15]= new JButton("O");
        boton[15].setBounds(452, 530, 45, 40);
        add(boton[15]);

        boton[16]= new JButton("P");
        boton[16].setBounds(520, 530, 45, 40);
        add(boton[16]);

        boton[17]= new JButton("Q");
        boton[17].setBounds(585, 530, 45, 40);
        add(boton[17]);

        boton[18]= new JButton("R");
        boton[18].setBounds(37, 593, 45, 40);
        add(boton[18]);

        boton[19]= new JButton("S");
        boton[19].setBounds(102, 593, 45, 40);
        add(boton[19]);

        boton[20]= new JButton("T");
        boton[20].setBounds(165, 593, 45, 40);
        add(boton[20]);

        boton[21]= new JButton("U");
        boton[21].setBounds(235, 593, 45, 40);
        add(boton[21]);

        boton[22]= new JButton("V");
        boton[22].setBounds(306, 593, 45, 40);
        add(boton[22]);

        boton[23]= new JButton("W");
        boton[23].setBounds(378, 593, 45, 40);
        add(boton[23]);

        boton[24]= new JButton("X");
        boton[24].setBounds(452, 593, 45, 40);
        add(boton[24]);

        boton[25]= new JButton("Y");
        boton[25].setBounds(520, 593, 45, 40);
        add(boton[25]);

        boton[26]= new JButton("Z");
        boton[26].setBounds(585, 530, 45, 40);
        add(boton[26]);

        boton[27]= new JButton("P I S T A");
        boton[27].setBounds(217, 330, 175, 60);
        add(boton[27]);
    }

    public void imgs(){

        imagenes[0]= new ImageIcon("src/Usuarios/Ahorcado/imgs/a1.jpg");
        imagenes[1]= new ImageIcon("src/Usuarios/Ahorcado/imgs/a2.jpg");
        imagenes[2]= new ImageIcon("src/Usuarios/Ahorcado/imgs/a3.jpg");
        imagenes[3]= new ImageIcon("src/Usuarios/Ahorcado/imgs/a4.jpg");
        imagenes[4]= new ImageIcon("src/Usuarios/Ahorcado/imgs/a5.jpg");
        imagenes[5]= new ImageIcon("src/Usuarios/Ahorcado/imgs/a6.jpg");
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

    public void fondo(){
        ImageIcon glass = new ImageIcon("src/Usuarios/imagenesUser/glassbien.png");
        lblGlass= new JLabel();
        lblGlass.setBounds(40, 85, 560, 340);
        lblGlass.setIcon(new ImageIcon(glass.getImage().getScaledInstance(lblGlass.getWidth(), lblGlass.getHeight(), Image.SCALE_SMOOTH)));
        add(lblGlass);

        fondo= new JLabel();
        fondo.setSize(1100, 650);
        add(fondo);
        ImageIcon icon2 = new ImageIcon("src/Usuarios/imagenesUser/amarillo-con-textura.jpg");
        var recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        fondo.setIcon(newIcon);
    }


    public void lbls(){
        lbl[1] = new JLabel("Racha:");
        lbl[1].setBounds(900, 550, 100, 45);
        lbl[1].setOpaque(true);
        this.add(lbl[1]);

        lbl[2]= new JLabel();
        lbl[2].setBounds(700, 85, 360, 345);
        lbl[2].setIcon(imagenes[0]);
        this.add(lbl[2]);

        lbl[3]= new JLabel("Vidas:");
        lbl[3].setBounds(900, 465, 100, 40);
        //lbl[3].setOpaque(true);
        this.add(lbl[3]);

        lbl[4]= new JLabel(" ");
        lbl[4].setBounds(900, 490, 250, 50);
        this.add(lbl[4]);

        lbl[5]= new JLabel(" ");//numero de intentos
        lbl[5].setBounds(900, 580, 90, 45);
        this.add(lbl[5]);
    }

    public void txtpane(){
        txtpanel[0]= new JTextPane();
        txtpanel[0].setBounds(83, 195, 440, 70);
        txtpanel[0].setBackground(Color.cyan);
        txtpanel[0].setFont(new Font("arial black", Font.BOLD, 25));
        txtpanel[0].setEditable(false);
        txtpanel[0].setOpaque(true);
        this.add(txtpanel[0]);
    }

    public void words(){
        palabra[0]= "globalizacion".toUpperCase();
        palabra[1]= "variable ecnomica".toUpperCase();
        palabra[2]= "guerra fria".toUpperCase();
        palabra[3]= "jueves negro".toUpperCase();
        palabra[4]= "milagro mexicano".toUpperCase();
        palabra[5]= "modos de produccion".toUpperCase();
        palabra[6]= "historia contemporanea".toUpperCase();
    }


    public  void inicio(){
        intentos =5;
        errores=0;
        lbl[5].setText(Integer.toString(punteo));
        lbl[4].setText(Integer.toString(intentos));
        lbl[2].setIcon(imagenes[errores]);
        txtpanel[0].setText("");

        for (int i = 0; i < 28; i++) {
            boton[i].setEnabled(true);
        }

        generar = (int)Math.floor(Math.random()* palabra.length);

        String pal[]= palabra[generar].split(" ");
        restan = new String [palabra[generar].length()+1];

        int j=0;
        for (String pall: pal){
            for (int i = 0; i < pall.length(); i++) {
                txtpanel[0].setText(txtpanel[0].getText()+"_ ");
                restan[j++]="_";
            }
            txtpanel[0].setText(txtpanel[0].getText()+"          "); //invertida con N
            restan[j++]= "";
        }

    }

    public void Busqueda(ActionEvent e) {
        JButton bt = (JButton)  e.getSource();
        char c[];
        int guion=0;

        for (int i = 0; i < 28; i++) {
            if (bt== boton[i]){
                c= Character.toChars(64+i);
                if(bt== boton[27]){
                    if(generar ==1){
                        JOptionPane.showMessageDialog(this, "Relacion entre paises");
                    }else if(generar ==2){
                        JOptionPane.showMessageDialog(this,"analisis economico");
                    } else if(generar ==3){
                        JOptionPane.showMessageDialog(this,"guerra sin violencia");
                    }else if(generar==4){
                        JOptionPane.showMessageDialog(this,"golpe bajo a E.U");
                    }
                    else if(generar==5){
                        JOptionPane.showMessageDialog(this,"el México de oro");
                    }
                    else if(generar==6){
                        JOptionPane.showMessageDialog(this,"formas de generar nuevas cosas");
                    }

                }else{

                    boolean esta = false;
                    for (int j = 0; j < palabra[generar].length(); j++) {
                        if(c[0]== palabra[generar].charAt(j)){
                            restan[j]= c[0]+"";
                            esta = true;
                        }
                    }
                    boolean victoria = true;
                    for(String re: restan){
                        if(re.equals("_")){
                            victoria= false;
                            guion++;
                        }
                    }
                    if(esta){
                        punteo +=6;
                        lbl[5].setText(Integer.toString(punteo));
                        txtpanel[0].setText("");
                        for (String re: restan){
                            if(" ".equals(re)){
                                txtpanel[0].setText(txtpanel[0].getText()+ "\n");
                            }else{
                                txtpanel[0].setText(txtpanel[0].getText()+ re +" ");
                            }
                        }
                        if (victoria){
                            JOptionPane.showInputDialog(this, "Ganaste la keyword");
                            inicio();
                            return;
                        }

                    } else{
                        punteo -=2;  //MUCHO OJO
                        lbl[5].setText(Integer.toString(punteo));
                        lbl[2].setIcon(imagenes[++errores]);
                        lbl[4].setText(Integer.toString(--intentos));

                        if(errores==5){
                            JOptionPane.showMessageDialog(this, "AHORCADO, la respuesta correctaa era:" + palabra[generar]);
                            inicio();
                            return;
                        }
                    }
                    bt.setEnabled(false);
                    break;
                }

            }
        }
    }


    public void eC(){
        for (int i = 0; i < 28; i++)
        {
            boton[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Busqueda(e);
                }
            });

        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== btnReiniciar){
            inicio();
        }
        if (e.getSource()==salir){
            JOptionPane.showMessageDialog(this, "tu racha: "+ punteo);
        }
    }


    public static void main(String[] args) {
        AOR kk= new AOR(1);
        kk.setVisible(true);
    }

}


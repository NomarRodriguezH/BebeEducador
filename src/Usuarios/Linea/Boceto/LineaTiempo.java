package Usuarios.Linea.Boceto;

import Usuarios.principalUser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LineaTiempo extends JFrame implements ActionListener{
    
    JButton derecha,izquierda,buscar,opc1,opc2, Salir, volver, salir, minimizar;
    JLabel eti1,eti2,eti3,eti4,flecha1,flecha2,flecha3,selec,bole;
    JLabel i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32,i33,i34,i35,i36;
    String arreglo[];
    JComboBox Fecha;
    String cadenita = "<html>6000 A.N.E.<p>Surgen las primeras comunidades primitivas<html>,"
                                + "<html>5000 A.N.E.<p>Nace el esclavismo en civilizaciones<p>como Egipto o Grecia<html>,"
                                + "<html>476 D.N.E.<p>Caida del Imperio Romano de Occidente.<p>Nace el feudalismo<html>,"
                                + "<html>1453<p>Toma de Constantinopla.<p>Fin del feudalismo<html>,"
                                + "<html>1867<p>Karl Marx publica El Capital con su<p>crítica economica politica<html>,"
                                + "<html>1929<p>La bolsa de valores de Wall Street sufre<p>una caida enorme en sus precios<html>,"
                                + "<html>1939<p>La Alemania Nazi invade Polonia<p>Inicio de la Segunda Guerra Mundial<html>,"
                                + "<html>1941<p>Japon ataca Pearl Harbor.<p>Estados Unidos se une a la guerra<html>,"
                                + "<html>1945<p>Estados Unidos lanza la bomba atómica <p>en Hiroshima.Acaba la Segunda<p> Guerra Mundial<html>,"
                                + "<html>1945<p>24 de octubre:Surge la ONU.<p>27 de diciembre:Surge el FMI<html>,"
                                + "<html>1947<p>5 de junio:Doctrina Truman y plan <p>Marshall.<p><p>30 de octubre:Firma del GATT<html>,"
                                + "<html>1948<p>Bloqueo de Berlín con la contrucción<p>del Muro y la division de<p>Alemania en 2<html>,"
                                + "<html>1950<p>Guerra de Corea resultando los<p>paises individuales de Corea del Norte<p>y Corea del Sur<html>,"
                                + "<html>1955<p>Guerra de Vietnam con la intervencion<p>de soldados estadounidenses<html>,"
                                + "<html>1962<p>Crisis de los Misiles en Cuba<p>mayor momento de tension en la Guerra<p>Fria<html>,"
                                + "<html>1989<p>Caida del Muro de Berlin.<p>Fin de la Guerra Fria<html>,"
                                + "<html>300.000 A.N.E.<p>Surgen los primeros Homo Sapiens Sapiens<html>,"
                                + "<html>Los humanos se empezaron a agrupar<p>hace 12 mil años en<p>comunidades nómadas<html>,"
                                + "<html>9500 A.N.E. aprox.<p>Los humanos descubren la agricultura<html>,"
                                + "<html>4000 A.N.E. aprox.<p>Surgen las primeras grandes civilizaciones<p>de humanos<html>,"
                                + "<html>476 D.N.E.<p>Inicio de la Edad Media tras la caida del<p>Imperio Romano de Occidente<html>,"
                                + "<html>Al surgir las primeras monarquías de <p>Europa se da inicio a un sistema de <p>producción feudal<html>,"
                                + "<html>1154 D.N.E.<p>Inicia la Guerra de 100 años entre Inglaterra<p>y Francia por una disputa feudal<html>,"
                                + "<html>El fin de la Edad Media y la lenta<p>caída del feudalismo llega con la toma<p>de constantinopla en 1453<html>,"
                                + "<html>1918:Fin de la Primera Guerra Mundial<p>1919:Firma del Tratado de Versalles<html>,"
                                + "<html>Estados Unidos ayuda a la recuperación<p>de Europa tras la Guerra<html>,"
                                + "<html>Estados Unidos goza de una economía estable<p>y la gente empieza a gastar mucho dinero<p>en los Felices 20's<html>,"
                                + "<html>El Jueves Negro:La bolsa de valores de <p>Wall Street sufre una caida enorme y el<p>pais entra en una enorme crisis<html>,"
                                + "<html>1939<p>Alemania invade Polonia rompiendo el Tratado<p>de Versalles e iniciando la SGM<html>,"
                                + "<html>1940:Japon e Italia se unen al bloque del <p>Eje<p>1941:EU se une a los Aliados tras el<p>ataque de Pearl Harbor<html>,"
                                + "<html>1944:URSS gana territorio en Alemania<p>Hitler se suicida el 30 de abril<p>Alemania e Italia se rinden<html>,"
                                + "<html>1945:EU lanza 2 bombas atomicas en Japon<p>Japon se rinde y termina la SGM<p>En diciembre se funda la ONU<html>,"
                                + "<html>1947<p>Tras la SGM EU apoya de nuevo a Europa con<p>la doctina Monroe y el Plan Marshall<html>,"
                                + "<html>El mundo se divide en dos sectores<p>Capitalista por parte de EU y<p>Socialista por parte de la URSS<html>,"
                                + "<html>EU y la URSS disputan varios eventos como<p>la guerra de Corea y Vietnam la Crisis de los <p>misiles o la carrera espacial<html>,"
                                + "<html>La URSS se disuelve tras la Perestroika y<p>el mal gobierno de Gorbachov. El Muro de<p>Berlín es derrumbado en 1989 terminando<p>la guerra<html>,";
    
    int cuenta = 0;
    String fechaSelec = "";
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
    ImageIcon im1,im2,im3,im4,im5,im6,im7,im8,im9,im10,im11,im12,im13,im14,im15,im16,im17,im18,im19 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Agricultura.jpg"),im20,im21,im22,im23,im24,im25,im26,im27,im28,im29,im30,im31,im32,im33,im34,im35,im36;
    JLabel fondo;
    
    public LineaTiempo(int numBo){
        accionesVentana();
        conf();
        comp(numBo);
        setVisible(true);
    }
    
    public void conf(){
        setLayout(null);
        setBounds(10, 120, 1100, 650);
        setResizable(false);
        setUndecorated(true);
        setTitle("Linea del tiempo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.CYAN);
/*
        this.fondo = new JLabel();
        this.fondo.setSize(1100, 650);
        this.add(this.fondo);
        ImageIcon icon2 = new ImageIcon("");
        Image recu = icon2.getImage();
        Image img = (new ImageIcon(recu)).getImage();
        Image newImg = img.getScaledInstance(1100, 650, 4);
        ImageIcon newIcon = new ImageIcon(newImg);
        this.fondo.setIcon(newIcon);

 */
        
    }
    public void accionesVentana(){
        salir = new JButton();
        salir.setBounds(25, 20, 30, 30);
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
        minimizar.setBounds(25, 70, 30, 30);
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
        volver.setBounds(25, 130, 30, 30);
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
                int numBo = Integer.parseInt(bole.getText());
                new principalUser(numBo);
            }

        });
    }
    
    public void comp(int numBo){

        bole = new JLabel(String.valueOf(numBo));
        arreglo = new String [35];
        arreglo = cadenita.split(",");
        
        i1 = new JLabel();
        i1.setBounds(480, 118, 180, 140);
        im1 = new ImageIcon("src/Usuarios/Linea/ImgLinea/ComunidadPrimitiva.jpg");
        i1.setIcon(im1);
        Image recu1 = im1.getImage();
        Image img1 = (new ImageIcon(recu1)).getImage();
        Image newImage1 = img1.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon1 = new ImageIcon(newImage1);
        i1.setIcon(newicon1);
        add(i1);
        i1.setVisible(false);
        
        i2 = new JLabel();
        i2.setBounds(650, 490, 180, 140);
        im2 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Esclavismo.jpg");
        i2.setIcon(im2);
        Image recu2 = im2.getImage();
        Image img2 = (new ImageIcon(recu2)).getImage();
        Image newImage2 = img2.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon2 = new ImageIcon(newImage2);
        i2.setIcon(newicon2);
        add(i2);
        i2.setVisible(false);
        
        i3 = new JLabel();
        i3.setBounds(1010, 118, 180, 140);
        im3 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Feudalismo.jpg");
        i3.setIcon(im3);
        Image recu3 = im3.getImage();
        Image img3 = (new ImageIcon(recu3)).getImage();
        Image newImage3 = img3.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon3 = new ImageIcon(newImage3);
        i3.setIcon(newicon3);
        add(i3);
        i3.setVisible(false);
        
        i4 = new JLabel();
        i4.setBounds(1120, 490, 180, 140);
        im4 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Constantinopla.jpg");
        i4.setIcon(im4);
        Image recu4 = im4.getImage();
        Image img4 = (new ImageIcon(recu4)).getImage();
        Image newImage4 = img4.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon4 = new ImageIcon(newImage4);
        i4.setIcon(newicon4);
        add(i4);
        i4.setVisible(false);
        
        i5 = new JLabel();
        i5.setBounds(480, 118, 180, 140);
        im5 = new ImageIcon("src/Usuarios/Linea/ImgLinea/KarlMarx.jpg");
        i5.setIcon(im5);
        Image recu5 = im5.getImage();
        Image img5 = (new ImageIcon(recu5)).getImage();
        Image newImage5 = img5.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon5 = new ImageIcon(newImage5);
        i5.setIcon(newicon5);
        add(i5);
        i5.setVisible(false);
        
        i6 = new JLabel();
        i6.setBounds(650, 490, 180, 140);
        im6 = new ImageIcon("src/Usuarios/Linea/ImgLinea/crisis29.jpg");
        i6.setIcon(im6);
        Image recu6 = im6.getImage();
        Image img6 = (new ImageIcon(recu6)).getImage();
        Image newImage6 = img6.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon6 = new ImageIcon(newImage6);
        i6.setIcon(newicon6);
        add(i6);
        i6.setVisible(false);
        
        i7 = new JLabel();
        i7.setBounds(1010, 118, 180, 140);
        im7 = new ImageIcon("src/Usuarios/Linea/ImgLinea/SGMinicio.jpg");
        i7.setIcon(im7);
        Image recu7 = im7.getImage();
        Image img7 = (new ImageIcon(recu7)).getImage();
        Image newImage7 = img7.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon7 = new ImageIcon(newImage7);
        i7.setIcon(newicon7);
        add(i7);
        i7.setVisible(false);
        
        i8 = new JLabel();
        i8.setBounds(1120, 490, 180, 140);
        im8 = new ImageIcon("src/Usuarios/Linea/ImgLinea/PearlHarbor.jpeg");
        i8.setIcon(im8);
        Image recu8 = im8.getImage();
        Image img8 = (new ImageIcon(recu8)).getImage();
        Image newImage8 = img8.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon8 = new ImageIcon(newImage8);
        i8.setIcon(newicon8);
        add(i8);
        i8.setVisible(false);
        
        i9 = new JLabel();
        i9.setBounds(480, 118, 180, 140);
        im9 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Hiroshima.jpg");
        i9.setIcon(im9);
        Image recu9 = im9.getImage();
        Image img9 = (new ImageIcon(recu9)).getImage();
        Image newImage9 = img9.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon9 = new ImageIcon(newImage9);
        i9.setIcon(newicon9);
        add(i9);
        i9.setVisible(false);
        
        i10 = new JLabel();
        i10.setBounds(650, 490, 180, 140);
        im10 = new ImageIcon("src/Usuarios/Linea/ImgLinea/ONU.jpg");
        i10.setIcon(im10);
        Image recu10 = im10.getImage();
        Image img10 = (new ImageIcon(recu10)).getImage();
        Image newImage10 = img10.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon10 = new ImageIcon(newImage10);
        i10.setIcon(newicon10);
        add(i10);
        i10.setVisible(false);
        
        i11 = new JLabel();
        i11.setBounds(1010, 118, 180, 140);
        im11 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Truman.jpg");
        i11.setIcon(im11);
        Image recu11 = im11.getImage();
        Image img11 = (new ImageIcon(recu11)).getImage();
        Image newImage11 = img11.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon11 = new ImageIcon(newImage11);
        i11.setIcon(newicon11);
        add(i11);
        i11.setVisible(false);
        
        i12 = new JLabel();
        i12.setBounds(1120, 490, 180, 140);
        im12 = new ImageIcon("src/Usuarios/Linea/ImgLinea/MuroBerlin.jpg");
        i12.setIcon(im12);
        Image recu12 = im12.getImage();
        Image img12 = (new ImageIcon(recu12)).getImage();
        Image newImage12 = img12.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon12 = new ImageIcon(newImage12);
        i12.setIcon(newicon12);
        add(i12);
        i12.setVisible(false);
        
        i13 = new JLabel();
        i13.setBounds(10, 118, 180, 140);
        im13 = new ImageIcon("src/Usuarios/Linea/ImgLinea/GuerraCorea.jpg");
        i13.setIcon(im13);
        Image recu13 = im13.getImage();
        Image img13 = (new ImageIcon(recu13)).getImage();
        Image newImage13 = img13.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon13 = new ImageIcon(newImage13);
        i13.setIcon(newicon13);
        add(i13);
        i13.setVisible(false);
        
        i14 = new JLabel();
        i14.setBounds(110, 510, 180, 140);
        im14 = new ImageIcon("src/Usuarios/Linea/ImgLinea/GuerraVietnam.jpg");
        i14.setIcon(im14);
        Image recu14 = im14.getImage();
        Image img14 = (new ImageIcon(recu14)).getImage();
        Image newImage14 = img14.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon14 = new ImageIcon(newImage14);
        i14.setIcon(newicon14);
        add(i14);
        i14.setVisible(false);
        
        i15 = new JLabel();
        i15.setBounds(750, 118, 180, 140);
        im15 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Misiles.jpg");
        i15.setIcon(im15);
        Image recu15 = im15.getImage();
        Image img15 = (new ImageIcon(recu15)).getImage();
        Image newImage15 = img15.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon15 = new ImageIcon(newImage15);
        i15.setIcon(newicon15);
        add(i15);
        i15.setVisible(false);
        
        i16 = new JLabel();
        i16.setBounds(800, 510, 180, 140);
        im16 = new ImageIcon("src/Usuarios/Linea/ImgLinea/FinGuerra.jpg");
        i16.setIcon(im16);
        Image recu16 = im16.getImage();
        Image img16 = (new ImageIcon(recu16)).getImage();
        Image newImage16 = img16.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon16 = new ImageIcon(newImage16);
        i16.setIcon(newicon16);
        add(i16);
        i16.setVisible(false);
        
        i17 = new JLabel();
        i17.setBounds(480, 118, 180, 140);
        im17 = new ImageIcon("src/Usuarios/Linea/ImgLinea/HomoSapiens.jpg");
        i17.setIcon(im17);
        Image recu17 = im17.getImage();
        Image img17 = (new ImageIcon(recu17)).getImage();
        Image newImage17 = img17.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon17 = new ImageIcon(newImage17);
        i17.setIcon(newicon17);
        add(i17);
        i17.setVisible(false);
        
        i18 = new JLabel();
        i18.setBounds(650, 490, 180, 140);
        im18 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Nomadas.jpg");
        i18.setIcon(im18);
        Image recu18 = im18.getImage();
        Image img18 = (new ImageIcon(recu18)).getImage();
        Image newImage18 = img18.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon18 = new ImageIcon(newImage18);
        i18.setIcon(newicon18);
        add(i18);
        i18.setVisible(false);
        
        i19 = new JLabel();
        i19.setBounds(1010, 118, 180, 140);
        im19 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Agricultura.jpg");
        i19.setIcon(im19);
        Image recu19 = im19.getImage();
        Image img19 = (new ImageIcon(recu19)).getImage();
        Image newImage19 = img19.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon19 = new ImageIcon(newImage19);
        i19.setIcon(newicon19);
        add(i19);
        i19.setVisible(false);
        
        i20 = new JLabel();
        i20.setBounds(1120, 490, 180, 140);
        im20 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Mesopotamia.jpg");
        i20.setIcon(im20);
        Image recu20 = im20.getImage();
        Image img20 = (new ImageIcon(recu20)).getImage();
        Image newImage20 = img20.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon20 = new ImageIcon(newImage20);
        i20.setIcon(newicon20);
        add(i20);
        i20.setVisible(false);
        
        i21 = new JLabel();
        i21.setBounds(480, 118, 180, 140);
        im21 = new ImageIcon("src/Usuarios/Linea/ImgLinea/EdadMedia.jpg");
        i21.setIcon(im21);
        Image recu21 = im21.getImage();
        Image img21 = (new ImageIcon(recu21)).getImage();
        Image newImage21 = img21.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon21 = new ImageIcon(newImage21);
        i21.setIcon(newicon21);
        add(i21);
        i21.setVisible(false);
        
        i22 = new JLabel();
        i22.setBounds(650, 490, 180, 140);
        im22 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Feudalismo2.jpg");
        i22.setIcon(im22);
        Image recu22 = im22.getImage();
        Image img22 = (new ImageIcon(recu22)).getImage();
        Image newImage22 = img22.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon22 = new ImageIcon(newImage22);
        i22.setIcon(newicon22);
        add(i22);
        i22.setVisible(false);
        
        i23 = new JLabel();
        i23.setBounds(1010, 118, 180, 140);
        im23 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Guerra100.jpg");
        i23.setIcon(im23);
        Image recu23 = im23.getImage();
        Image img23 = (new ImageIcon(recu23)).getImage();
        Image newImage23 = img23.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon23 = new ImageIcon(newImage23);
        i23.setIcon(newicon23);
        add(i23);
        i23.setVisible(false);
        
        i24 = new JLabel();
        i24.setBounds(1120, 490, 180, 140);
        im24 = new ImageIcon("src/Usuarios/Linea/ImgLinea/FinEdadMedia.jpg");
        i24.setIcon(im24);
        Image recu24 = im24.getImage();
        Image img24 = (new ImageIcon(recu24)).getImage();
        Image newImage24 = img24.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon24 = new ImageIcon(newImage24);
        i24.setIcon(newicon24);
        add(i24);
        i24.setVisible(false);
        
        i25 = new JLabel();
        i25.setBounds(480, 118, 180, 140);
        im25 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Versalles.jpg");
        i25.setIcon(im25);
        Image recu25 = im25.getImage();
        Image img25 = (new ImageIcon(recu25)).getImage();
        Image newImage25 = img25.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon25 = new ImageIcon(newImage25);
        i25.setIcon(newicon25);
        add(i25);
        i25.setVisible(false);
        
        i26 = new JLabel();
        i26.setBounds(650, 490, 180, 140);
        im26 = new ImageIcon("src/Usuarios/Linea/ImgLinea/EU.jpg");
        i26.setIcon(im26);
        Image recu26 = im26.getImage();
        Image img26 = (new ImageIcon(recu26)).getImage();
        Image newImage26 = img26.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon26 = new ImageIcon(newImage26);
        i26.setIcon(newicon26);
        add(i26);
        i26.setVisible(false);
        
        i27 = new JLabel();
        i27.setBounds(1010, 118, 180, 140);
        im27 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Felices20.jpg");
        i27.setIcon(im27);
        Image recu27 = im27.getImage();
        Image img27 = (new ImageIcon(recu27)).getImage();
        Image newImage27 = img27.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon27 = new ImageIcon(newImage27);
        i27.setIcon(newicon27);
        add(i27);
        i27.setVisible(false);
        
        i28 = new JLabel();
        i28.setBounds(1120, 490, 180, 140);
        im28 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Crisis292.jpg");
        i28.setIcon(im28);
        Image recu28 = im28.getImage();
        Image img28 = (new ImageIcon(recu28)).getImage();
        Image newImage28 = img28.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon28 = new ImageIcon(newImage28);
        i28.setIcon(newicon28);
        add(i28);
        i28.setVisible(false);
        
        i29 = new JLabel();
        i29.setBounds(480, 118, 180, 140);
        im29 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Polonia.jpg");
        i29.setIcon(im29);
        Image recu29 = im29.getImage();
        Image img29 = (new ImageIcon(recu29)).getImage();
        Image newImage29 = img29.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon29 = new ImageIcon(newImage29);
        i29.setIcon(newicon29);
        add(i29);
        i29.setVisible(false);
        
        i30 = new JLabel();
        i30.setBounds(650, 490, 180, 140);
        im30 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Equipos.png");
        i30.setIcon(im30);
        Image recu30 = im30.getImage();
        Image img30 = (new ImageIcon(recu30)).getImage();
        Image newImage30 = img30.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon30 = new ImageIcon(newImage30);
        i30.setIcon(newicon30);
        add(i30);
        i30.setVisible(false);

        
        i31 = new JLabel();
        i31.setBounds(1010, 118, 180, 140);
        im31 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Hitler.jpg");
        i31.setIcon(im31);
        Image recu31 = im31.getImage();
        Image img31 = (new ImageIcon(recu31)).getImage();
        Image newImage31 = img31.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon31 = new ImageIcon(newImage31);
        i31.setIcon(newicon31);
        add(i31);
        i31.setVisible(false);
        
        i32 = new JLabel();
        i32.setBounds(1120, 490, 180, 140);
        im32 = new ImageIcon("C:\\proyectos\\LineaTiempo\\src\\main\\java\\ImgLinea\\FinSGM.jpg");
        i32.setIcon(im32);
        Image recu32 = im32.getImage();
        Image img32 = (new ImageIcon(recu32)).getImage();
        Image newImage32 = img32.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon32 = new ImageIcon(newImage32);
        i32.setIcon(newicon32);
        add(i32);
        i32.setVisible(false);
        
        i33 = new JLabel();
        i33.setBounds(480, 118, 180, 140);
        im33 = new ImageIcon("src/Usuarios/Linea/ImgLinea/Marshall.png");
        i33.setIcon(im33);
        Image recu33 = im33.getImage();
        Image img33 = (new ImageIcon(recu33)).getImage();
        Image newImage33 = img33.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon33 = new ImageIcon(newImage33);
        i33.setIcon(newicon33);
        add(i33);
        i33.setVisible(false);
        
        i34 = new JLabel();
        i34.setBounds(650, 490, 180, 140);
        im34 = new ImageIcon("src/Usuarios/Linea/ImgLinea/GuerraFria.png");
        i34.setIcon(im34);
        Image recu34 = im34.getImage();
        Image img34 = (new ImageIcon(recu34)).getImage();
        Image newImage34 = img34.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon34 = new ImageIcon(newImage34);
        i34.setIcon(newicon34);
        add(i34);
        i34.setVisible(false);
        
        i35 = new JLabel();
        i35.setBounds(1010, 118, 180, 140);
        im35 = new ImageIcon("src/Usuarios/Linea/ImgLinea/GuerraFria2.jpg");
        i35.setIcon(im35);
        Image recu35 = im35.getImage();
        Image img35 = (new ImageIcon(recu35)).getImage();
        Image newImage35 = img35.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon35 = new ImageIcon(newImage35);
        i35.setIcon(newicon35);
        add(i35);
        i35.setVisible(false);
        
        i36 = new JLabel();
        i36.setBounds(1120, 490, 180, 140);
        im36 = new ImageIcon("src/Usuarios/Linea/ImgLinea/CaidaMuro.jpg");
        i36.setIcon(im36);
        Image recu36 = im36.getImage();
        Image img36 = (new ImageIcon(recu36)).getImage();
        Image newImage36 = img36.getScaledInstance(180, 140, Image.SCALE_SMOOTH);
        ImageIcon newicon36 = new ImageIcon(newImage36);
        i36.setIcon(newicon36);
        add(i36);
        i36.setVisible(false);
        
        opc1 = new JButton("Desplazar manualmente");
        opc1.setBounds(250, 30, 250, 50);
        opc1.addActionListener(this);
        add(opc1);
        
        opc2 = new JButton("Desplazar con eventos");
        opc2.setBounds(820, 30, 250, 50);
        opc2.addActionListener(this);
        add(opc2);
        
        Fecha = new JComboBox(new String[]{"Comunidad primitiva","Feudalismo","Crisis del 29","Segunda Guerra Mundial","Guerra Fria","Ninguno"});
        Fecha.setBounds(620, 30, 300, 50);
        Fecha.setVisible(false);
        add(Fecha);
        
        selec = new JLabel();
        selec.setBounds(450, 30, 140, 50);
        selec.setText("Selecciona un evento:");
        selec.setVisible(false);
        add(selec);
        
        buscar = new JButton("buscar");
        buscar.setBounds(1000, 22, 90, 50);
        buscar.addActionListener(this);
        buscar.setVisible(false);
        add(buscar);
        
        izquierda = new JButton("izquierda");
        izquierda.setBounds(10,320,90,50);
        izquierda.addActionListener(this);
        izquierda.setEnabled(false);
        izquierda.setVisible(false);
        add(izquierda);
            
        derecha = new JButton("derecha");
        derecha.setBounds(1300,320,90,50);
        derecha.addActionListener(this);
        derecha.setVisible(false);
        add(derecha);
        
        eti1 = new JLabel();
        eti1.setBounds(205,100,360,170);
        eti1.setText(arreglo[0]);
        eti1.setIcon(icon1);
        add(eti1);
            
        eti2 = new JLabel();
        eti2.setBounds(410,480,360,170);
        eti2.setText(arreglo[1]);
        eti2.setIcon(icon2);
        add(eti2);
            
        eti3 = new JLabel();
        eti3.setBounds(710,100,360,170);
        eti3.setText(arreglo[2]);
        add(eti3);
        
        eti4 = new JLabel();
        eti4.setBounds(870,480,360,170);
        eti4.setText(arreglo[3]);
        add(eti4);
        
        flecha1 = new JLabel();
        flecha1.setBounds(30,150,1400,450);
        icon1 = new ImageIcon("");
        Image imgfl1 = icon1.getImage();
        Image newImagefl1 = imgfl1.getScaledInstance(1400, 450, Image.SCALE_SMOOTH);
        ImageIcon newiconfl1 = new ImageIcon(newImagefl1);
        flecha1.setIcon(newiconfl1);
        add(flecha1);
        
        flecha2 = new JLabel();
        flecha2.setBounds(150,150,1100,450);
        icon2 = new ImageIcon("src/Usuarios/Linea/Boceto/flechamitad.png");
        Image imgfl2 = icon2.getImage();
        Image newImagefl2 = imgfl2.getScaledInstance(1100, 450, Image.SCALE_SMOOTH);
        ImageIcon newiconfl2 = new ImageIcon(newImagefl2);
        flecha2.setIcon(newiconfl2);
        add(flecha2);
        flecha2.setVisible(false);
        
        flecha3 = new JLabel();
        flecha3.setBounds(150,170,1100,400);
        icon3 = new ImageIcon("src/Usuarios/Linea/Boceto/flechafinal.png");
        Image imgfl3 = icon3.getImage();
        Image newImagefl3 = imgfl3.getScaledInstance(1100, 400, Image.SCALE_SMOOTH);
        ImageIcon newiconfl3 = new ImageIcon(newImagefl3);
        flecha3.setIcon(newiconfl3);
        add(flecha3);
        flecha3.setVisible(false);
        
        setSize(1500, 400);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String btntipo = e.getActionCommand();
        if(btntipo.equals("Desplazar manualmente")){
        derecha.setVisible(true);
        izquierda.setVisible(true);
        cuenta = 0;
        Fecha.setVisible(false);
        selec.setVisible(false);
        buscar.setVisible(false);
        opc2.setEnabled(false);
        opc1.setText("Regresar");
        i1.setVisible(true);
            i2.setVisible(true);
            i3.setVisible(true);
            i4.setVisible(true);
            i1.setBounds(480, 118, 180, 140);
            i2.setBounds(650, 490, 180, 140);
            i3.setBounds(1010, 118, 180, 140);
            i4.setBounds(1120, 490, 180, 140);
        }
        
        if(btntipo.equals("derecha")) 
            cuenta = cuenta + 1;
        
        if(btntipo.equals("izquierda"))
            cuenta = cuenta -1;
       
        if(cuenta==0){
            flecha1.setVisible(true);
            flecha2.setVisible(false);
            flecha3.setVisible(false);
            izquierda.setEnabled(false);
            derecha.setEnabled(true);
            eti1.setText(arreglo[0]);
            eti2.setText(arreglo[1]);
            eti3.setText(arreglo[2]);
            eti4.setText(arreglo[3]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
            i1.setVisible(true);
            i2.setVisible(true);
            i3.setVisible(true);
            i4.setVisible(true);
            i1.setBounds(480, 118, 180, 140);
            i2.setBounds(650, 490, 180, 140);
            i3.setBounds(1010, 118, 180, 140);
            i4.setBounds(1120, 490, 180, 140);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
            
        }

        if(cuenta==1){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[1]);
            eti2.setText(arreglo[2]);
            eti3.setText(arreglo[3]);
            eti4.setText(arreglo[4]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(true);
            i3.setVisible(true);
            i4.setVisible(true);
            i5.setVisible(true);
            i2.setBounds(480, 118, 180, 140);
            i3.setBounds(650, 490, 180, 140);
            i4.setBounds(1010, 118, 180, 140);
            i5.setBounds(1120, 490, 180, 140);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==2){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[2]);
            eti2.setText(arreglo[3]);
            eti3.setText(arreglo[4]);
            eti4.setText(arreglo[5]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(true);
            i4.setVisible(true);
            i5.setVisible(true);
            i6.setVisible(true);
            i3.setBounds(480, 118, 180, 140);
            i4.setBounds(650, 490, 180, 140);
            i5.setBounds(1010, 118, 180, 140);
            i6.setBounds(1120, 490, 180, 140);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==3){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[3]);
            eti2.setText(arreglo[4]);
            eti3.setText(arreglo[5]);
            eti4.setText(arreglo[6]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(true);
            i5.setVisible(true);
            i6.setVisible(true);
            i7.setVisible(true);
            i4.setBounds(480, 118, 180, 140);
            i5.setBounds(650, 490, 180, 140);
            i6.setBounds(1010, 118, 180, 140);
            i7.setBounds(1120, 490, 180, 140);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==4){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[4]);
            eti2.setText(arreglo[5]);
            eti3.setText(arreglo[6]);
            eti4.setText(arreglo[7]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(true);
            i6.setVisible(true);
            i7.setVisible(true);
            i8.setVisible(true);
            i5.setBounds(480, 118, 180, 140);
            i6.setBounds(650, 490, 180, 140);
            i7.setBounds(1010, 118, 180, 140);
            i8.setBounds(1120, 490, 180, 140);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==5){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[5]);
            eti2.setText(arreglo[6]);
            eti3.setText(arreglo[7]);
            eti4.setText(arreglo[8]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(true);
            i7.setVisible(true);
            i8.setVisible(true);
            i9.setVisible(true);
            i6.setBounds(480, 118, 180, 140);
            i7.setBounds(650, 490, 180, 140);
            i8.setBounds(1010, 118, 180, 140);
            i9.setBounds(1120, 490, 180, 140);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==6){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[6]);
            eti2.setText(arreglo[7]);
            eti3.setText(arreglo[8]);
            eti4.setText(arreglo[9]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(true);
            i8.setVisible(true);
            i9.setVisible(true);
            i10.setVisible(true);
            i7.setBounds(480, 118, 180, 140);
            i8.setBounds(650, 490, 180, 140);
            i9.setBounds(1010, 118, 180, 140);
            i10.setBounds(1120, 490, 180, 140);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==7){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[7]);
            eti2.setText(arreglo[8]);
            eti3.setText(arreglo[9]);
            eti4.setText(arreglo[10]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(true);
            i9.setVisible(true);
            i10.setVisible(true);
            i11.setVisible(true);
            i8.setBounds(480, 118, 180, 140);
            i9.setBounds(650, 490, 180, 140);
            i10.setBounds(1010, 118, 180, 140);
            i11.setBounds(1120, 490, 180, 140);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==8){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[8]);
            eti2.setText(arreglo[9]);
            eti3.setText(arreglo[10]);
            eti4.setText(arreglo[11]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(true);
            i10.setVisible(true);
            i11.setVisible(true);
            i12.setVisible(true);
            i9.setBounds(480, 118, 180, 140);
            i10.setBounds(650, 490, 180, 140);
            i11.setBounds(1010, 118, 180, 140);
            i12.setBounds(1120, 490, 180, 140);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==9){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[9]);
            eti2.setText(arreglo[10]);
            eti3.setText(arreglo[11]);
            eti4.setText(arreglo[12]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(true);
            i11.setVisible(true);
            i12.setVisible(true);
            i13.setVisible(true);
            i10.setBounds(480, 118, 180, 140);
            i11.setBounds(650, 490, 180, 140);
            i12.setBounds(1010, 118, 180, 140);
            i13.setBounds(1120, 490, 180, 140);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==10){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[10]);
            eti2.setText(arreglo[11]);
            eti3.setText(arreglo[12]);
            eti4.setText(arreglo[13]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(true);
            i12.setVisible(true);
            i13.setVisible(true);
            i14.setVisible(true);
            i11.setBounds(480, 118, 180, 140);
            i12.setBounds(650, 490, 180, 140);
            i13.setBounds(1010, 118, 180, 140);
            i14.setBounds(1120, 490, 180, 140);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==11){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            izquierda.setEnabled(true);
            derecha.setEnabled(true);
            eti1.setText(arreglo[11]);
            eti2.setText(arreglo[12]);
            eti3.setText(arreglo[13]);
            eti4.setText(arreglo[14]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(true);
            i13.setVisible(true);
            i14.setVisible(true);
            i15.setVisible(true);
            i12.setBounds(480, 118, 180, 140);
            i13.setBounds(650, 490, 180, 140);
            i14.setBounds(1010, 118, 180, 140);
            i15.setBounds(1120, 490, 180, 140);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(cuenta==12){
            flecha1.setVisible(false);
            flecha2.setVisible(false);
            flecha3.setVisible(true);
            derecha.setEnabled(false);
            izquierda.setEnabled(true);
            eti1.setText(arreglo[12]);
            eti2.setText(arreglo[13]);
            eti2.setBounds(320, 430, 360, 170);
            eti3.setText(arreglo[14]);
            eti3.setBounds(490, 100, 360, 170);
            eti4.setText(arreglo[15]);
            eti4.setBounds(615, 430, 360, 170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(true);
            i14.setVisible(true);
            i15.setVisible(true);
            i16.setVisible(true);
            i13.setBounds(10, 118, 180, 140);
            i14.setBounds(110, 510, 180, 140);
            i15.setBounds(750, 118, 180, 140);
            i16.setBounds(800, 510, 180, 140);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(btntipo.equals("Desplazar con eventos")){
            Fecha.setVisible(true);
            buscar.setVisible(true);
            selec.setVisible(true);
            opc1.setVisible(false);
            opc2.setVisible(false);
        }
        
        if(btntipo.equals("buscar"))
        fechaSelec = Fecha.getSelectedItem().toString();
        if(fechaSelec.equals("Comunidad primitiva")){
            flecha1.setVisible(true);
            flecha2.setVisible(false);
            flecha3.setVisible(false);
            eti1.setText(arreglo[16]);
            eti2.setText(arreglo[17]);
            eti3.setText(arreglo[18]);
            eti4.setText(arreglo[19]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(true);
            i18.setVisible(true);
            i19.setVisible(true);
            i20.setVisible(true);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(fechaSelec.equals("Feudalismo")){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            eti1.setText(arreglo[20]);
            eti2.setText(arreglo[21]);
            eti3.setText(arreglo[22]);
            eti4.setText(arreglo[23]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(true);
            i22.setVisible(true);
            i23.setVisible(true);
            i24.setVisible(true);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(fechaSelec.equals("Crisis del 29")){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            eti1.setText(arreglo[24]);
            eti2.setText(arreglo[25]);
            eti3.setText(arreglo[26]);
            eti4.setText(arreglo[27]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(true);
            i26.setVisible(true);
            i27.setVisible(true);
            i28.setVisible(true);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(fechaSelec.equals("Segunda Guerra Mundial")){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            eti1.setText(arreglo[28]);
            eti2.setText(arreglo[29]);
            eti3.setText(arreglo[30]);
            eti4.setText(arreglo[31]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
              i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(true);
            i30.setVisible(true);
            i31.setVisible(true);
            i32.setVisible(true);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(fechaSelec.equals("Guerra Fria")){
            flecha1.setVisible(false);
            flecha2.setVisible(true);
            flecha3.setVisible(false);
            eti1.setText(arreglo[32]);
            eti2.setText(arreglo[33]);
            eti3.setText(arreglo[34]);
            eti4.setText(arreglo[35]);
            eti2.setBounds(410,480,360,170);
            eti3.setBounds(710,100,360,170);
            eti4.setBounds(870,480,360,170);
            i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(true);
            i34.setVisible(true);
            i35.setVisible(true);
            i36.setVisible(true);
        }
        
        if(fechaSelec.equals("Ninguno")){
            opc1.setVisible(true);
            opc1.setBounds(50, 30, 150, 50);
            opc1.setText("Regresar");
            i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
        
        if(btntipo.equals("Regresar")){
            opc1.setVisible(true);
            opc1.setText("Desplazar manualmente");
            opc1.setBounds(250, 30, 250, 50);
            opc1.setEnabled(true);
            opc2.setVisible(true);
            opc2.setEnabled(true);
            opc2.setText("Desplazar con eventos");
            Fecha.setVisible(false);
            selec.setVisible(false);
            buscar.setVisible(false);
            derecha.setVisible(false);
            izquierda.setVisible(false);
            i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
            i6.setVisible(false);
            i7.setVisible(false);
            i8.setVisible(false);
            i9.setVisible(false);
            i10.setVisible(false);
            i11.setVisible(false);
            i12.setVisible(false);
            i13.setVisible(false);
            i14.setVisible(false);
            i15.setVisible(false);
            i16.setVisible(false);
            i17.setVisible(false);
            i18.setVisible(false);
            i19.setVisible(false);
            i20.setVisible(false);
            i21.setVisible(false);
            i22.setVisible(false);
            i23.setVisible(false);
            i24.setVisible(false);
            i25.setVisible(false);
            i26.setVisible(false);
            i27.setVisible(false);
            i28.setVisible(false);
            i29.setVisible(false);
            i30.setVisible(false);
            i31.setVisible(false);
            i32.setVisible(false);
            i33.setVisible(false);
            i34.setVisible(false);
            i35.setVisible(false);
            i36.setVisible(false);
        }
    }
    
}


package Administrador.ExamenesAdmin;

import Administrador.CudW.BuscarElegir;
import Usuarios.Examenes.ArrayCalificaciones;
import Usuarios.Examenes.Calificaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DesplegadoE extends JFrame {
    private JLabel fondo;
    private JTable jTTablita;
    JScrollPane jScrollPane1;
    private ArrayCalificaciones exxa;
    ArrayList<Calificaciones> tabla=new ArrayList<Calificaciones>();
    JButton salir, minimizar, volver;

    public DesplegadoE(){
        exxa= new ArrayCalificaciones();
            setSize(1100, 650);
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
                new GesExam();
            }
        });
    }

        public void componentes(){
            jScrollPane1 = new JScrollPane();
            jTTablita = new JTable();

            jTTablita = new JTable(){
                public boolean isCellEditable(int rowIndex,int colIndex){
                    return false;
                }
            };
            jTTablita.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                            "Nombre", "Boleta", "Titulo", "Calificacion"
                    }
            ));
            jTTablita.setFocusable(false);
            jTTablita.setRowHeight(75);
            jTTablita.setRowSelectionAllowed(false);
            jTTablita.getTableHeader().setResizingAllowed(false);
            jTTablita.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(jTTablita);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(90, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
            );


            tabla=  exxa.abrir();
            String matris[][]=new String[tabla.size()][8];

            for(int i=0; i<tabla.size(); i++){
                matris[i][0]=tabla.get(i).getNombreAlu();
                matris[i][1]=String.valueOf(tabla.get(i).getNumeroBoleta());
                matris[i][2]=tabla.get(i).getTituExa();
                matris[i][3]=String.valueOf(tabla.get(i).getCalificación());

            }
            jTTablita.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String [] {
                            "Nombre", "Boleta", "Titulo", "Calificacion"
                    }
            ));


            fondo = new JLabel();
            fondo.setSize(1100, 650);
            add(fondo);
            ImageIcon icon2 = new ImageIcon("src/Administrador/imagenesAdm/fondoazul.jpg");
            var recu = icon2.getImage();
            Image img = new ImageIcon(recu).getImage();
            Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImg);
            fondo.setIcon(newIcon);
        }
}



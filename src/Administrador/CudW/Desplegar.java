package Administrador.CudW;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Desplegar extends JFrame {
    private JLabel fondo;
    private JTable jTTablita;
    private JScrollPane jScrollPane1;
    private ArrayAdmin Admin;
    private JButton volver;
    ArrayList<DA> tabla=new ArrayList<DA>();

    JButton salir, minimizar;

    public Desplegar() {
        Admin = new ArrayAdmin();
        Admin.abrir();
        setLayout(null);
        setSize(1100, 650);
        setUndecorated(true);
        setLocationRelativeTo(null);
        accionesVentana();
        iniciarComponentes();
        setVisible(true);
    }

    public void accionesVentana() {
        salir = new JButton();
        salir.setBounds(1030, 10, 50, 50);
        ImageIcon iconsito = new ImageIcon("src/ActividadIntegradora/Imagenes/BtnSalirF.png");
        salir.setIcon(new ImageIcon(iconsito.getImage().getScaledInstance(salir.getWidth(), salir.getHeight(), Image.SCALE_DEFAULT)));
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
        minimizar.setBounds(930, 10, 50, 50);
        ImageIcon mini = new ImageIcon("src/ActividadIntegradora/Imagenes/minV.png");
        minimizar.setIcon(new ImageIcon(mini.getImage().getScaledInstance(minimizar.getWidth(), minimizar.getHeight(), Image.SCALE_SMOOTH)));
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
                new BuscarElegir();
            }

        });
    }

    public void iniciarComponentes() {
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
                        "Cedula", "Nombre", "Correo", "Materia", "Sexo"
                }
        ));
        jTTablita.setFocusable(false);
        jTTablita.setRowHeight(75);
        jTTablita.setRowSelectionAllowed(false);
        jTTablita.getTableHeader().setResizingAllowed(false);
        jTTablita.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTTablita);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(90, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );


        tabla=  Admin.llamarcli();
        String matris[][]=new String[tabla.size()][5];

        for(int i=0; i<tabla.size(); i++){

            matris[i][0]=String.valueOf(tabla.get(i).getCedula());
            matris[i][1]=tabla.get(i).getNombre();
            matris[i][2]=tabla.get(i).getCorreo();
            matris[i][3]=tabla.get(i).getMateria();
            matris[i][4]=tabla.get(i).getSexo();

        }
        jTTablita.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String [] {
                        "Cedula", "Nombre", "Correo", "Materia", "Sexo"
                }
        ));

        fondo= new JLabel();
        fondo.setBounds(0, 0, 1100, 650);
        add(fondo);
        ImageIcon icon2 = new ImageIcon("src/Usuarios/imagenesUser/fondoazul.jpg");
        Image recu = icon2.getImage();
        Image img = new ImageIcon(recu).getImage();
        Image newImg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        fondo.setIcon(newIcon);
    }
}


